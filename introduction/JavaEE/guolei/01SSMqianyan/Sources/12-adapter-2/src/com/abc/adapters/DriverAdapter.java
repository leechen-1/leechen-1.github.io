package com.abc.adapters;

import com.abc.workers.IDriver;

public class DriverAdapter implements IWorker {

	@Override
	public void work(Object worker) {
		System.out.println(((IDriver) worker).drive());;
	}

	@Override
	public boolean support(Object worker) {
		return worker instanceof IDriver;
	}

}
