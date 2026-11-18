package day09;

public class Class05 {

	public static void main(String[] args) {
		TV tv = new TV();
		TV infoTV = new TV("Samsung", 3, 3);
		infoTV.name();
		for (int i = 0; i < 2; i++) {
			infoTV.power();
		}
		infoTV.chUp();
		infoTV.chDown();
		infoTV.power();
		infoTV.infoCh();
		for (int i = 0; i < 21; i++) {
			infoTV.chUp();
		}
		for (int i = 0; i < 22; i++) {
			infoTV.chDown();
		}
		for (int i = 0; i < 11; i++) {
			infoTV.volUp();
		}
		for (int i = 0; i < 11; i++) {
			infoTV.volDown();
		}
		infoTV.infoFav();
		infoTV.infoCh();
		for (int i = 0; i < 8; i++) {
			infoTV.chDown();
			infoTV.fav();
			infoTV.infoFav();
		}

	}

}

class TV {
//	채널 0~20까지 (순환구조)
//	볼륨 0~10까지(0=음소거)
//	선호채널 등록(5개 까지)

//	1.선호채널 등록 매서드(배열에 넣기)
//	2.선호채널 리스트 보기 > 등록되어있는 만큼만 리스트로 >> 넘으면 배열 증가 혹은 처음 등록한것 삭제

	private boolean power;
	private int ch, vol, cnt;
//	private int[][] fav = {{-1,0},{-1,0},{-1,0},{-1,0},{-1,0}};
	private int fav[]= new int[5];
	private String brand;

	public TV() {
	}

	public TV(String brand, int vol, int ch) {
		for (int i = 0; i < this.fav.length; i++) {
			this.fav[i] = -1;
		}
		this.brand = brand;
		this.vol = vol;
		this.ch = ch;
	}

	public void name() {
		System.out.println("제조사 " + this.brand + " tv ");
	}

	public void infoPower() {
		String stat = this.power ? "전원 On" : "전원 Off";
		System.out.println(stat);
	}

	public void infoCh() {
		System.out.println("현재 채널 : " + this.ch);
	}

	public void infoVol() {
		System.out.println("현재 볼륨 : " + this.vol);
	}

//	public void infoFav() {
//		System.out.println("------Fav List------");
//		for (int i = 0; i < fav.length; i++) {
//			if (fav[i][0] == -1) {
//				break;
//			}
//			System.out.println("선호채널 : "+fav[i][0]);
//		}
//		System.out.println("--------------------");
//	}
	public void infoFav() {
		System.out.println("------Fav List------");
		for (int i = 0; i < fav.length; i++) {
			if (fav[i] == -1) {
				break;
			}
			System.out.println("선호채널 : " + fav[i]);
		}
		System.out.println("--------------------");
	}

	public void ckPower() {
		System.out.println("전원부터 켜주세요");
	}

	public void power() {
		this.power = !(this.power);
		if (this.power) {
			infoPower();
		}
	}

	public void chUp() {
		if (!(this.power)) {
			ckPower();
			return;
		} else {
			this.ch = (this.ch + 1) % 21;
			System.out.print("채널을 올렸습니다. ");
			infoCh();
		}
	}

	public void chDown() {
		if (!(this.power)) {
			ckPower();
		} else {
			this.ch = (this.ch + 20) % 21;
			System.out.print("채널을 내렸습니다. ");
			infoCh();
		}
	}

	public void volUp() {
		if (!(this.power)) {
			ckPower();
		} else if (vol == 10) {
			System.out.println("최대 볼륨입니다. 더이상 올라가지 않습니다.");
		} else {
			this.vol = this.vol + 1;
			System.out.print("볼륨을 올렸습니다. ");
			infoVol();
		}
	}

	public void volDown() {
		if (!(this.power)) {
			ckPower();
		} else if (vol == 0) {
			System.out.println("음소거 중입니다. 더이상 내려가지 않습니다.");
		} else {
			this.vol = this.vol - 1;
			System.out.print("볼륨을 내렸습니다. ");
			infoVol();
		}
	}

	public void fav() {
		if (!(this.power)) {
			ckPower();
		} else {
			for (int i = 0; i < this.fav.length; i++) {
				if (this.fav[i] == -1) {
					this.fav[i] = this.ch;
					this.cnt++;
					return;
				}else {
					this.fav[cnt%5]=this.ch;
					this.cnt++;
				}

			}
		}

	}

//	public void fav() {
//		if (!(this.power)) {
//			ckPower();
//		} else {
//			for (int i = 0; i < this.fav.length; i++) {
//				if (this.fav[i][0] == -1) {
//					this.fav[i][0] = this.ch;
//					this.fav[i][1] = this.cnt++;
//					return;
//				} 
//			}
//			int min = ckMin(fav);
//			this.fav[ckMin(fav)][0] = this.ch;
//			this.fav[ckMin(fav)][1] = this.cnt++;
//		}
//
//	}
//	public int ckMin(int fav[][]) {
//		int min=0;
//		for(int i=1;i<fav.length;i++) {
//			if(fav[i][1]<fav[min][1]) {
//				min = i;
//			}
//		}
//		return min;
//	}
}
