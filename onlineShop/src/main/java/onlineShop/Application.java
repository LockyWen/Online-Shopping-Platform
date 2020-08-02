package onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onlineShop.log.PaymentAction;

// This is a test class to check if Spring framework works 
public class Application {
	/**
	 * The output value should be 
	 * 
	 * server log =pay again, payValue is 2
	 * server log =pay end
	 * 
	 * @param args Default input
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("payment.xml");
		PaymentAction paymentAction = (PaymentAction) context.getBean("paymentAction");
		paymentAction.pay(new BigDecimal(2));
	}
}
