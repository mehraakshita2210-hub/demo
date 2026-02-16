package abstractPractice;

public class RoiClass {

	public static void main(String[] args) 
	{
		AutoLoan al = new AutoLoan();
		al.getROI();

		PersonalLoan pl = new PersonalLoan();
		pl.getROI();
		
		HomeLoan hl = new HomeLoan();
		hl.getROI();
		
		GoldLoan gl = new GoldLoan();
		gl.getROI();	
		
	}

}
