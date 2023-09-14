package singleton;

public class Universo {
	private static Universo instanciaUnica;
	private Universo() {
    }
	public static synchronized Universo getInstance() {
		if (instanciaUnica == null)
			instanciaUnica = new Universo();
		return instanciaUnica;
	}

	public static void main(String[] args) {
		Universo universo1 = Universo.getInstance();
		Universo universo2 = Universo.getInstance();
		System.out.println(universo1);
		System.out.println(universo2);
	}
}