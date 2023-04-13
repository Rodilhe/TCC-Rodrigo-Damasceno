public abstract class Retangulo{
    public int Altura;
    public int Largura;
    public void setLargura(int largura){ Largura = largura;}
    public void setAltura(int altura){ Altura = altura;}
    public int getLargura(){    return Largura;}
    public int getAltura(){    return Altura;}
    public int getArea(){    return Largura * Altura;}    
}

@Override
public class Quadrado implements Retangulo{
    public @Override void setLargura(int largura){
        Largura = largura;

    }
}