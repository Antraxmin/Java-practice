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

class TvTest {
	public static void main(String args[]) {
		Tv t;		// Tv �ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv();		// Tv �ν��Ͻ� ���� 
		t.channel = 7;		// Tv �ν��Ͻ��� ������� channel�� ���� 7
		t.channelDown();	// �޼ҵ� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}
}