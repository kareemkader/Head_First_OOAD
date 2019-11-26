package Chapter2;

import java.util.*;
public class Remote {

	private DogDoor door;
	public Remote(DogDoor door) {
		this.door=door;
	}
	public void pressButton() {
		if(door.isOpen()) {
			System.out.println("doors will be closed now !!");
			door.close();
		}else {
			System.out.println("doors gonna be open now !!");
			door.open();
			final Timer timer=new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					System.out.println("doors gonna be closed autimaticlly right now !!");
					door.close();
					timer.cancel();
				}
			},5000);
			
		}
	}
	
}
