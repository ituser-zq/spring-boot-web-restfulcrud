# spring-boot-web-restfulcrud
REST，即Representational State Transfer的缩写。直接翻译的意思是"表现层状态转化"它是一种互联网应用程序的API设计理念：URL定位资源，用HTTP动词（GET,POST,DELETE,DETC）描述操作。

在该项目中模仿类似互联网程序API开发，设计对应需求并进行需求分析
### 表格描述项目开发步骤
|      |  普通CRUD（uri来区分操作）  | RestfulCRUD |
| :-------- | --------:| :--: |
| 查询  | getEmp   |  emp---GET   |
| 添加     |addEmp?xxx |  emp---POST  |
| 修改      | updateEmp?id=xxx&xxx=xx | emp/{id}---PUT  |
| 删除      | deleteEmp?id=1  | emp/{id}---DELETE  |

|实验功能 |请求URI| 请求方式|
| :-------- | --------:| :--: |
|查询所有员工| emps |GET|
|查询某个员工(来到修改页面)| emp/1| GET|
|来到添加页面 |emp |GET|
|添加员工| emp| POST|
|来到修改页面（查出员工进行信息回显）| emp/1| GET|
|修改员工| emp| PUT|
|删除员工 |emp/1| DELETE|

根据请求架构进行项目开发。
