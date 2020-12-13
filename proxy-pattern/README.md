代理模式(Proxy Pattern )是指为其他对象提供一种代理，以控制对这个对象的访问，属于结构型模式。在某些情况下，
一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。

官方原文:Provide a surrogate or placeholder for another object to contro1 access to it.

代理模式一般包含三种角色∶

1、抽象主题角色( Subject )∶抽象主题类的主要职责是声明真实主题与代理的共同接口方法，该类可以是接口也可以是抽象类;
2、真实主题角色( RealSubject )∶该类也被称为被代理类，该类定义了代理所表示的真实对象，是负责执行系统真正的逻辑业务对象﹔
3、代理主题角色( Proxy )∶也被称为代理类，其内部持有RealSubject 的引用，因此具备完全的对RealSubject 的代理权。客户端
调用代理对象的方法，同时也调用被代理对象的方法，但是会在代理对象前后增加一些处理代码。

在代码中，一般代理会被理解为代码增强，实际上就是在原代码逻辑前后增加一些代码逻辑，而使调用者无感知。代理模式属于结构型模式，
分为静态代理和动态代理。

代理模式的应用场景
生活中的租房中介、售票黄牛、婚介、经纪人、快递、事务代理、非侵入式日志监听等，都是代理模式的实际体现。当无法或不想直接引用
某个对象或访问某个对象存在困难时，可以通过也给代理对象来间接访问。使用代理模式主要有两个目的∶一是保护目标对象，二是增强目标对象。

代理模式分为 动态代理 和 静态代理
区别：
(1)静态代理只能通过手动完成代理操作，如果被代理类增加了新的方法，代理类需要同步增加，违背开闭原则。
(2)动态代理采用在运行时动态生成代码的方式，取消了对被代理类的扩展限制，遵循开闭原则。
(3)若动态代理要对目标类的增强逻辑进行扩展，结合策略模式，只需要新增策略类便可完成，无须修改代理类的代码。

CGLib和JDK动态代理对比
(1)JDK动态代理实现了被代理对象的接口，CGLib代理继承了被代理对象。
(2)JDK动态代理和CGLib代理都在运行期生成字节码JDK动态代理直接写Class字节码CGLib代理使用ASM框架写Class字节码，CGlib代理
实现更复杂，生成代理类比JDK动态代理效率低。
(3)JDK动态代理调用代理方法是通过反射机制调用的，CGLib 代理是通过FastClass机制直接调用方法的，CGLib 代理的执行效率更高。

注意：CGLib不能代理final的方法


优点︰
(1)代理模式能将代理对象与真实被调用目标对象分离。
(2)在一定程度上降低了系统的耦合性，扩展性好。
(3)可以起到保护目标对象的作用。
(4)可以增强目标对象的功能。

缺点∶
(1)代理模式会造成系统设计中类的数量增加。
(2)在客户端和目标对象中增加一个代理对象，会导致请求处理速度变慢。
(3)增加了系统的复杂度。