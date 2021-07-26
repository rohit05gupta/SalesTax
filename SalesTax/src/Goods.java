
public class Goods {
	private String productTypes;
	private boolean imported;
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	Goods(String productName, String productType, boolean imported, double productPrice, int productQuantity){
		this.productName = productName;
		this.productTypes = productType;
		this.imported = imported;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public String getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(String productTypes) {
		this.productTypes = productTypes;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
}
