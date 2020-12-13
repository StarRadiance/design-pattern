备忘录模式( Memento Pattern )又称为快照模式( Snapshot Pattern )或令牌模式(TokenPattern )，是指在不破坏封装的前提下，捕获一个对象
的内部状态，并在对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态，属于行为型模式。

原文:Without violating encapsulation,capture and externalize an object's internal state so that the object can be 
restored to this state later.

在软件系统中，备忘录模式可以为我们提供一种“后悔药”的机制，它通过存储系统各个历史状态的快照，使得我们可以在任一时刻将系统回滚到某一个历史状态。
备忘录模式本质是从发起人实体类（Originator)隔离存储功能，降低实体类的职责。同时由于存储信息（Memento )独立，且存储信息的实体交由
管理类(Caretaker )管理，则可以通过为管理类扩展额外的功能对存储信息进行扩展操作（比如增加历史快照功能...)。


优点︰
1、简化发起人实体类（Originator )职责，隔离状态存储与获取，实现了信息的封装，客户端
无需关心状态的保存细节;
2、提供状态回滚功能;

缺点︰
1、消耗资源︰如果需要保存的状态过多时，每一次保存都会消耗很多内存。
