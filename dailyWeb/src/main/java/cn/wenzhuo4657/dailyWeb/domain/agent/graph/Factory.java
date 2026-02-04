package cn.wenzhuo4657.dailyWeb.domain.agent.graph;

import cn.wenzhuo4657.dailyWeb.domain.ItemEdit.ItemEditService;
import cn.wenzhuo4657.dailyWeb.domain.agent.graph.ReactAgent.AnalyzeLogsAgent;
import cn.wenzhuo4657.dailyWeb.domain.agent.graph.nodeAction.AnalyzeLogsNode;
import cn.wenzhuo4657.dailyWeb.domain.agent.graph.nodeAction.NotifyNode;
import cn.wenzhuo4657.dailyWeb.domain.agent.graph.nodeAction.ReadLogsNode;
import cn.wenzhuo4657.dailyWeb.domain.notifier.NotifierService;
import com.alibaba.cloud.ai.graph.*;
import com.alibaba.cloud.ai.graph.action.AsyncNodeAction;
import com.alibaba.cloud.ai.graph.checkpoint.config.SaverConfig;
import com.alibaba.cloud.ai.graph.checkpoint.savers.MemorySaver;
import com.alibaba.cloud.ai.graph.exception.GraphStateException;
import opennlp.tools.parser.Cons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.alibaba.cloud.ai.graph.action.AsyncEdgeAction.edge_async;
import static com.alibaba.cloud.ai.graph.action.AsyncNodeAction.node_async;

@Component
public class Factory {



    @Autowired
    private ItemEditService itemEditService;

    @Autowired
    private AnalyzeLogsAgent analyzeLogsAgent;

    @Autowired
    private NotifierService notifierService;



    /**
     * 全局上下文
     * @return
     */
    public static KeyStrategyFactory createKeyStrategyFactory() {
        return ()  -> {
            HashMap<String, KeyStrategy> strategies = new HashMap<>();
            return strategies;
        };
    }

    public  CompiledGraph getCompiledGraph() throws GraphStateException {
        var readLogs = node_async(new ReadLogsNode(itemEditService));
        var analyzeLogs = node_async(new AnalyzeLogsNode(analyzeLogsAgent));
        var notify = node_async(new NotifyNode(notifierService));

        StateGraph workflow = new StateGraph(createKeyStrategyFactory())
                .addNode(Constant.getLOGS_NODE_NAME(), readLogs)
                .addNode(Constant.getANALYZE_LOGS_AGENT_NAME(), analyzeLogs)
                .addNode(Constant.getNOTIFY_NODE_NAME(), notify);

        workflow.addEdge(StateGraph.START, Constant.getLOGS_NODE_NAME());
        workflow.addEdge(Constant.getNOTIFY_NODE_NAME(), StateGraph.END);

        workflow.addConditionalEdges(Constant.getLOGS_NODE_NAME(),
                edge_async( state -> {
                    return (String) state.value("next_node").orElse(StateGraph.END);
                }),
                Map.of(
                        StateGraph.END, StateGraph.END,
                        Constant.getANALYZE_LOGS_AGENT_NAME(), Constant.getANALYZE_LOGS_AGENT_NAME()
                )
                );


        workflow.addConditionalEdges(Constant.getANALYZE_LOGS_AGENT_NAME(),
                edge_async(state -> {
                    return (String) state.value("next_node").orElse(StateGraph.END);
                }),
                Map.of(
                        StateGraph.END, StateGraph.END,
                        Constant.getNOTIFY_NODE_NAME(), Constant.getNOTIFY_NODE_NAME()
                )
        );
        return workflow.compile();
    }
}
