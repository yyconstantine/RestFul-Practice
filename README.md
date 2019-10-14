# RestFul-Practice
---
- 🎈 RestFul API实践
<br>
  - 对GET/POST/PUT/DELETE请求方法的uri演示，实践了RestFul对uri的规范
<br>
- 🍕 全局统一响应结构
<br>
  - 定义全局统一的响应结构，并引入成功/错误的枚举值定义不同的返回，简化了Controller层的代码，并根据结构体的取值(是否为null)返回不同的结果
<br>
- 🥖 全局统一异常处理
<br>
  - 自定义了异常处理，重写错误信息及错误堆栈信息的打印，并在错误处理中进行拦截，返回自定义的处理逻辑
<br>
- 🎲 参数校验及快速返回
<br>
  - 使用Spring Validation，避免Controller冗余业务校验代码，配置检查到错误后直接返回
<br>
- 🍙 Swagger API-Doc
<br>
  - 使用SpringFox Swagger 2.9.2，演示了常用Demo，对接前端更加轻松
<br>