class Tv {
	// Tv�� �Ӽ� - ��� ���� 
	String color;		// ����
	boolean power;		// ��������(on/off)
	int channel;		// ä��
	
	// Tv�� ��� - �޼ҵ�
	void power() { power = !power; }	// Tv�� �Ѱų� ���� ���
	void channelUp() { ++channel; }		// ä���� ���̴� ���
	void channelDown() { --channel; }	// ä���� ���ߴ� ���
}

class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();		
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}