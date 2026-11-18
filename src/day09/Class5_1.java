package day09;

import java.util.Arrays;


public class Class5_1 {

	public static void main(String[] args) {
		TeleVision t = new TeleVision();
		System.out.println(t.toString());
		t.power();
		t.pick();
		t.favorlist();
		System.out.println(t.toString());
		t.chUp();
		t.pick();
		t.favorlist();
		
	}

}

class TeleVision{
	private final String BRAND="LG";
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor;
	private int index;
	private int count;
	
//	배열 늘려 무한값
	public void pick() {
		boolean check = false;
		if(power) {
			if(index<=favor.length) {
				int[] arr = new int[favor.length+3];
				System.arraycopy(favor, 0, arr, 0, favor.length);
				favor=arr;
			}
			
			for(int i =0; i<favor.length;i++) {
				if(favor[i]==ch){
					check =true;
				}
			}
			if(!check) {
				favor[index]=ch;
				index++;
			}
		}
	}
	
//	선호채널 FIFO
//	public void pick(){
//		boolean check = false;
//		if(power) {
//			if(favor.length==index) {
//				index=0;
//			}
//			for(int i =0; i<favor.length;i++) {
//				if(favor[i]==ch){
//					check =true;
//				}
//			}
//			if(!check) {
//				favor[index]=ch;
//				index++;
//				count++;
//			}
//			System.out.println(ch+"번 선호채널 등록완료!!");
//		}
//	}
	
	public void favorlist() {
		System.out.println("-------선호채널 List-------");
		if(count==0) {
			System.out.println("등록된 선호채널이 없습니다.");
			return;
		}
		if(count>5) {
			for(int i=0;i<favor.length;i++) {
				System.out.print(favor[i]+" ");
			}
			return;
		}
		int cnt =count>index?favor.length:index;
		for(int i=0;i<cnt;i++) {
			System.out.println(favor[i]+" ");
		}
		for(int i=0;i<index;i++) {
			System.out.print(favor[i]+" ");
		}
		System.out.println();
	}
	
	public TeleVision() {
		this.ch = 3;
		this.vol = 3;
		this.favor = new int[5];
	}
	
	public void power() {
		this.power=!this.power;
		if(this.power) {
			System.out.println(BRAND+"TV 전원이 켜집니다.");
		}else {
			System.out.println(BRAND+"TV 전원이 꺼집니다");
		}
	}
	
	public void chUp() {
		if(this.power) {
			this.ch++;
			if(ch>10) {
				this.ch=1;
			}
			System.out.println("ch : "+this.ch);
		}
	}
	
	public void chDown() {
		if(this.power){
			this.ch--;
			if(this.ch<0) {
				this.ch=10;
			}
			System.out.println("ch : "+this.ch);
		}
	}
	
	public void volUp() {
		if(this.power) {
			this.vol++;
			if(this.vol==10) {
				this.vol=10;
			}
			System.out.println("vol : "+this.vol);
		}
	}
	
	public void volDown() {
		if(this.power) {
			this.vol--;
			if(this.vol<=0) {
				this.vol=0;
				System.out.println("음소거");
			}
			System.out.println("vol : "+this.vol);
		}
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	@Override
	public String toString() {
		return "TV [BRAND=" + BRAND + ", power=" + power + ", ch=" + ch + ", vol=" + vol + ", favor="
				+ Arrays.toString(favor) + "]";
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}
}