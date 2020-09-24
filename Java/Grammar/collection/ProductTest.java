package collection;

import java.util.HashSet;
import java.util.Iterator;

class Product {
	private String productID;
	private String productName;
	private String productPrice;

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productPrice = productPrice;
		this.productName = productName;

	}
	@Override
	public int hashCode() {
		return productID.hashCode();
	}
	// public int hashCode(매개변수 없음!!!!!){
	// @Override는 오버라이딩한 함수라는 의미

	public boolean equals(Object o) {
		boolean result = false;
		if (o != null && o instanceof Product) {
			Product p = (Product) o;
			if (productID.equals(p.productID))
				result = true;
		}
		return result;

	}

	public String toString() {
		return productID+"    "+productName+"     "+productPrice;

	}
}

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> hs = new HashSet<>();

		Product obj[] = new Product[4];
		obj[0] = new Product("p100", "TV", "20000");
		obj[1] = new Product("p200", "Computer", "10000");
		obj[2] = new Product("p100", "MP3", "700");
		obj[3] = new Product("p300", "Audio", "1000");

		for (int i = 0; i < obj.length; i++) {
			if (hs.add(obj[i])) {
			//	hs.add(obj[i]);
				System.out.println("성공적으로 저장되었습니다");
			} else
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다");
		}
		System.out.println("제품 ID     제품명      가격");
		System.out.println("--------------------------------");
		Iterator<Product> iterator = hs.iterator();
		while (iterator.hasNext()) {
			Product p = iterator.next();
			System.out.println(p.toString());

		}

	}

}
