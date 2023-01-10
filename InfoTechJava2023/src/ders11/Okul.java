package ders11;

public class Okul {

	protected int num1 = 10;
	public String name = "Ali";
	private int num2 = 11;
	
	public Okul() {
		
		System.out.println("Parent Okul Constructor.");
	}
	
	public int getNum2() {
		
		return num2;
	}
	
	public void setNum2(int num2) {
		
		this.num2 = num2;
	}
	
}
