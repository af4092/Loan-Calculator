package loancalculatorapi;

public class LoanClass {
	
	private String InterestRate;
	private String NumberOfYears;
	private String LoanAmount;

    public LoanClass(String InterestRate, String NumberOfYears, String LoanAmount){
        this.InterestRate = InterestRate;
        this.NumberOfYears = NumberOfYears;
        this.LoanAmount = LoanAmount;
//        loanDate = new java.util.Date();
    }
    
	public String getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(String interestRate) {
		this.InterestRate = interestRate;
	}

	public String getNumberOfYears() {
		return NumberOfYears;
	}
	
	public void setNumberOfYears(String numberOfYears) {
		this.NumberOfYears = numberOfYears;
	}

	public String getLoanAmount() {
		return LoanAmount;
	}
	
	public void setLoanAmount(String loanAmount) {
		this.LoanAmount = loanAmount;
	}
	
	public Double parseInterestRate() {
		return Double.parseDouble(InterestRate); 
	}
	
	public Double parseNumberOfYears() {
		return Double.parseDouble(NumberOfYears);
	}
	
	public Double parseLoanAmount() {
		return Double.parseDouble(LoanAmount);
	}

    //find monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = parseInterestRate() / 1200;
        double monthlyPayment = parseLoanAmount() * monthlyInterestRate / (1 - 
            (1 / Math.pow(1 + monthlyInterestRate, parseNumberOfYears() * 12)));
        return Math.round(monthlyPayment); // double value need to convert to String
    }

    public String resultMonthlyPayment() {
    	return Double.toString(getMonthlyPayment());
    }
    
    //find total payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * parseNumberOfYears() * 12;
        return Math.round(totalPayment); // also double value need to convert to String
    }
    
    public String resultTotalPayment() {
    	return Double.toString(getTotalPayment());
    }
    
    //return loan date
//    public java.util.Date getLoanDate(){
//        return loanDate;
//    }
    
}
