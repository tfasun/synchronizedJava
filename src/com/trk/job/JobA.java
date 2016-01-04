package com.trk.job;

import com.trk.utils.Utils;



public class JobA implements Runnable{

	public void run() {
	try {
		Utils.lockget("JobA");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	


}
