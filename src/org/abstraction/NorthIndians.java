package org.abstraction;

public class NorthIndians extends Indians
{

	@Override
	public void breakFast() {
		// TODO Auto-generated method stub
		
		System.out.println("1.Pohaa\n2.Pav Bhaji \n");
	}
	
	public static void main(String[] args) {
		
		NorthIndians n = new NorthIndians();
		n.breakFast();
	}

}
