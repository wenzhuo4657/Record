package cn.wenzhuo4657.dailyWeb.api;


import com.alibaba.fastjson2.JSONObject;
import org.junit.Test;

public class JsonTest {



    @Test
    public  void test(){
        String from = "13800138000";
        String password = "123456789";
        String to = "13800138001";
        String string = JSONObject.of("from", from, "password", password, "to", to).toString();
        System.out.println(string);

        string=JSONObject.of("type","gmail","paramsJson",string,"decorators",new String[]{"qps"}).toString();
        System.out.println(string);
    }
}
