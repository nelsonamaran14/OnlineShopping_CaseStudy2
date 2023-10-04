package in.mindcraft.pojos;

public class Customer {
	
	private int cid;
	
	private String name;
	
	private double balance;

	public Customer() {
		super();
	}

	public Customer(int cid, String name, double balance) {
		super();
		this.cid = cid;
		this.name = name;
		this.balance = balance;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
