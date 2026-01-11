@echo off

SETLOCAL ENABLEDELAYEDEXPANSION

REM 切换到脚本目录
cd  "C:\working\my-project\dailyWeb-back\.claude\hooks"

REM 从标准输入传递给 npx tsx
REM Windows 下用 type con 来读取 stdin
REM 或者直接让用户手动输入
type con | npx tsx skill-activation-prompt.ts

REM 结束
ENDLOCAL
