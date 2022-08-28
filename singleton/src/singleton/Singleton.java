package singleton;

public class Singleton {

	private static Singleton intancia;
	
	private Singleton() {
		
	}

	public static Singleton getIntancia() {
		
		if (intancia == null) {
			intancia = new Singleton();
		}
		
		return intancia;
	}
	
}
