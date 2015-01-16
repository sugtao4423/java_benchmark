package java_benchmark;

import java.util.Calendar;

public class MainActivity {
	static char[] charlist = new char[62];
	static boolean While = true;
	static int times = -1;
	static int startDATE[] = new int[3];
	static int endDATE[] = new int[3];
	static int ansDATE[] = new int[3];
	static String coron = ":";
	
	public static void main(String[] args){
		if(args.length != 1)
			times = 100000000;
		else
			times = Integer.valueOf(args[0]);
		System.out.println(times + "回ループします");
		Calendar cal = Calendar.getInstance();
		startDATE[0] = cal.get(Calendar.MINUTE);
		startDATE[1] = cal.get(Calendar.SECOND);
		startDATE[2] = cal.get(Calendar.MILLISECOND);
		System.out.println("start：" + startDATE[0] + coron + startDATE[1] + "," + startDATE[2]);
		
		while(While){
		for(int i = 0; i < 10; ++i)
			charlist[i] = (char) ('0' + i);
			for(int i = 0; i < 26; ++i){
				charlist[i + 10] = (char) ('a' + i);
				charlist[i + 36] = (char) ('A' + i);
		}
			char[] rndword = new char[11];
			for(int i = 0; i < 10; ++i)
				rndword[i] = charlist[ (int) (61 * Math.random())];
			//System.out.println(rndword);
			times--;
			if(times == 0)
				While = false;
		}
		Calendar cal2 = Calendar.getInstance();
		endDATE[0] = cal2.get(Calendar.MINUTE);
		endDATE[1] = cal2.get(Calendar.SECOND);
		endDATE[2] = cal2.get(Calendar.MILLISECOND);
		
		cal2.add(Calendar.MINUTE, -startDATE[0]);
		cal2.add(Calendar.SECOND, -startDATE[1]);
		cal2.add(Calendar.MILLISECOND, -startDATE[2]);
		ansDATE[0] = cal2.get(Calendar.MINUTE);
		ansDATE[1] = cal2.get(Calendar.SECOND);
		ansDATE[2] = cal2.get(Calendar.MILLISECOND);
		
		System.out.println("end：" + endDATE[0] + coron + endDATE[1] + "," + endDATE[2]);
		System.out.println("margin：" + ansDATE[0] + coron + ansDATE[1] + "," + ansDATE[2]);
	}
}
