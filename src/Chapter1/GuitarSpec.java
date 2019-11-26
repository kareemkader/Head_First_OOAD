package Chapter1;

public class GuitarSpec {
	private Builder builder;
	private Wood topWood;
	private Wood backWood;
	private Type type;
	private String model;
	private int numString;
	public GuitarSpec(Builder builder, Wood topWood, Wood backWood, Type type, String model,int numString) {
		super();
		this.numString=numString;
		this.builder = builder;
		this.topWood = topWood;
		this.backWood = backWood;
		this.type = type;
		this.model = model;
	}
	public int getNumString() {
		return numString;
	}
	public Builder getBuilder() {
		return builder;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Type getType() {
		return type;
	}
	public String getModel() {
		return model;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backWood == null) ? 0 : backWood.hashCode());
		result = prime * result + ((builder == null) ? 0 : builder.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((topWood == null) ? 0 : topWood.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass())return false;
		GuitarSpec other=(GuitarSpec)obj;
		if(backWood!=other.getBackWood()) return false;
		if(topWood!=other.getTopWood()) return false;
		if(type!=other.getType()) return false;
		if (builder!=other.getBuilder())return false;
		if(numString!=other.getNumString())return false;
		String modelAnother=other.getModel().toLowerCase();
		if(model==null) {if(modelAnother!=null)return false;}
		else if(!model.toLowerCase().equals(modelAnother))return false;
		
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ( ", buldier=" +getBuilder() + ", model=" + getModel()+ ", type=" + getType()
		+ ", backWood=" + getBackWood() + ", topWood=" + getTopWood()+", numString="+getNumString() );
	}
	
}
