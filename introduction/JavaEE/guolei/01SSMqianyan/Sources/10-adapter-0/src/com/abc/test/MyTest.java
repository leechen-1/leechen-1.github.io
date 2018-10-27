package com.abc.test;

import com.abc.workers.BDProgrammer;
import com.abc.workers.DDDriver;
import com.abc.workers.ICooker;
import com.abc.workers.IDriver;
import com.abc.workers.IProgrammer;
import com.abc.workers.QjdCooker;

public class MyTest {

	public static void main(String[] args) {
		ICooker cooker = new QjdCooker();
		IProgrammer programmer = new BDProgrammer();
		IDriver driver = new DDDriver();
		
		System.out.println(cooker.cook());;
		System.out.println(programmer.programm());;
		System.out.println(driver.drive());;
	}

}
