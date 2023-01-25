package caseStudy;

public abstract class ShopAcc {

	private int accNo;
	private String Accnm;
	private float charges;
	
	
	public ShopAcc(int AccNo, String accnm, float charges) {
		super();
		this.accNo = AccNo;
		Accnm = accnm;
		this.charges = charges;
	}
	
	public void bookProduct(float P)
	{
		System.out.println("BookProduct........");
	}
	public void items(float I)
	{
		System.out.println("Items........");
		
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", Accnm=" + Accnm + ", charges=" + charges + "]";
	}
	
	
}
