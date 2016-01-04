package com.trk.job;

import com.trk.utils.Utils;

public class JobB implements Runnable {

	public void run() {
		try {
			Utils.lockget("JobB");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
