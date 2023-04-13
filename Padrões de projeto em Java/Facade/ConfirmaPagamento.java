public class ConfirmaPagamento {
    public boolean pagamento_ok(){
        return true;
    }
    public void confirmaPagamento(){
        System.out.println("Verificando metodo de pagamento.. \n");
        if(this.pagamento_ok()==true){
            System.out.println("Pagamento Ok!\n");
        }
    }
    
}
