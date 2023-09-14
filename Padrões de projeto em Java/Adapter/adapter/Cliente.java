package adapter;

public class Cliente {
    public static void main(String args[]) {
		VGA vga = new VGA();
		AdaptadorHDMI adaptadorHDMI = new AdaptadorHDMI(vga);
		adaptadorHDMI.conectaNaEntradaHDMI();
	}
    
}
