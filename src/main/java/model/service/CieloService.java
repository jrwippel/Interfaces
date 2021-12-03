package model.service;

public class CieloService implements OnlinePaymentService {

	private static final double FEE_PERCENTAGE = 0.05;
	private static final double MONTHLY_INTEREST = 0.10;

	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
}