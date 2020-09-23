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
		System.out.println("�Ǹ� TVä�� " + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}

	public void sale() {
		System.out.println(getModel() + " ���� ��ǰ�� �Ǹ��մϴ�." + price + "�� �� ������ �ּ���.");
	}

	public String toString() {
		//return ("�ǸŻ�ǰ���� : �𵨸�(" + getModel() + "), ����(" + String.format("%,d", price) + "��), ũ��(" + getSize() + ")");
		return String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", getModel(), price, getSize());
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
		System.out.println("�뿩 TVä�� " + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}

	public void rent() {
		System.out.printf("%s ���� ��ǰ�� �뿩�մϴ�. %,d�� �� ������ �ּ���.",getModel(),price);
	}

	public String toString() {
		return ("�뿩��ǰ���� : �𵨸�(" + getModel() + "), ����(" + String.format("%,d", price) + "��), ũ��(" + getSize() + ")");

	}

}

//--------------------------main---------------------------
public class TVTest {

	public static void main(String[] args) {
		TV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		TV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		// ä�� ���ٿ��� ȣ���ϴµ��� �ƹ� ���� ����(TV�� ���������ϱ�)
		// PrintALL�� ��������
		// ������ printRentalTv ȣ���Ҷ���. 
		// printRentalTv�� Rentalble�� ����ϴ� ��ü������.
		
		//saleTV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		//RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		

		stv.channelUp();
		stv.channelUp();
		rtv.channelDown();
		rtv.channelDown();
		rtv.channelDown();

		printAllTV(stv);
		printAllTV(rtv);
		printRentalTV((RentalTV) rtv);// rtv�� TV rtv = new RentalTV(----); �� �����߱� ������..
		//printRentalTV((Rentable) rtv);// ??
	}

	static void printAllTV(TV tv) { //TV tv�ϱ� �ڽĿ��� �߰��� ������ ����� ��� ����(play())
		// tv���� rental, sale ��ü �ü�����.
		System.out.println(tv.toString());
		if (tv instanceof SaleTV) { // tv��� �Ű������� SaleTV Ÿ���̳�?
			((SaleTV) tv).play();
			((SaleTV) tv).sale(); // [[�߿�]] �Ű������� TV tv�� TV���� play�� �����ϱ� �ڽ����� ���� ����ȯ �ؾ� ��.
		}

		else
			((RentalTV) tv).play();

	}

	static void printRentalTV(Rentable tv) { // Rentable 
		tv.rent();
	}
}
