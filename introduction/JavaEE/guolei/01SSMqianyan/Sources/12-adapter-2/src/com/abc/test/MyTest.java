package com.abc.test;

import com.abc.adapters.CookerAdapter;
import com.abc.adapters.DriverAdapter;
import com.abc.adapters.IWorker;
import com.abc.adapters.ProgrammerAdapter;
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
		
		for (Object worker : workers) {
			IWorker adapter = getAdapter(worker);
			adapter.work(worker);
		}
		
	}

	// 根据worker的具体类型查找与其相匹配的适配器
	private static IWorker getAdapter(Object worker) {
		IWorker ca = new CookerAdapter();
		IWorker pa = new ProgrammerAdapter();
		IWorker da = new DriverAdapter();
		
		IWorker[] adapters = {ca, pa, da};
		
		for (IWorker adapter : adapters) {
			if(adapter.support(worker)) {
				return adapter;
			}
		}
		
		return null;
	}

}
