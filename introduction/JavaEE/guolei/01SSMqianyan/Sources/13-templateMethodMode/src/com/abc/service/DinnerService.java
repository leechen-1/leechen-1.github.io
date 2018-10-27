package com.abc.service;

// 抽象方法只能出现在抽象类中
// 但抽象类中不一定就有抽象方法
public abstract class DinnerService {
	
	// 模板方法
	public void havingDinner() {
		// 点餐
		order();
		// 进餐
		eat();
		// 付款
		pay();
	}

	// --------- 以下方法称为 步骤方法 -----------
	
	// 最终方法：不能被子类重写的方法
	public final void order() {
		System.out.println("使用iPad进行点餐");
	}

	// 抽象方法：必须由子类实现的方法
	public abstract void eat();

	// 钩子方法：可以被子类重写的方法
	public void pay() {
		System.out.println("使用现金付款");
	}
	
}
