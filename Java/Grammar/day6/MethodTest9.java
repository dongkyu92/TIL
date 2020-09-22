package day6;

public class MethodTest9 {
	public static void main(String[] args) {
		int size = MethodLab3.getRandom(3, 8);  // 3~8 ������ ���� ��������
		int p[] = new int[size]; // ������ ���� ���� ��ŭ�� ũ���� p �迭 ����
		for (int i = 0; i < p.length; i++)
			p[i] = MethodLab3.getRandom(20); // p�迭 ũ�⸸ŭ ���� ������ �迭�� 1~20 ������ ���� ���� �Ҵ�
		for (int data : p)
			System.out.print(data + " "); // p�迭 ������ ���
		System.out.println();
		boolean flag[] = isEven(p); // p�� ¦������ Ȯ�� flag���� 0, 1 ���� ����
		for (boolean data : flag)
			System.out.print(data ? "¦��":"Ȧ��" + " "); // data == true ? �� ������ boolean ���� data�� �ᵵ ��.
		System.out.println();
	}

	// ���޵� �迭�� ��Ұ����� ���� üũ�Ͽ�
	// ¦���� true Ȧ���� false�� �����ϴ� boolean Ÿ�� �迭�� �����Ѵ�.
	// �̶� ���޵� �迭�� ũ��� ������ ũ���� boolean Ÿ���� �迭�� �����ؼ� ����
	static boolean[] isEven(int[] p) {
		boolean[] result = new boolean[p.length];
		// for(int data : p)// p �� �ϳ��ϳ� ������ data�� ���� -> �Ϲ� for������ �ϴ°� ���� data���� �� �ٽ�
		// �����ؾ߱� ����
		for (int i = 0; i < p.length; i++)
			result[i] = p[i] % 2 == 0 ? true : false;
		return result;

	}
}