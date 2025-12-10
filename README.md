# dailyWeb-back
日报程序后端

# 安装

一键安装脚本

`bash <(curl -fsSL https://raw.githubusercontent.com/wenzhuo4657/dailyNotes-back/main/shell/daily-install.sh)`



<a href="https://test.wenzhuo4657.org/md-web/" target="_blank" rel="noopener noreferrer">演示地址</a>



## 配置
所有的个人配置都放置在`application-prod.yml`当中，请根据实际内容为主
```
domain:
  url:  ${domain:https://test.wenzhuo4657.org}  # 后端地址，用于确定oauth回调地址
  home:  ${domain.url}/md-web    # 回调地址重定向到前端相应页面，后缀改动需要在前端程序更改 "build": "vite build --base=/md-web/ ",以及nginx的location匹配路径

github:
  client-id:  ${GITHUB_CLIENT_ID}  
  client-secret:  ${GITHUB_CLIENT_SECRET}  
  redirect-uri: ${domain.url}/api/oauth/callback/github

email:
  enable: true
  config:
    from: wenzhuo4657@gmail.com
    to: wenzhuo4657@gmail.com
    password: ${GMAIL_PASSWORD}
```
# 数据库

## er图
![](https://cdn.wenzhuo4657.org/img/2025/11/6d314150affa21de2fe0f280fff366a7.png)