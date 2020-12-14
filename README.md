<H1>七大软件设计原则：</H1>
<H5>一、开闭原则(Open-Closed Principle, OCP）</H5>
是指一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。所谓的开闭，也正是对扩展和修改
两个行为的一个原则。强调的是用抽象构建框架，用实现扩展细节。可以提高软件系统的可复用性及可维护性。开闭原则，是面向对象设计中最基础的设
计原则。它指导我们如何建立稳定灵活的系统，例如:我们版本更新，我尽可能不修改源代码，但是可以增加新功能。
<br/>

<H5>二、依赖倒置原则(Dependence Inversion Principle,DIP）</H5>
是指设计代码结构时，高层模块不应该依赖底层模块，二者都应该依赖其抽象。抽象不应该依赖细节;细节应该依赖抽象。通过依赖倒置，可以
减少类与类之间的耦合性，提高系统的稳定性，提高代码的可读性和可维护性，并能够降低修改程序所造成的风险。
<br/>

<H5>三、单一职责(Simple Responsibility Pinciple，SRP）</H5>
是指不要存在多于一个导致类变更的原因。假设我们有一个Class负责两个职责，一旦发生需求变更，修改其中一个职责的逻辑代码，有可能会导致
另一个职责的功能发生故障。这样一来，这个Class存在两个导致类变更的原因。如何解决这个问题呢?
我们就要给两个职责分别用两个Class来实现，进行解耦。后期需求变更维护互不影响。这样的设计，
可以降低类的复杂度，提高类的可读性，提高系统的可维护性，降低变更引起的风险。总体来说就是一个Class/Interface/Method只负责一项职责。
<br/>


<H5>四、接口隔离原则(Interface Segregation Principle, ISP)</H5>
是指用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。这个原则指导我们在设计接口时应当注意一下几点:
1、一个类对一类的依赖应该建立在最小的接口之上。
2、建立单一接口，不要建立庞大臃肿的接口。
3、尽量细化接口，接口中的方法尽量少(不是越少越好，一定要适度)。
接口隔离原则符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性。我们在设计接口的时候，要多花时间去思考，
要考虑业务模型，包括以后有可能发生变更的地方还要做一些预判。
<br/>

<H5>五、迪米特原则(Law of Demeter LoD)</H5>
是指一个对象应该对其他对象保持最少的了解，又叫最少知道原则(Least Knowledge Principle,LKP)，尽量降低类与类之间的耦合。迪米特原则主要强调
只和朋友交流，不和陌生人说话。出现在成员变量、方法的输入、输出参数中的类都可以称之为成员朋友类，而出现在方法体内部的类不属于朋友类。
<br/>

<H5>六、里氏替换原则(Liskov Substitution Principle,LSP)</H5>
是指如果对每一个类型为T1的对象o1,都有类型为T2的对象o2,使得以T1定义的所有程序Р在所有的对象o1都替换成o2时，程序Р的行为没有发生变化，那么类型
T2是类型T1的子类型。定义看上去还是比较抽象，我们重新理解一下，可以理解为一个软件实体如果适用一个父类的话，那一定是适用于其子类，所有引用父类的
地方必须能透明地使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变。根据这个理解，我们总结一下:
引申含义:子类可以扩展父类的功能，但不能改变父类原有的功能。<br/>
1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。<br/>
2、子类中可以增加自己特有的方法。<br/>
3、当子类的方法重载父类的方法时，方法的前置条件(即方法的输入/入参）要比父类方法的输入参数更宽松。<br/>
4、当子类的方法实现父类的方法时(重写/重载或实现抽象方法)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等。
<br/>


<H5>七、合成复用原则(Composite/Aggregate Reuse Principle,CARP）)</H5>
是指尽量使用对象组合(has-a)/聚合(contanis-a)，而不是继承关系达到软件复用的目的。可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化
对其他类造成的影响相对较少。

<H1>一句话归纳设计原则</H1>
<table>
    <tr>
        <td>设计原则</td>
        <td>一句话归纳</td>
        <td>目的</td>
    </tr>
    <tr>
        <td>开闭原则(OCP)<br/>(Open-Close)</td>
        <td>对扩展开放，对修改关闭</td>
        <td>减少维护带来新的风险</td>
    </tr>
    <tr>
        <td>依赖倒置原则(DIP)<br/>(Dependence Inversion)</td>
        <td>高层不应该低层</td>
        <td>更利于代码结构的升级扩展</td>
    </tr>
    <tr>
        <td>单一职责原则(SRP)<br/>(Simple Responsibility)</td>
        <td>一个类只干一件事</td>
        <td>便于理解，提高代码可读性</td>
    </tr>
    <tr>
        <td>接口隔离原则(ISP)<br/>(Interface Segregation)</td>
        <td>一个接口只干一件事</td>
        <td>功能解耦，高聚合、低耦合</td>
    </tr>
    <tr>
        <td>迪米特法则(LoD)<br/>(Law of Demeter)</td>
        <td>不该知道的不要知道</td>
        <td>只和朋友交流，不和陌生人说话，减少代码臃肿</td>
    </tr>
    <tr>
        <td>里氏替换原则(LSP)<br/>(Liskov Substitution)</td>
        <td>子类重写方法功能发生改变,不应该影响父类方法的含义</td>
        <td>防止继承泛滥</td>
    </tr>
    <tr>
        <td>合成复用原则(CARP)<br/>(Composite/Aggregate Reuse)</td>
        <td>尽量使用组合实现代码复用，而不使用继承</td>
        <td>降低代码耦合</td>
    </tr>
</table>


<H1>GOF23种设计模式：</H1>
1、工厂方法模式(Factory Method Pattern)<br/>
2、抽象工厂模式(Abstract Factory Pattern)<br/>
3、单例模式(Singleton Pattern)<br/>
4、原型模式(Prototype Pattern)<br/>
5、建造者模式(Builder Pattern)<br/>
6、代理模式(Proxy Pattern)<br/>
7、门面模式(Facade Pattern)<br/>
8、装饰器模式(Decorator Pattern)<br/>
9、享元模式(Flyweight Pattern)<br/>
10、组合模式(Composite Pattern)<br/>
11、适配器模式(Adapter Pattern)<br/>
12、桥接模式(Bridge Pattern)<br/>
13、访问者模式(Visitor Pattern)<br/>
14、模板方法模式(Template Method Pattern)<br/>
15、策略模式(Strategy Pattern)<br/>
16、责任链模式(Chain of Responsibility Pattern)<br/>
17、迭代器模式(iterator Pattern)<br/>
18、命令模式(Command Pattern)<br/>
19、状态模式(State Pattern)<br/>
20、备忘录模式(Memento Pattern)<br/>
21、中介者模式(Mediator Pattern)<br/>
22、解释器模式(Interpreter Pattern)<br/>
23、观察者模式(Observer Pattern)<br/>

<br/>
<br/>
简单工厂模式 (Simple Factory Pattern)<br/>
委派模式(Delegate Pattern)

<H1>一句话归纳设计模式</H1>
<table>
    <tr>
        <td>设计模式</td>
        <td>一句话归纳</td>
        <td>目的</td>
        <td>生活案例</td>
        <td>框架源码举例</td>
    </tr>
    <tr>
        <td>工厂模式(Factory)</td>
        <td>生产标准化，生产更高效</td>
        <td>封装创建细节</td>
        <td>实体工厂</td>
        <td>LoggerFactory、Calender</td>
    </tr>
    <tr>
        <td>单例模式(Singleton)</td>
        <td>世上只有一个我</td>
        <td>保证独一无二</td>
        <td>CEO</td>
        <td>BeanFactory、Runtime</td>
    </tr>
    <tr>
        <td>原形模式(Prototype)</td>
        <td>拔一根猴毛，吹出千万个</td>
        <td>高效创建对象</td>
        <td>克隆</td>
        <td>ArrayList、PrototypeBean</td>
    </tr>
    <tr>
        <td>建造者模式(Builder)</td>
        <td>高配中配与低配，想选哪配就哪配</td>
        <td>开放个性配置步骤</td>
        <td>选配</td>
        <td>StringBuilder、BeanDefinitionBuilder</td>
    </tr>
    <tr>
        <td>代理模式(Proxy)</td>
        <td>没资源没时间，得找媒婆帮忙</td>
        <td>增强职责</td>
        <td>媒婆</td>
        <td>ProxyFactoryBean、JdkDynamicAopProxy、CglibAopProxy</td>
    </tr>
    <tr>
        <td>门面模式(Facade)</td>
        <td>打开一扇门，走向全世界</td>
        <td>统一访问入口</td>
        <td>前台</td>
        <td>JdbcUtil、RequestFacade</td>
    </tr>
    <tr>
        <td>装饰器模式(Decorator)</td>
        <td>他大舅他二舅都是他舅</td>
        <td>灵活扩展、同宗同源</td>
        <td>煎饼</td>
        <td>BufferedReader、InputStream</td>
    </tr>
    <tr>
        <td>享元模式(FlyWeight)</td>
        <td>优化资源配置，减少重复浪费</td>
        <td>共享资源池</td>
        <td>全国社保联网</td>
        <td>String、Integer、ObjectPool</td>
    </tr>
    <tr>
        <td>组合模式(Composite)</td>
        <td>人在一起叫团伙，心在一起叫团队</td>
        <td>统一整体和个体</td>
        <td>组织架构树</td>
        <td>HashMap、SqlNote</td>
    </tr>
    <tr>
        <td>适配器模式(Adapter)</td>
        <td>适合自己的，才是最好的</td>
        <td>兼容转换</td>
        <td>电源适配</td>
        <td>AdvisorAdapter、HandlerAdapter</td>
    </tr>
    <tr>
        <td>桥接模式(Bridge)</td>
        <td>约定优于配置</td>
        <td>不允许用继承</td>
        <td>桥</td>
        <td>DriverManager</td>
    </tr>
    <tr>
        <td>委派模式(Delegate)   不属于23种GOF</td>
        <td>这个需求很简单，怎么实现我不管</td>
        <td>只对结果负责</td>
        <td>授权委托书</td>
        <td>ClassLoader、BeanDefinitionParseDelegate</td>
    </tr>
    <tr>
        <td>模板模式(Template)</td>
        <td>流程全部标准化，需要微调请覆盖</td>
        <td>逻辑复用</td>
        <td>把大象装进冰箱的步骤</td>
        <td>JdbcTemplate、HttpServlet</td>
    </tr>
    <tr>
        <td>策略模式(Strategy)</td>
        <td>我出方案，你来选</td>
        <td>把选择权交给用户</td>
        <td>选择支付方式</td>
        <td>Comparator、InstantiationStrategy</td>
    </tr>
    <tr>
        <td>责任链模式(Chain of Responsibility)</td>
        <td>事不关己高高挂起</td>
        <td>解耦处理逻辑</td>
        <td>踢皮球</td>
        <td>FilterChain、Pipeline</td>
    </tr>
    <tr>
        <td>迭代器模式(Iterator)</td>
        <td>一年365，过完一天少一天</td>
        <td>统一集合的访问方式</td>
        <td>统一刷脸进站</td>
        <td>Iterator</td>
    </tr>
    <tr>
        <td>命令模式(Command)</td>
        <td>运筹帷幄之中，决胜千里之外</td>
        <td>解耦请求和处理</td>
        <td>遥控器</td>
        <td>Runnable、TestCase</td>
    </tr>
    <tr>
        <td>状态模式(State)</td>
        <td>状态驱动行为，行动觉得状态</td>
        <td>绑定状态和行为</td>
        <td>订单状态跟踪</td>
        <td>Lifecycle</td>
    </tr>
    <tr>
        <td>备忘录模式(Memento)</td>
        <td>给我一剂“后悔药”</td>
        <td>备份</td>
        <td>草稿箱</td>
        <td>StateManageableMessageContext</td>
    </tr>
    <tr>
        <td>中介者模式(Mediator)</td>
        <td>联系方式我给你，怎么搞定我不管</td>
        <td>统一管理网状资源</td>
        <td>朋友圈</td>
        <td>Timer</td>
    </tr>
    <tr>
        <td>解释器模式(Interpreter)</td>
        <td>我想说“方言”</td>
        <td>实现特定语法解析</td>
        <td>摩斯密码</td>
        <td>Pattern、ExpressionParse</td>
    </tr>
    <tr>
        <td>观察者模式(Observer)</td>
        <td>到点就通知我</td>
        <td>解耦观察者与被观察者</td>
        <td>闹钟</td>
        <td>ContextLoaderListener</td>
    </tr>
    <tr>
        <td>访问者模式(Visitor)</td>
        <td>横看成岭侧成峰，远近高低各不同</td>
        <td>解耦数据结构和数据操作</td>
        <td>KPI考核</td>
        <td>FileVisitor、BeanDefinitionVisitor</td>
    </tr>
</table>


<H1>模式PK</H1>
<H2>代理模式VS中介者模式</H2>
代理：职责增强，不仅要建立联系，还要参与过程<br/>
中介：只负责牵线搭桥，建立联系

<H2>委派模式VS代理模式</H2>
委派：全权近代代理模式，不做任何的增强<br/>
代理：一定会有增强<br/>
没有任何增强的就叫委派

<H2>命令模式VS策略模式</H2>
命令：解耦请求和处理，会有一个回调，会有反馈及处理结果，本来请求和处理是可以写一块的<br/>
策略：固定好的选项，结果一定是同样的结果，一定要用户有参与<br/>
都有有个清单，给你啥就是啥，

<H2>代理模式VS装饰器模式</H2>
代理：组合实现功能增强和扩展<br/>
装饰：继承实现增强和扩展

<H2>委派模式VS责任链</H2>
委派：没有流程的概念，只需要拿到结果<br/>
责任：处理流程，处理流程可扩展，可定制，最终结果由责任链中的某些Handler决定的


<H2>工厂方法VS抽象工厂</H2>
工厂方法：产品扩展，单向维度<br/>
抽象工厂：产品等级结构和产品族的相互扩展，对维度

<H2>桥接模式VS适配器模式</H2>
桥接模式：不用继承建立联系<br/>
适配器模式：类适配器用的继承、对象适配器用的组合、接口适配器实际上也是继承


<H2>行为型VS结构型VS创建型</H2>
行为：对Java中的方法的使用提出的建议<br/>
结构：对Java类的组合提出建议<br/>
创建：对创建Java对象的形式提出的建议

<H2>建造者模式VS装饰器模式</H2>
建造者：强调对象创建步骤的个性化，一般来说会有标配<br/>
装饰器：强调扩展性，大桶套小桶

<H2>适配器模式VS中介者模式</H2>
适配器：解决兼容问题，可以用继承，也可以用组合<br/>
中介者：一定是用组合，所有人可能都持有中介者的引用

<H2>桥接模式VS中介者模式</H2>
共同点：不用继承：一定是组合<br/>
桥接：是两个维度建立连接<br/>
中介者：多维度建立连接（是一个更复杂的桥接模式的实现）

<H2>桥接模式VS组合模式</H2>
桥接：两个继承体系建立连接，反而就是为了满足个性<br/>
组合：目的不是为了建立连接，而是为了统一行为，统一一套API


<H2>门面模式VS装饰器模式</H2>
门面：统一路口，背后有很多子系统，承担一定的静态代理作用<br/>
装饰：为了扩展，背后一定是同宗同源

<H2>工厂模式VS策略模式</H2>
一般来说，他们俩会组合使用，策略将由工厂来创建<br/>


<H2>桥接模式VS命令模式</H2>
桥接：需要一个中间了类，一定是有功能实现的<br/>
命令：需要一个抽象的中间类，只是为了规范

<H2>委派模式VS门面模式</H2>
在门面里面，可能会用到委派模式实现任务分发<br/>

<H2>策略模式VS模板模式</H2>
有时候会混用，模板模式中可能设计的钩子方法就是每一个策略的实现<br/>






