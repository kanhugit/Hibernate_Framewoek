package in.kanhatech.injection;

public class Engine {
	
	private Integer engineNum;
	private Integer engineCC;
	
	public Engine(Integer engineNum, Integer engineCC) {
		this.engineNum = engineNum;
		this.engineCC = engineCC;
	}
	
	public void engine() {
		System.out.println("Engine Started..");
	}
	
	
	
	
}
