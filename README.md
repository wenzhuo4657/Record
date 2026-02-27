
<h1 align="center">FluxFlow</h1>

<p align="center">
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="license">
  <img src="https://img.shields.io/badge/Docker-Supported-blue.svg" alt="docker">
  <img src="https://img.shields.io/badge/AI-Analysis-green.svg" alt="ai">
  <img src="https://img.shields.io/github/stars/wenzhuo4657/FluxFlow?style=flat-square" alt="stars">
</p>

<p align="center">
  <strong>🚀 极简、智能、安全的 AI 驱动型日报记录与分发系统</strong>
</p>

---

## ✨ 核心特性

* 🔗 **GitHub 鉴权** — 绑定 GitHub 账号，告别繁琐的密码管理，实现一键秒速登录。
* 🤖 **AI 深度复盘** — 智能助手自动分析日报，通过 **Telegram / Email** 实时推送核心洞察。
* 📝 **原生 Markdown** — 像写代码一样记录生活，支持标准语法，排版优雅，所见即所得。
* 📦 **数据轻量迁移** — 基于 SQLite 架构，支持一键导出与定时邮件备份，确保数据主权。
* ⚡ **即刻开箱** — 全容器化封装，支持 Docker Compose 一键启动，无需复杂环境配置。
* 🛡️ **金融级防护** — 采用 **双 Token (Access/Refresh)** 验证机制，全方位降低权限泄露风险。

## 🛠️ 快速部署

只需两步，即可在您的服务器上开启 FluxFlow 体验。

1. 克隆项目
```bash
git clone [https://github.com/wenzhuo4657/FluxFlow.git](https://github.com/wenzhuo4657/FluxFlow.git)
cd FluxFlow
```

2. 使用 Docker Compose 启动

```
# 确保您已配置好 ./devops/docker-compose.yml 中的环境变量
docker-compose -f ./devops/docker-compose.yml up -d
```




## 👨‍💻 作者
wenzhuo4657 - 🌍 个人主页: homepage.wz4488.de

📬 联系我: 如果你有任何建议或 Bug 反馈，欢迎提交 Issue。

如果这个项目对你有帮助，请给个 ⭐ Star 支持一下！这也是我持续更新的最大动力。
