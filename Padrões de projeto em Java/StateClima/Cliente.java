public class Cliente {
    public static void main(String[] args) {     
        MudaEstado clima = new MudaEstado();
        clima.mudaEstado();
        System.out.println(clima.clima.getTempo());
        clima.mudaEstado();
        System.out.println(clima.clima.getTempo());
        clima.mudaEstado();
        System.out.println(clima.clima.getTempo());
    }    
}
