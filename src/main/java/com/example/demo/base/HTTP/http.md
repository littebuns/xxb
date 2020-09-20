### 概述
HTTP: 超文本传输协议

特点：
- 基于TCP/IP 协议  （安全，要三次握手）
- 默认端口：80
- 基于请求/响应模型  一次请求对应一次响应
- 无状态的 每次请求是独立的，不能交互数据

历史版本：
- 1.0 每次请求响应都会建立新的连接
- 1.1. keep-alive 复用连接


### 请求消息数据格式
- 请求行
请求方式 请求url 请求协议/版本
GET /login.html HTTP/1.1

- 请求头
请求头名称：请求头值
Host
User-Agent :浏览器的版本信息 获取该信息来解决浏览器的兼容问题
Accept: 表示可以解析的信息
Accept-Language:支持的语言
Referer:当前请求从哪里来 用于防盗链或统计用

- 请求空行
空行 分割请求头和请求体

- 请求体
用于封装POST请求的请求参数

### Request 对象 
由服务器创建，我们来使用

request继承体系结构：
ServletRequest 接口
    | 继承
HttpServletRequest 接口
    | 实现
RequestFacade    

获取request信息：
- 获取请求行数据：
getMethod
getContextPath  获取虚拟目录
getServletPath
getQueryString
getRequestURI
getProtocol
getRemoteAddr




