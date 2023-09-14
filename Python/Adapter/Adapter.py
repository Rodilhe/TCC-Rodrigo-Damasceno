class adapter.VGA:
    def conectaNaEntradaVGA(self):
        print(f"Cabo adapter.VGA conectado!")
    pass
class adapter.HDMI:
    def conectaNaEntradaHDMI(self):
        print(f"Cabo adapter.HDMI conectado!")
    pass
class AdaptaHDMI(adapter.HDMI):
    def __init__(self, vga: adapter.VGA):
        self.adaptadorVGA = vga    
    def conectaNaEntradaHDMI(self):
        self.adaptadorVGA.conectaNaEntradaVGA(self)
        pass
    pass

if __name__ == "__main__":
    caboVGA = adapter.VGA
    adaptadorA = AdaptaHDMI(caboVGA)
    adaptadorA.conectaNaEntradaHDMI()