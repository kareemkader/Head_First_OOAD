package Chapter2;

public class DogDoor {
	Sysytem.out.printl("KareemTesting");
	private boolean open;
	public DogDoor() {
		this.open=false;
	}
	public void  open() {
		System.out.println("the dog door opens");
		open=true;
	}
	public void close() {
		System.out.println("the dog door closes");
		open=false;
	}
	public boolean isOpen() {
		return open;
	}
}

