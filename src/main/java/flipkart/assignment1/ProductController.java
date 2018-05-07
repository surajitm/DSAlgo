package flipkart.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;


class Product{
	private String name;
	private String id;
	private String category;
    
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", category=" + category ;
	}

	public Product(String name,String id,String category){
		this.name=name;
		this.id=id;
		this.category=category;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



}

class User{
   private String name;
   private String userId;
   private boolean isPurchase;
   private boolean isReturned;
   
   public boolean isPurchase() {
	   return isPurchase;
   }
   public void setPurchase(boolean isPurchase) {
	this.isPurchase = isPurchase;
   }
   public boolean isReturned() {
	return isReturned;
   }
   public void setReturned(boolean isReturned) {
	this.isReturned = isReturned;
   }
   public User(String name,String userId){
	   this.name=name;
	   this.userId=userId;
   }
  public String getName() {
	return name;
	}

  public void setName(String name) {
	this.name = name;
  }

  public String getUserId() {
	return userId;
  }

  public void setUserId(String userId) {
	this.userId = userId;
  }
@Override
public String toString() {
	return "User [name=" + name + ", userId=" + userId + "]";
}
//@Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + ((name == null) ? 0 : name.hashCode());
//	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
//	return result;
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	User other = (User) obj;
//	if (name == null) {
//		if (other.name != null)
//			return false;
//	} else if (!name.equals(other.name))
//		return false;
//	if (userId == null) {
//		if (other.userId != null)
//			return false;
//	} else if (!userId.equals(other.userId))
//		return false;
//	return true;
//}


   
}

public class ProductController {
	private ArrayList<Product> productList=new ArrayList<>();
	private Map<Product,LinkedHashSet<User>> purchaseList=new HashMap<>();
	
	
	public void addProduct(Product p){
		productList.add(p);
	}
	
	public void showDB(){
		for(Product p:productList){
			System.out.println(p);
		}
	}
	
	private int getPurchaseCount(Product p){
		int size=0;
		if(purchaseList.containsKey(p)){
			size=purchaseList.get(p).size();
		}else{
			System.out.println("Product not found.");
		}
		return size;
	}
	
	public Product getBestSellingProduct(){
		int max=Integer.MIN_VALUE;
		Product maxp=null;
		int size=0;
		for(Product p:productList){
			size=getPurchaseCount(p);
			if(size>max){
				max=size;
				maxp=p;
			}
		}
		return maxp;
	}
	
	
	public void showPurchaseList(){
		System.out.println(purchaseList);
	}
	
	public void purchase(User u,Product p){
		u.setPurchase(true);
		u.setReturned(false);
		if(purchaseList.containsKey(p)){
			purchaseList.get(p).add(u);
		}else{
			LinkedHashSet<User> list=new LinkedHashSet<>();
			list.add(u);
			purchaseList.put(p,list);
		}
	}
	
	public void returnProduct(User u,Product p){
       if(purchaseList.containsKey(p)){
    	   LinkedHashSet<User> uset=purchaseList.get(p);
    	   for(User u1:uset){
    		   if(u1.equals(u)){
    			   u1.setPurchase(false);
    			   u1.setReturned(true);
    		   }
    	   }
       }
	}
	
	public void blacklist(User u){
	
	}
	
}
