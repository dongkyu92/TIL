package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("��ũ����", 5, 10000);
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
		
		Product pd0 = new Product("�Ƿη�", 5, 1000);
		Product pd1 = new Product("���", 6, 2000);
		Product pd2 = new Product("�α�", 3, 3000);
		Product pd3 = new Product("�μ�", 4, 6000);
		Product pd4 = new Product("�ر�", 6, 10000 );
		
		for(int i = 0 ; i< pd.length;i++) {
	//		System.out.printf("%")
		}
		
		pd[0] = pd0;
		pd[1] = pd1;
		pd[2] = pd2;
		pd[3] = pd3;
		pd[4] = pd4;
		
		for(int i= 0 ; i<pd.length;i++) {
			System.out.printf("%s  %d  %,d�� \n", pd[i].getName(), pd[i].getBalance(), pd[i].getPrice());
		}
	}

}
