
public class Taxation {
	private double taxAmount;

	Taxation() {
		this.taxAmount = 0;
	}
	
	//sales tax calculation
	protected double calculateTax(Goods product) {
		try {
			//check if it is exempted product, if it is book or food or medical product then no Sales tax.
			if (product.getProductTypes().equalsIgnoreCase("book") || product.getProductTypes().equalsIgnoreCase("medical")
					|| product.getProductTypes().equalsIgnoreCase("food")) {
				//check if the product is imported.
				if (product.isImported()) {
					taxAmount = Math.round((product.getProductPrice() * 0.05)*100.0)/100.0;
				} else {
					taxAmount = 0;
				}
			} 
			else { 
				//if the product is neither exempted nor imported then 15% tax.
				if (product.isImported()) {
					//using Math.round function and multiplying and dividing by zero to maintain two digits after decimal
					taxAmount = Math.round((product.getProductPrice() * 0.15)*100.0)/100.0;
				} else {
					taxAmount = Math.round((product.getProductPrice() * 0.10)*100.0)/100.0;
				}
			}
		} 
		catch(Exception e){
			System.out.println("Exception caught"+e);
		}
		 
		 return taxAmount;
	}
	
	//rounding rule for sales tax
	public double roundOff(double val) {
		if((val*100)%10 < 5 && (val*100)%10 > 0) {
			 val+=0.05-((val*100)%10)/100;
		 }
		return val;
	}

}
