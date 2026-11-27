package day19;

public class AnonymousClass01 {

	public static void main(String[] args) {

		AnonymousClass01 ac= new AnonymousClass01();
//		power 구현체를 만들어 객체 생성 후 매개변수 전달
//		TV t = new TV();
//		ac.TvPower(t);
		
//		익명클래스 구현하는 방법
		ac.TvPower(new Power() {

			@Override
			public void turnOn() {
				System.out.println("전원 ON");
			}

			@Override
			public void turnOff() {
				System.out.println("전원 OFF");
			}
			
		});
		
	}
	public void TvPower(Power p) {
		p.turnOn();
		System.out.println("TV가 정상 작동됩니다.");
		p.turnOff();
	}

}
interface Power{
	void turnOn();
	void turnOff();
}
//class TV implements Power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("LG TV ON");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("LG TV OFF");
//		
//	}
//}