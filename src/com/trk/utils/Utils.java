package com.trk.utils;

public class Utils {
	public synchronized static void lockget(String param)
			throws InterruptedException {
		System.out.println("CURRENT THREAD NAME "
				+ Thread.currentThread().getName());

		System.out.println("TIME " + System.currentTimeMillis());
		System.out.println("RECEİVED " + param);
		Thread.sleep(10000);
		System.out.println("WOKE UP" + Thread.currentThread().getName());

	}

}
