package Chapter1;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	ArrayList<Guitar> guitarList;
	
	public Inventory() {
		guitarList=new ArrayList<Guitar>();
	}
//	##########################################################################
	public void addGuitar(String serialNumber,double price,GuitarSpec spec) {
		guitarList.add(new Guitar(serialNumber,price,spec)	);
		
	}

	public Guitar getGuitar(String serialNumber) {
//		for (Guitar guitar : guitarList) {
//			if(serialNumber.equals(guitar.getSerialNumber()))
//				return guitar;
//			
//		}
//		return null;
		for(Iterator<Guitar> i=guitarList.iterator();i.hasNext();)
		{
			Guitar guitar=(Guitar)i.next();
			if(serialNumber.equals(guitar.getSerialNumber()))return guitar;
		}
		return null;
	}
	
//	####################################################
//	public ArrayList<Guitar> searchGuitar(GuitarSpec guitarTarget) {
//		
//		ArrayList<Guitar> guitarFounded=new ArrayList<Guitar>();
//		for (Guitar guitar : guitarList) {
//			if(guitarTarget.getBuilder() != gSpec.getBuilder()) continue;
//			if(guitarTarget.getType()!=gSpec.getType()) continue;
//			if(guitarTarget.getBackWood()!=gSpec.getBackWood())continue;
//			if(guitarTarget.getTopWood()!=gSpec.getTopWood()) continue;
//			String model=guitarTarget.getModel().toLowerCase();
//			if((model!=null)&&(!model.equals(gSpec.getModel().toLowerCase()))&&(!model.equals("")))continue;
//			guitarFounded.add(guitar);
//		}
//		
//		if(!guitarFounded.isEmpty()) {
//			return guitarFounded;
//		}
//		
//		
//		
//		
//		return null;
//		
//		
//	}
//	
public ArrayList<Guitar> searchGuitar(GuitarSpec guitarTarget) {
		
		ArrayList<Guitar> guitarFounded=new ArrayList<Guitar>();
		for (Guitar guitar : guitarList) {
			GuitarSpec gSpec=guitar.getSpec();
			if(gSpec.equals(guitarTarget)) {
				guitarFounded.add(guitar);
			}
		}
		
		if(!guitarFounded.isEmpty()) {
			return guitarFounded;
		}
		
		
		
		
		return null;
		
		
	}
	
	
	
}
