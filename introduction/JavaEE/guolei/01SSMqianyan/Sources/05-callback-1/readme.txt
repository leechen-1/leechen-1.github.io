设计模式：

   1995年，GOF，四人组，23种设计模式。

回调模式：

   回调模式不属于23种设计模式之一。
      Some类的某个对象some的某个方法doTest()调用了Other类对象的某个方法doOther()，而doOther()方法又返过来调用了
  Some类的some对象的另一个方法doSome()，那么这种程序结构，就称为回调模式。doSome()方法称为回调方法，Some类称为
    回调类，some对象称为回调对象。
  	  一般情况下，doSome()方法是以下面的形式出现在Some类中的。
  	 让Some类实现一个接口，该接口中有方法doSome()，这样的话，Some类就必须要实现doSome()方法，也就是说，doSome()方法
  就以接口方法的形式出现在了Some类中。此时的这个接口称为回调接口。









