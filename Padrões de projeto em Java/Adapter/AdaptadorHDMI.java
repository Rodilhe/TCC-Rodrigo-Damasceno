public class AdaptadorHDMI extends HDMI{
    private VGA caboVGA;

    public AdaptadorHDMI(VGA caboVga){
        this.caboVGA=caboVga;
    }
    public void conectaNaEntradaHDMI(){
        caboVGA.conectaNaEntradaVGA();
    }
}