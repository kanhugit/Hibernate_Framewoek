package in.kanha;

public class SingleTon {
	
	static SingleTon st=new SingleTon();
	
	private void SingleTon() {
		System.out.println("Single ton class excuted...");
		System.out.println("Single ton class excuted...");
		
	}

	public static SingleTon getSt() {
		return st;
	}

	public static void setSt(SingleTon st) {
		SingleTon.st = st;
	}
	
	public static void main(String[] args) {
		st.SingleTon();
	}
	
}
