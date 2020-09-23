package day11;

class TV {
	private String model;
	private int size;
	private int chanel;

	TV() {
	}

	TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.chanel = channel;
	}

	public void channelUp() {
		if (this.chanel > 10)
			this.chanel = 1;
		else
			this.chanel += 1;
	}

	public void channelDown() {
		if (this.chanel < 1)
			this.chanel = 10;
		else
			this.chanel -= 1;
	}

	public int getChannel() {
		return chanel;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

}

//---------------------------interface----------------------
interface Rentable {
	void rent();
}

//-------------------------SaleTV-------------------------
class SaleTV extends TV {
	private int price;

	SaleTV() {
	}

	SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("판매 TV채널 " + getChannel() + "번의 프로를 플레이 합니다.");
	}

	public void sale() {
		System.out.println(getModel() + " 모델의 삼품을 판매합니다." + price + "원 을 지불해 주세요.");
	}

	public String toString() {
		//return ("판매상품정보 : 모델명(" + getModel() + "), 가격(" + String.format("%,d", price) + "원), 크기(" + getSize() + ")");
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}

}

//---------------------------RentalTV----------------------
class RentalTV extends TV implements Rentable {
	private int price;

	RentalTV() {
	}

	RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("대여 TV채널 " + getChannel() + "번의 프로를 플레이 합니다.");
	}

	public void rent() {
		System.out.printf("%s 모델의 삼품을 대여합니다. %,d원 을 지불해 주세요.",getModel(),price);
	}

	public String toString() {
		return ("대여상품정보 : 모델명(" + getModel() + "), 가격(" + String.format("%,d", price) + "원), 크기(" + getSize() + ")");

	}

}

//--------------------------main---------------------------
public class TVTest {

	public static void main(String[] args) {
		TV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		TV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		// 채널 업다운을 호출하는데는 아무 문제 없음(TV가 갖고있으니까)
		// PrintALL도 문제없음
		// 문제는 printRentalTv 호출할때임. 
		// printRentalTv는 Rentalble을 상속하는 객체여야함.
		
		//saleTV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		//RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		

		stv.channelUp();
		stv.channelUp();
		rtv.channelDown();
		rtv.channelDown();
		rtv.channelDown();

		printAllTV(stv);
		printAllTV(rtv);
		printRentalTV((RentalTV) rtv);// rtv를 TV rtv = new RentalTV(----); 로 선언했기 때문에..
		//printRentalTV((Rentable) rtv);// ??
	}

	static void printAllTV(TV tv) { //TV tv니까 자식에서 추가로 구현한 멤버는 사용 못함(play())
		// tv에는 rental, sale 객체 올수있음.
		System.out.println(tv.toString());
		if (tv instanceof SaleTV) { // tv라는 매개변수가 SaleTV 타입이냐?
			((SaleTV) tv).play();
			((SaleTV) tv).sale(); // [[중요]] 매개변수가 TV tv라서 TV에서 play가 없으니까 자식으로 강제 형변환 해야 됨.
		}

		else
			((RentalTV) tv).play();

	}

	static void printRentalTV(Rentable tv) { // Rentable 
		tv.rent();
	}
}
