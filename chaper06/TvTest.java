class Tv {
	// Tv의 속성 - 멤버 변수 
	String color;		// 색상
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	// Tv의 기능 - 메소드
	void power() { power = !power; }	// Tv를 켜거나 끄는 기능
	void channelUp() { ++channel; }		// 채널을 높이는 기능
	void channelDown() { --channel; }	// 채널을 낮추는 기능
}

class TvTest {
	public static void main(String args[]) {
		Tv t;		// Tv 인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv();		// Tv 인스턴스 생성 
		t.channel = 7;		// Tv 인스턴스의 멤버변수 channel의 값을 7
		t.channelDown();	// 메소드 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}