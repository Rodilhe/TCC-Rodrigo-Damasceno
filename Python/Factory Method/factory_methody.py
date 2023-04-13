from abc import ABCMeta, abstractmethod

class Servico (metaclass=ABCMeta):

    @abstractmethod
    def iniciaRota(self):
        pass
    @abstractmethod
    def pegaCarga(self):
        pass
class Ruber(Servico):
    def iniciaRota(self):
        print(f'Iniciando corrida')
    def pegaCarga(self):
        print(f'Passageiros embarcados e está pronto para iniciar')

class Rifood(Servico):
    def iniciaRota(self):
        print(f'Iniciando entrega')
    def pegaCarga(self):
        print(f'Encomenda retirada pronto para iniciar')

class Pedido:
    def cria_pedido(self, tipo):
        if tipo == 'Ruber':
            return Ruber()
        elif tipo == 'Rifood':
            return Rifood()

#CLIENTE
if __name__ == '__main__':
    pedido_tipo = Pedido()
    pedido_nome = input("Ruber ou Rifood: ")
    pedido = pedido_tipo.cria_pedido(pedido_nome)
    pedido.pegaCarga()
    pedido.iniciaRota()
