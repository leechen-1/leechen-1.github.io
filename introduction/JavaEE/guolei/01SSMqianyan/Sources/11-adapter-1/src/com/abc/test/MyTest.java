package com.abc.test;

import com.abc.adapters.IWorker;
import com.abc.adapters.WorkerAdapter;
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
		
		Object[] workers = {cooker, programmer, driver};
		
		// 创建适配器
		IWorker adapter = new WorkerAdapter();
		
		for (Object worker : workers) {
			adapter.work(worker);
		}
		
	}

}
