package seminar6.isp;

import java.util.ArrayList;
import java.util.List;

public class Programm {
	public static void main(String[] args) {
		List<CreditCard> paymentServices = new ArrayList<>();
		// paymentServices.add(new CustomPaymentService());
		paymentServices.add(new InternetPaymentService());

		for (CreditCard payabel : paymentServices) {
			payabel.payCreditCard(500);
			break;
		}
	}
}
