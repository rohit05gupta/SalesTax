import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetData extends Taxation {
	
	//constructor
	GetData(){}
	
	protected ArrayList<Goods> getInput(BufferedReader reader) throws IOException {
		int bill = 1; String name; String cat; int imp; double price; int qty;
		
		ArrayList<Goods> prodList = new ArrayList<Goods>();
		
		//get the inputs
				while(bill != 0) {
					boolean flag = false;
					System.out.println("Name of product: ");
					name = reader.readLine();
					System.out.println("Product category: ");
					cat = reader.readLine();
					System.out.println("Press 1 if the product is imported else press 0: ");
					imp = Integer.parseInt(reader.readLine());
					System.out.println("Product price: ");
					price = Double.parseDouble(reader.readLine());
					System.out.println("Product quantity: ");
					qty = Integer.parseInt(reader.readLine());
					System.out.println("Press 0 to generate bill, 1 to continue: ");
					bill = Integer.parseInt(reader.readLine());
					
					if(imp == 1) {
						flag = true;
						Goods product = new Goods(name, cat, flag, price, qty);
						prodList.add(product);
					}else {
						Goods product = new Goods(name, cat, flag, price, qty);
						prodList.add(product);
					}
				}
		return prodList;
	}
	
	protected void printOutput(ArrayList<Goods> prodList, GetData b) {
		double totalTax = 0; double total = 0;
		//calculate and print the output
				System.out.println("*************Final Bill*************");
				for(Goods g : prodList) {
					System.out.println(g.getProductQuantity()+" "+g.getProductName()+": "+b.roundOff(Math.round((g.getProductQuantity()*(g.getProductPrice()+b.calculateTax(g)))*100.0)/100.0));
					totalTax+= b.calculateTax(g);
					total+=g.getProductQuantity()*(g.getProductPrice()+b.roundOff(b.calculateTax(g)));
				}
			
				System.out.println("Sales Taxes: "+b.roundOff(Math.round(totalTax*100.0)/100.0));
				System.out.println("Total: "+b.roundOff(Math.round(total*100.0)/100.0));
	}
	
}
