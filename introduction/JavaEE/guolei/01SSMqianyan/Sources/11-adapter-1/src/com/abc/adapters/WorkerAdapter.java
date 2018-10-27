package com.abc.adapters;

import com.abc.workers.ICooker;
import com.abc.workers.IDriver;
import com.abc.workers.IProgrammer;

// 多功能适配器
public class WorkerAdapter implements IWorker {

	@Override
	public void work(Object worker) {
		if(worker instanceof ICooker) {
			System.out.println(((ICooker) worker).cook());;
		} else if(worker instanceof IProgrammer) {
			System.out.println(((IProgrammer) worker).programm());;
		} else if(worker instanceof IDriver) {
			System.out.println(((IDriver) worker).drive());;
		}
	}

}
