package flipkart.assignment1;
/*
1) You can add a product -> addProduct("p1")
2) A user can purchase a product -> purchase("u1","p1")
3) A user can return a product -> returnProduct("u1","p1")
4) A user can be blacklisted and all of his purchases will be marked null -> blackListUser("u1")
5) Display the best selling product -> bestSelling()

Best selling product will be the one which have been bought by most number of unique users.
Bonus: Display the best selling products for each category.

 */
public class App {

	public static void main(String[] args) {
		ProductController pc=new ProductController();
        	
		Product p1=new Product("iPhone","Mob-1",  "m-1");
		Product p2 =new Product("iPhone","Mob-2",  "m-2");
		Product p3 =new Product("HarryPotter","book-1","b-1");
		
		User u1=new User("A", "a@gmail.com");	
		User u2=new User("B", "b@gmail.com");		
		User u3=new User("C", "c@gmail.com");
		
		pc.addProduct(p1);
		pc.addProduct(p2);
		pc.addProduct(p3);
		
		pc.purchase(u1, p1);
		pc.purchase(u2, p1);
		pc.purchase(u1, p1);
		pc.purchase(u2,p1);
		pc.purchase(u1, p2);
		pc.purchase(u2, p2);
		pc.purchase(u3, p3);
		pc.purchase(u1, p3);
		
		//pc.showDB();
		pc.showPurchaseList();
		
		//Get best selling product
		Product p=pc.getBestSellingProduct();
		System.out.println(p);
		
	}
	
}
