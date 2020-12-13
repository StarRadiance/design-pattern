责任链模式(Chain of Responsibility Pattern )是将链中每一个节点看作是一个对象，每个节点处理的请求均不同，且内部自动维护一个下一节点
对象。当一个请求从链式的首端发出时，会沿着链的路径依次传递给每一个节点对象，直至有对象处理这个请求为止。属于行为型模式。

原文:Advoid coupling the sender of a reuest to its receiver by giving more than one object a chance to handle the 
request. Chain the receiving objects and pass the request along the chain until an object handles it.

解释:使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象
处理它为止。


优点︰
1、将请求与处理解耦;
2、请求处理者（节点对象）只需关注自己感兴趣的请求进行处理即可，对于不感兴趣的请求，直接转发给下一级节点对象;
3、具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果﹔
4、链路结构灵活，可以通过改变链路结构动态地新增或删减责任;
5、易于扩展新的请求处理类（节点），符合开闭原则。

缺点∶
1、责任链太长或考外理时问,会影响整体性能
2、如果节点对象存在循环引用时，会造成死循环，导致系统崩溃;
