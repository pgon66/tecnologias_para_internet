package singleton;

public class Principal {

	public static void main(String[] args) {
		
		Singleton sing_01 = Singleton.getIntancia();
		Singleton sing_02 = Singleton.getIntancia();
		
		if (sing_01 == sing_02) {
			System.out.println("Esses objetos sao IGUAIS");
		} else {
			System.out.println("Esses objetos sao DIFERENTES");
		}
		
	}

}
