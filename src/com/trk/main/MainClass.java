package com.trk.main;

import com.trk.job.JobA;
import com.trk.job.JobB;

public class MainClass {

	public static void main(String args[]) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			Thread threadJob = new Thread(new JobA());
			Thread threadJobA = new Thread(new JobB());
			threadJob.start();
			threadJobA.start();

		}

	}

}
