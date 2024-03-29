package Chapter1;

public class Guitar {
	 
	
	private String serialNumber;
	
	private double price;
	private GuitarSpec spec;
	public Guitar(String serialNumber,double price,GuitarSpec spec) {
		super();
		this.spec=spec;
		this.serialNumber = serialNumber;
		
		this.price = price;
	}
	public GuitarSpec getSpec() {return spec;}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	
	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber +spec.toString()+ ", price=" + price + "]";
	}
	
}
