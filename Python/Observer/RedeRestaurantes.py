from abc import ABCMeta, abstractmethod
from typing import List

class Observer(metaclass=ABCMeta):
    @abstractmethod
    def atualizar(cardapio):
        pass

class Subject(metaclass=ABCMeta):
    @abstractmethod
    def adicionaFilial(self,observer: Observer):
        pass
    @abstractmethod
    def retiraFilial(self,observer: Observer):
        pass
    @abstractmethod
    def notificarFiliais(self):
        pass    

class Matriz (Subject):
    filiais: List[Observer] = []
    cardapio = []
    def __init__(self):
        pass
    def adicionaFilial(self, filial: Observer):
        self.filiais.append(filial)
        self.notificarFiliais
    def retiraFilial(self, filial: Observer):
        if not filial:
            return self.filiais.pop()            
        else:
            return self.filiais.remove(filial)       
    def notificarFiliais(self):
        for filial in self.filiais:
            filial.atualizar(self.cardapio)    
    def adicionaItemCardapio(self, item):
        self.cardapio.append(item)
        print('Item adicionado:',item ,'. Cardápio atualizado!\n\n')    
    def removeItemCardapio(self, item):
        self.cardapio.remove(item)
   

#Observadores
class FilialRio(Observer):
    cardapio = []
    def __init__(self, filial_restaurante: Subject):
        self.filial_restaurante = filial_restaurante
        self.filial_restaurante.adicionaFilial(self)

    def atualizar(cardapio):
        self.cardapio = cardapio
        
    def exibircardapio(self):
        print('Filial Rio cardapio:')
        print(self.cardapio)

class FilialSP(Observer):
    cardapio = []
    def __init__(self, filial_restaurante: Subject):
        self.filial_restaurante = filial_restaurante
        self.filial_restaurante.adicionaFilial(self)

    def atualizar(cardapio):
        self.cardapio = cardapio
        
    def exibircardapio(self):
        print('Filial Rio cardapio:')
        print(self.cardapio)

#Cliente
if __name__ == '__main__':

    filial = Matriz()
    filialRJ = FilialRio(filial)
    filialSP = FilialSP(filial)
    filial.adicionaItemCardapio('Hamburguer')
    filialRJ.exibircardapio
    filialSP.exibircardapio
