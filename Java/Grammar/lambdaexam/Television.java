package lamdaexam;

public class Television implements RemoteControl2{
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAX_VOLUME) {
			this.volume = RemoteControl2.MAX_VOLUME;
		} else if(volume<RemoteControl2.MIN_VOLUME) {
			this.volume = RemoteControl2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + volume);
	}
}
