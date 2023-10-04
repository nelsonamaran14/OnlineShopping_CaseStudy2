package in.mindcraft.pojos;

public class Product {
	private int id;
	private String name;
	private double cost;
	private int quantity;
	private double discount;
	
	public Product() {
	
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
	public Product(int id, String name, double cost, int quantity, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity=quantity;
		this.discount=discount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + ", discount="
				+ discount + "]";
	}
	
	
	

}