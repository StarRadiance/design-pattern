中介者模式(Mediator Pattern)又称为调解者模式或调停者模式。用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相旦作用，从而使具
耦旨忪队，而且可以独工地改变它们之间的交互。属于行为型模式。

原文:Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects 
from referring to each other explicitly, and it lets you vary their interaction independently.

中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相旦明显作用。从而使它们可以松散耦合。当某些对象之间的作用发生改变时，不会立即影响其他的一些
对象之间的作用。保证这些作用可以彼此独立的变化。其核心思想是，通过中介者解耦系统各层次对象的直接耦合，层次对象的对外依赖通信统统交由中介者转发。

中介者模式主要包含四个角色
抽象中介者(Mediator ) ︰定义统一的接口，用于各同事角色之间的通信﹔
具体中介者( ConcreteMediator )︰从具体的同事对象接收消息，向具体同事对象发出命令，协调各同事间的协作﹔
抽象同事类( Colleague ):每一个同事对象均需要依赖中介者角色，与其他同事间通信时，交由中介者进行转发协作;
具体同事类(ConcreteColleague )∶负责实现自发行为（Self-Method )，转发依赖方法( Dep-Method ）交由中介者进行协调。

优点∶
1、减少类间依赖，将多对多依赖转化成了一对多，降低了类间耦合﹔
2、类间各司其职，符合迪米特法则。

缺点∶
中介者模式中将原本多个对象直接的相互依赖变成了中介者和多个同事类的依赖关系。当同事
类越多时，中介者就会越臃肿，变得复杂且难以维护。
