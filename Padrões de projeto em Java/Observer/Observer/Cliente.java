package Observer;

public class Cliente {
    public static void main( String[] args ){
        Matriz filial = new Matriz();
        FilialRio filialRJ = new FilialRio(filial);
        FilialSP filialSP = new FilialSP(filial);
        filial.adicionaItemCardapio("Pizza");
        filialRJ.exibirCardapio();
        filialSP.exibirCardapio();
        filial.adicionaItemCardapio("Hamburgue");
        filialRJ.exibirCardapio();
        filialSP.exibirCardapio();
        filial.adicionaItemCardapio("Salada");
        filialRJ.exibirCardapio();
        filialSP.exibirCardapio();
    }
}