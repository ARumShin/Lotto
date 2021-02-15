package lotto;

public class LottoDTO {
	private int drwNo;
	private int b1;
	private int b2;
	private int b3;
	private int b4;
	private int b5;
	private int b6;
	private int b7;

	public LottoDTO() {}
	public LottoDTO(int drwNo,int b1,int b2,int b3,int b4,int b5,int b6,int b7) {
		this.drwNo=drwNo;
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
		this.b5=b5;
		this.b6=b6;
		this.b7=b7;
		
	}
	public int getDrwNo() {
		return drwNo;
	}
	public void setDrwNo(int drwNo) {
		this.drwNo = drwNo;
	}
	public int getB1() {
		return b1;
	}
	public void setB1(int b1) {
		this.b1 = b1;
	}
	public int getB2() {
		return b2;
	}
	public void setB2(int b2) {
		this.b2 = b2;
	}
	public int getB3() {
		return b3;
	}
	public void setB3(int b3) {
		this.b3 = b3;
	}
	public int getB4() {
		return b4;
	}
	public void setB4(int b4) {
		this.b4 = b4;
	}
	public int getB5() {
		return b5;
	}
	public void setB5(int b5) {
		this.b5 = b5;
	}
	public int getB6() {
		return b6;
	}
	public void setB6(int b6) {
		this.b6 = b6;
	}
	public int getB7() {
		return b7;
	}
	public void setB7(int b7) {
		this.b7 = b7;
	}
	
}
