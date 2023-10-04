package in.mindcraft.pojos;

public class ShopCart {

	private String username;
	private int id;
	private String name;
	private double cost;
	private int quantity;
	private double discount;
	private String invoiced;
	
	
	public ShopCart() {
		
	}

	public ShopCart(String username, int id, String name, double cost, int quantity, double discount,String invoiced) {
		super();
		this.username = username;
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.discount = discount;
		this.invoiced=invoiced;
	}
	

	public String getInvoiced() {
		return invoiced;
	}

	public void setInvoiced(String invoiced) {
		this.invoiced = invoiced;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "ShopCart [username=" + username + ", id=" + id + ", name=" + name + ", cost=" + cost + ", quantity="
				+ quantity + ", discount=" + discount + ", invoiced=" + invoiced + "]";
	}

	
	
	

}
