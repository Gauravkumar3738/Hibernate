package spring_core.spring_core;

public class Abcus {

	private Calculator calc1;
	
	public Abcus() {
		System.out.println("Abcus object");
	}
	
	public Calculator getCalc1() {
		return calc1;
	}

	public void setCalc1(Calculator calc1) {
		this.calc1 = calc1;
	}

	public void calcSum(double n1, double n2){
		double d=calc1.sum(n1, n2);
		System.out.println("sum :"+d);
	}
}


