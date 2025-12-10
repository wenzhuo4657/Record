package cn.wenzhuo4657.dailyWeb.domain.ItemEdit.strategy;


/**
 * 定义策略处理类型item
 *
 * 初始化
 * 1，field初始化
 *
 * 响应体
 * 2，title解析
 * 3，toExpand返回： 来源是field，但是需要根据类型返回特殊数据，
 *
 *
 * 实现目标是
 * 类型item初始化统一、获取任意item的响应体统一
 *
 * 但是修改field，进行特殊处理，束腰使用方法进行区分隔离处理
 *
 *
 */