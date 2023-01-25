package caseStudy;

public abstract class PrimeAcc extends ShopAcc{

	private boolean isPrime;
    private float deleveryCharges;
	
	/*
	 * public PrimeAcc( int AccNo, String accnm, float charges ,boolean isPrime) {
	 * super(); this.isPrime = isPrime; }
	 */
    
    public PrimeAcc(int AccNo, String accnm, float charges, boolean isPrime, float deleveryCharges) {
		super(AccNo, accnm, charges);
		this.isPrime = isPrime;
		this.deleveryCharges = deleveryCharges;
	}
    
    @Override
    public void bookProduct(float P)
	{
		System.out.println("BookProduct........");
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
    
    
    
    
}
