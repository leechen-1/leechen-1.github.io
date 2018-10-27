package com.abc.adapters;

import com.abc.workers.ICooker;

public class CookerAdapter implements IWorker {

	@Override
	public void work(Object worker) {
		System.out.println(((ICooker) worker).cook());;
	}

	@Override
	public boolean support(Object worker) {
		return worker instanceof ICooker;
	}

}
