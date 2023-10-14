package org.abstraction;

public class SouthIndians extends Indians{

	@Override
	public void breakFast() {
		// TODO Auto-generated method stub
		
		System.out.println("1.Idly\n2.Dosa\n");
		
	}
	
	public static void main(String[] args) {
		
		SouthIndians s = new SouthIndians();
		s.aadharCard();
		s.panCard();
		s.breakFast();
	}

}
