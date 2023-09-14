package openclosed;

public class Debito extends Pagamento{
    @Override
    public void Pagar (int valor){
        System.out.println("openclosed.Pagamento por débito feito.");
        //openclosed.Pagamento em openclosed.Debito
    }
}
