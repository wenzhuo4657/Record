package cn.wenzhuo4657.dailyWeb.domain.agent.graph;

public class Constant {

    private  final  static  String LOGS_NODE_NAME="ReadLogsNode";
    private  final  static  String  NOTIFY_NODE_NAME="NotifyNode";
    private  final  static  String  ANALYZE_LOGS_AGENT_NAME="AnalyzeLogsAgent";
    public static String getLOGS_NODE_NAME(){
        return LOGS_NODE_NAME;
    }
    public static String getNOTIFY_NODE_NAME(){
        return NOTIFY_NODE_NAME;
    }
    public static String getANALYZE_LOGS_AGENT_NAME(){
        return ANALYZE_LOGS_AGENT_NAME;
    }
}
