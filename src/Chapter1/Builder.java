package Chapter1;

public enum Builder {
	FENDER,MARTIN;
	public String toString (){
		switch (this) {
			case FENDER:
				return "fender";
				
			case MARTIN:
				return "martin";
				
			default:
				return "wrong	";
		}
	}
}
