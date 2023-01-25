package caseStudy;

public class GSPrimeAcc extends PrimeAcc {

	private float charges;
	

	
	/*
	 * public GSPrimeAcc(int AccNo, String accnm, float charges, boolean isPrime) {
	 * super(AccNo, accnm, charges, isPrime); //charges = charges2; }
	 */
	
	
	@Override
    public void bookProduct(float P)
	{
		System.out.println("BookProduct........");
	}
	public GSPrimeAcc(int AccNo, String accnm, float charges, boolean isPrime, float deleveryCharges, float charges2) {
		super(AccNo, accnm, charges, isPrime, deleveryCharges);
		charges = charges2;
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + "]";
	}
	
	
	
	
}
