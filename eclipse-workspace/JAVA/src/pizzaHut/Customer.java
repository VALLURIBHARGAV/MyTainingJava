package pizzaHut;

public class Customer {
	private int custNo;
	private String custName;
	private String custAddr;
	private static int billNo;

	static {
		billNo = 1000; 
	}

	public Customer() {
		custNo = 0;
		custName = "Ram";
		custAddr = "";
	}

	public Customer(int custNo, String custName, String custAddr) {
		this.custNo = custNo;
		this.custName = custName;
		this.custAddr = custAddr;
	}

	public static void printBillNo() {
		System.out.println("Bill No: " + billNo);
	}

	public void display() {
		System.out.println("Customer No:" + custNo);
		System.out.println("Customer Name: " + custName);
		System.out.println("Address: " + custAddr);
	}
}
