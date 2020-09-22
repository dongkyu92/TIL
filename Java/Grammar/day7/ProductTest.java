package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("µàÅ©ÀÎÇü", 5, 10000);
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		Product pd[]= new Product[5];
		
		Product pd0 = new Product("»Ç·Î·Î", 5, 1000);
		Product pd1 = new Product("Æë¼ö", 6, 2000);
		Product pd2 = new Product("ÇÎ±¸", 3, 3000);
		Product pd3 = new Product("ÆÎ¼ö", 4, 6000);
		Product pd4 = new Product("ÆØ±¸", 6, 10000 );
		
		for(int i = 0 ; i< pd.length;i++) {
	//		System.out.printf("%")
		}
		
		pd[0] = pd0;
		pd[1] = pd1;
		pd[2] = pd2;
		pd[3] = pd3;
		pd[4] = pd4;
		
		for(int i= 0 ; i<pd.length;i++) {
			System.out.printf("%s  %d  %,d¿ø \n", pd[i].getName(), pd[i].getBalance(), pd[i].getPrice());
		}
	}

}
