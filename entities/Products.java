package entities;

public class Products {

	public String name;
	public double price;
	public int quantity;

	public double totalValueinStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+" preço unitário de $"
		+ String.format("%.2f", price)
		+","
		+" quantidade total no estoque: "
		+ quantity
		+", "
		+"valor total em estoque: $ "
		+ String.format("%.2f", totalValueinStock());
		
	}

}
