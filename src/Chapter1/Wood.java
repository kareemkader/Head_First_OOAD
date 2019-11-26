package Chapter1;

public enum Wood {
	
		CEDAR,ALDER;
		public String toString(	){
			switch (this) {
				case CEDAR:
				return "cedar";
				
				case ALDER:
				return "alder";
				default:
					return "wrong";
			}
		}
	}
