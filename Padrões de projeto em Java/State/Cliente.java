public class Cliente {
    public static void main(String[] args) {
        Compra compra = new Compra();
        System.out.println(compra.estado.getStatus());
        compra.mudaEstado();
        System.out.println(compra.estado.getStatus());
        compra.mudaEstado();
        System.out.println(compra.estado.getStatus());
        compra.mudaEstado();
        System.out.println(compra.estado.getStatus());
    }
    
}
