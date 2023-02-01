package dal;

import java.util.ArrayList;

import dol.eHour;
import dol.eMonth;


public class eArray {

	private ArrayList<eHour>arrayH;
	private ArrayList<eMonth>arrayM;
	
	public  eArray() {
		arrayH = new ArrayList<eHour>();
		arrayM = new ArrayList<eMonth>();
		
	}
	
	public void add (eHour h) {
		arrayH.add(h);
	}
	

	
}
