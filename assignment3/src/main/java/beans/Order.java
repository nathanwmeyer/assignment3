package beans;

public class Order {

	//list of variables
	public String orderNumber;
	public String productName;
	
	public float price;
	public int quantity;
	
	public Order()//default constructor
	{
		this.orderNumber = "";
		this.productName = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	public Order(String orderNumber, String productName, float price, int quantity) {//parameterized constructor
		super();
		this.orderNumber = orderNumber;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Getter and Setter methods
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
