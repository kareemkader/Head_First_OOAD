package Chapter2;

import java.util.*;

public class DogDoorSimulator {

	public static void main(String[] args) throws InterruptedException {
		
		DogDoor door=new DogDoor();
		Remote remoteControll=new Remote(door);
		System.out.println("the dog is barking now wowowooowwoow");
		remoteControll.pressButton();
		
		try {
				Thread.currentThread().sleep(10000);
				System.out.println("Fiddo just finished pooping right now !!");
				System.out.println("and stuck here outside");
		
		}finally {
			
		}

}}
