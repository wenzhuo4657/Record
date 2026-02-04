package cn.wenzhuo4657.dailyWeb.domain.agent.graph.ReactAgent;

import com.alibaba.cloud.ai.graph.agent.ReactAgent;
import com.alibaba.cloud.ai.graph.checkpoint.savers.MemorySaver;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class AnalyzeLogsAgent {

    @Autowired
    private ChatModel chatModel;


    /**
     * 每一次图的执行都应当是全新的，但是允许用户插入自己的提示词，也就是说，以追加的形式进行
     * 但是为了保证并发，仍然需要穿件多个客户端实例
     *
     *
     *
     * 1，并发： 支持多个用户同时执行图，但是为了避免oom，需要组织类线程池进行，例如10个线程排队执行
     * 2，独立：每一次执行都是互不干涉的，图并不需要上下文，但是允许用户插入自己的解析要求
     *
     * 对外暴露的应该只有一个方法，即excute(message,userPrompt),
     *
     *
     * 并发安全由图保证，此处舍弃组件特性，作为图的一部分组装起来
     *
     *
     *
     *
     *
     */
    String originalPrompt = "你是一个日报分析助手，对于用户的任意对话，";





    public ReactAgent getInstance() {
        ReactAgent agent = ReactAgent.builder()
                .name("日报助手")
                .systemPrompt(originalPrompt)
                .model(chatModel)
                .saver(new MemorySaver())
                .build();
        return agent;
    }






}
