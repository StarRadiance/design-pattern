状态模式(State Pattern )也称为状态机模式(State Machine Pattern)，是允许对象在内部状态发生改变时改变它的行为，对象看起来好像
修改了它的类，属于行为型模式。

原文:Allow an object to alter its behavior when its internal state changes. The object will appear to change
its class.

解释:允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。状态模式中类的行为是由状态决定的，不同的状态下有不同的行为。
其意图是让一个对象在其内部改变的时候，其行为也随之改变。状态模式核心是状态与行为绑定，不同的状态对应不同的行为。


状态模式主要包含三种角色∶
1、环境类角色(Context)∶定义客户端需要的接口，内部维护一个当前状态实例，并负责具体状态的切换﹔
2、抽象状态角色(State): 定义该状太下的行为可I右一人书名人-化的
3、具体状态角色(ConcreteState): 具体实现该状态对应的行为，并且在需要的情况下进行状态切换。


1、状态模式与责任链模式
状态模式和责任链模式都能消除if分支过多的问题。但某些情况下，状态模式中的状态可以理解为责任，那么这种情况下，两种模式都可以使用。
从定义来看，状态模式强调的是一个对象内在状态的改变，而责任链模式强调的是外部节点对象间的改变。
从其代码实现上来看，他们间最大的区别就是状态模式各个状态对象知道自己下一个要进入的状态对象;而责任链模式并不清楚其下一个节点处理对象，因为链式组装
由客户端负责。



2、状态模式与策略模式
状态模式和策略模式的UML类图架构几乎完全一样，但他们的应用场景是不一样的。策略模式多种算法行为择其一都能满足，彼此之间是独立的，用户可自行更换
策略算法﹔而状态模式各个状态间是存在相互关系的，彼此之间在一定条件下存在自动切换状态效果，且用户无法指定状态，只能设置初始状态。


优点:
1、结构清晰:将状态独立为类,消除了冗余的 if...else或 switch...case语句，使代码更加简洁，提高系统可维护性;
2、将状态转换显示化︰通常的对象内部都是使用数值类型来定义状态，状态的切换是通过赋值进行表现，不够直观﹔而使用状态类，在切换状态时，是以不同的类
进行表示，转换目的更加明确﹔
3、状态类职责明确且具备扩展性。


缺点:
1、类膨胀︰如果一个事物具备很多状态，则会造成状态类太多﹔
2、状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱;
3、状态模式对开闭原则的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改
某个状态类的行为也需修改对应类的源码


