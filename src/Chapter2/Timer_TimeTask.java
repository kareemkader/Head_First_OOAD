package Chapter2;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_TimeTask {

	public static void main(String[] args) {
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("thread name :"+Thread.currentThread().getName());
				
			}
		};
		Timer timer=new Timer();
		timer.schedule(task, 1000);
		while(true) {
			
			System.out.println("hello");
		}
		

	}

}
