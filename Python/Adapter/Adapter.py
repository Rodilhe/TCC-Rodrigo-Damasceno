class VGA:
    def conectaNaEntradaVGA(self):
        print(f"Cabo VGA conectado!")
    pass
class HDMI:
    def conectaNaEntradaHDMI(self):
        print(f"Cabo HDMI conectado!")
    pass
class AdaptaHDMI(HDMI):
    def __init__(self, vga: VGA):
        self.adaptadorVGA = vga    
    def conectaNaEntradaHDMI(self):
        self.adaptadorVGA.conectaNaEntradaVGA(self)
        pass
    pass

if __name__ == "__main__":
    caboVGA = VGA
    adaptadorA = AdaptaHDMI(caboVGA)
    adaptadorA.conectaNaEntradaHDMI()