
模板方法设计模式
	该设计模式解决的问题是：具有固定算法（步骤）的应用。但这些算法步骤，又针对不同的用户（情况）具有不同的实现方式。
	
	在该设计模式中，具有两大类方法：模板方法，步骤方法。
	步骤方法又根据其实现情况，分为三种：抽象方法、最终方法、钩子方法。
	抽象方法：要求子类必须要实现的方法。
	最终方法：由final修饰的方法，不能被子类重写的方法。
	钩子方法：具有默认的实现，但可以被子类重写的方法。
	
	
	
	
	