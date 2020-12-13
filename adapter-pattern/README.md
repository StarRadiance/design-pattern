适配器模式( Adapter Pattern )又叫做变压器模式，它的功能是将一个类的接口变成客户端所期望的另一种接口，
从而使原本因接口不匹配而导致无法在一起工作的两个类能够一起工作，属于结构型设计模式。

原文:Convert the interface of a class into another interface clients expect.Adapter lets 
classes work together that couldn't otherwise because of incompatible interfaces.

解释:将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
也就是说，当前系统存在两种接口A和B ,客户只支持访问A接口，但是当前系统没有A接口对象，但是有B接口对象，但客户无法
识别B接口，因此需要通过一个适配器C，将B接口内容转换成A接口，从而使得客户能够从A接口获取得到B接口内容。

在软件开发中，基本上任何问题都可以通过增加一个中间层进行解决。适配器模式其实就是一个中间层。综上，适配器模式其实
起着转化/委托的作用，将一种接口转化为另一种符合需求的接口。


适配器模式一般包含三种角色:
1、目标角色(Target) :也就是我们期望的接口;
2、源角色(Adaptee):存在于系统中，内容满足客户需求（需转换)，但接口不匹配的接口实例;
3、适配器(Adapter):将源角色(Adaptee)转化为目标角色(Target)的类实例;

适配器模式各角色之间的关系如下:
假设当前系统中，客户端需要访问的是Target接口，但Target接口没有一个实例符合需求，而
Adaptee实例符合需求;但是客户端无法直接使用Adaptee (接口不兼容）;因此，我们需要一个适配器(Adapter )来进行中转，
让Adaptee能转化为Target接口形式;
适配器模式有3种形式∶类适配器、对象适配器、接口适配器。

优点︰
1、能提高类的透明性和复用，现有的类复用但不需要改变。
2、目标类和适配器类解耦,提高程序的扩展性。
3、在很多业务场景中符合开闭原则。

缺点∶
1、适配器编写过程需要全面考虑，可能会增加系统的复杂性。
2、增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。