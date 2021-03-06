迭代器模式(iterator Pattern )又称为游标模式(Cursor Pattern)，它提供一种顺序访问集合容器对象元素的方法，而又无须暴露集合内部表示。迭代器模式可以为
不同的容器提供一致的遍历行为，而不用关心容器内容元素组成结构，属于行为型模式。

原文: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

解释:提供一种顺序访问集合/容器对象元素的方法，而又无须暴露集合内部表示。

迭代器模式的本质是抽离集合对象迭代行为到迭代器中，提供一致访问接口。


迭代器模式主要包含四种角色︰
抽象迭代器( iterator ):抽象迭代器负责定义访问和遍历元素的接口;
具体迭代器(ConcreteIterator ):提供具体的元素遍历行为﹔
抽象容器（ Aggregate) :负责定义提供具体迭代器的接口﹔
具体容器(ConcreteAggregate):创建具体迭代器


优点︰
1、多态迭代︰为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的集合对象﹔
2、简化集合对象接口︰迭代器模式将集合对象本身应该提供的元素迭代接口抽取到了迭代器中，使集合对象无须关心具体迭代行为﹔
3、元素迭代功能多样化∶每个集合对象都可以提供一个或多个不同的迭代器，使的同种元素聚合结构可以有不同的迭代行为﹔
4、解耦迭代与集合︰迭代器模式封装了具体的迭代算法，迭代算法的变化，不会影响到集合对象的架构。

缺点:
1、对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐。

在日常开发当中，我们几乎不会自己写迭代器。除非我们需要定制一个自己实现的数据结构对应的迭代器，否则，开源框架提供给我们的API完全够用。
