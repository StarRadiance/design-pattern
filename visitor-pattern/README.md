访问者模式（(Visitor Pattern )是一种将数据结构与数据操作分离的设计模式。是指封装一些作用于某种数据结构中的各元素的操作，它可以在不改变
数据结构的前提下定义作用于这些元素的新的操作。属于行为型模式。

原文:Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new 
operation without changing the classes of the elements on which it operates


优点︰
1、解耦了数据结构与数据操作，使得操作集合可以独立变化;
2、扩展性好︰可以通过扩展访问者角色，实现对数据集的不同操作﹔3、元素具体类型并非单一，访问者均可操作;
4、各角色职责分离，符合单一职责原则。


缺点∶
1、无法增加元素类型∶若系统数据结构对象易于变化，经常有新的数据对象增加进来，则访问者类必须增加对应元素类型的操作，违背了开闭原则;
2、具体元素变更困难︰具体元素增加属性，删除属性等操作会导致对应的访问者类需要进行相应的修改，尤其当有大量访问者类时，修改范围太大;
3、违背依赖倒置原则∶为了达到”区别对待”，访问者依赖的是具体元素类型，而不是抽象。
