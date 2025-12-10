package cn.wenzhuo4657.dailyWeb.infrastructure.adapter.notifier;


import org.springframework.stereotype.Component;

import java.io.File;

/**
 * 使用spring的RestTemplate作为http客户端
 */

public interface ApiService {


    /**
     * 注册邮件通信器
     * @param from  Gmail邮件发送方
     * @param password  应用密码
     * @param to 邮件接口方
     * @return  通信器索引
     */
    long registerCommunicator(String from,String password ,String to);


    /**
     * 发送邮件信息
     * @param communicatorIndex  通信器索引
     * @param title 邮件标题
     * @param content 邮件内容
     * @param file 邮件附件
     * @return 发送结果
     */
    boolean sendInfo(long communicatorIndex,String title,String content, File file);
}
