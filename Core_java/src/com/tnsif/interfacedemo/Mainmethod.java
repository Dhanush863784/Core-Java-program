package com.tnsif.interfacedemo;


interface OderService{
	boolean validateorder(double amount);
	void ProcessPayment(double amount);
	void generateInvoice(String orderId,double amount);
	void UpdateOderstatus(String orderId, String status);
}

class OnlineOrder implements OderService{
	
	private String customername;
	private String Orderid;
	
	
	
	public OnlineOrder(String customername, String orderid) {
		super();
		this.customername = customername;
		Orderid = orderid;
	}
	
	@Override
	public boolean validateorder(double amount) {
		if(amount>0) {
			System.out.println("oder validation successful");
		
		return true;
	}
		System.out.println("invalid order amount");
		return false;
	}

	@Override
	public void ProcessPayment(double amount) {
	System.out.println("procession payment "+amount);
		
	System.out.println("payment successful");
	}

	@Override
	public void generateInvoice(String orderId, double amount) {
		System.out.println("invoice generated");
		System.out.println("order id "+orderId);
		System.out.println("Customer name "+customername);
		System.out.println("Amount :"+amount);
		
	}

	@Override
	public void UpdateOderstatus(String orderId, String status) {
		System.out.println("order "+orderId +"status updated to :"+status);
		
	}
	
}

public class Mainmethod {
public static void main(String[] args) {
	OnlineOrder o=new OnlineOrder("Ruth","ORD1001");
	
	double amount=-5;
	if(o.validateorder(amount)) {
		o.ProcessPayment(amount);
		o.generateInvoice("ORD1001", amount);
		o.UpdateOderstatus(
				"ORD1001","Confirmed");
	}
}
}