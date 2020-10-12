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


### Response
#### 数据格式
- 响应行 协议/版本 响应状态码 状态吗描述

响应状态码:

1xx:服务器接收客户端消息，但是没有接收完成

2xx:成功

3xx:重定向 302：重定向  304：访问缓存

4xx:客户端错误  405：请求方式没有对应的doXXX方法

5xx:服务器端错误

- 响应头

1.Content-Type:服务器告诉客户端本次响应体的数据格式和编码格式

2.Content-disposition:客户端以什么格式打开响应体数据
    
   默认值：in-line 在当前页面内打开  attachment;filename=xxx：以附件形式打开响应体，一般用于文件下载

- 响应空行

- 响应体
传输的数据


#### 使用
- 设置响应行
setStatus(int sc)

- 设置响应行
setHeader(String name, String value)

- 设置响应体
    
    1.获取输出流

    2.使用输出流，将数据输出到客户端浏览器
    

- 重定向

    resp.sendRedirect("/02");

- 输出字符

````        
          //获取数据输出流
          PrintWriter pw = resp.getWriter();
          //输出数据
          pw.write("你好，hello response");
````

乱码问题: 编解码使用的字符集不一样
中文的操作系统浏览器默认使用：GBK（gb2312）
我们获取的response对象是tomcat生成的,默认为ISO-8859-1
可以在获取流之前设置一下编码

- 输出字节
    
### 重定向与转发的区别

- 重定向的特点
1. 地址栏发生改变

2. 重定向是两次请求，不能用request对象来共享数据

3. 重定向可以访问其他站点(服务器)的资源

- 转发的特点
1.转发地址栏路径不变

2.转发是一次请求，可以用request对象来共享数据

3. 转发只能访问当前服务器下的资源


### 路径的问题
绝对路径

通过绝对路径可以确认唯一资源  /servlet01
以/开头的路径
规则：
- 给客户端浏览器使用：需要加虚拟目录
建议动态获取虚拟目录  request.getContextPath()
- 给服务器使用：不需要加虚拟目录


相对路径
不以/开头,一般以.开头路径
如./index.html 
规则: ./:当前目录  ../:后退一级目录




 


