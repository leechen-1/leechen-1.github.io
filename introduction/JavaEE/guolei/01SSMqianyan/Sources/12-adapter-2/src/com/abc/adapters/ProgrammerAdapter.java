package com.abc.adapters;

import com.abc.workers.IProgrammer;

public class ProgrammerAdapter implements IWorker {

	@Override
	public void work(Object worker) {
		System.out.println(((IProgrammer) worker).programm());;
	}

	@Override
	public boolean support(Object worker) {
		return worker instanceof IProgrammer;
	}

}
