package org.abstraction;

public class IciciBank implements HdfcBank, SbiBank{
//	public class IciciBank extends  Indians{
	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
			System.out.println("");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		HdfcBank h = new IciciBank();
		h.deposit();
		
		SbiBank s = new IciciBank();
		s.fixed();
		
	}
}
