package Chapter1;

import java.util.ArrayList;
import java.util.Iterator;

public class GuitarShop {

	public static void main(String[] args) {
		Inventory inventory=new Inventory();
	
		initializeInventory(inventory);
		
		GuitarSpec targetGuitar=new GuitarSpec( Builder.FENDER,  Wood.CEDAR, Wood.CEDAR, Type.ACOUSTIC ,"lastEdition",5);
		
		inventory.addGuitar("1213", 55.5,targetGuitar);
		
		for (Guitar	 guitar : inventory.guitarList) {
			System.out.println(guitar);
		}
		
		System.out.println("now i starts to search on this guitar target");
		
		ArrayList<Guitar> guitar=inventory.searchGuitar(targetGuitar);
		
		if(guitar!=null) {
			for (Iterator<Guitar> i = guitar.iterator();i.hasNext();) {
				Guitar g=i.next();
				System.out.println(g);
			}
		}
		else System.out.println("nothing found her sorry!!");
		

	}
	
	public static void initializeInventory(Inventory inve) {
		String[] serialNumber= {"1212","78745"};
		Builder [] builder= Builder.values();
		String[] model= {"lastEdition","newGeneration"};
		Type[] type= Type.values();
		Wood[] topWood=Wood.values();
		int[] num= {5,2};
		Wood[] backWood=Wood.values();
		double[] price= {22.5,55.5};
		for (int i = 0; i < price.length; i++) {
			GuitarSpec spec=new GuitarSpec(builder[i], topWood[i], backWood[i], type[i], model[i],num[i]);
			inve.guitarList.add(new Guitar(serialNumber[i], price[i],spec));
		}
		
	}

}
