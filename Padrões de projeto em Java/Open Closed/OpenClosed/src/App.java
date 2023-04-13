import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Qual o tipo de pagamento? \n");
        x = ler.nextInt();
        System.out.println("Qual o valor? \n");
        int n;
        n = ler.nextInt();
        if(x==1){
            TipoPagamento pagamento = TipoPagamento.Credito;
            Pagamento pagar = new Credito();
            pagar.Pagar(n);
        }
        if(x==2){
            TipoPagamento pagamento = TipoPagamento.Debito;
            Pagamento pagar = new Debito();
            pagar.Pagar(n);
        }
        if(x==3){
            TipoPagamento pagamento = TipoPagamento.Pix;
            Pagamento pagar = new Pix();
            pagar.Pagar(n);
        }
        

        
        


    }
}
