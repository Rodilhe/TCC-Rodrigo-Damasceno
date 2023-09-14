from __future__ import annotations
from abc import ABC, abstractmethod
import random
class state.clima.Clima:
    def __init__(self):
        self.estados = [state.clima.Sol(), Chuva(), state.clima.Nublado()]
        self.estado = None    
    def mudaEstado(self):
        self.estado=self.estados[random.randint(0, 2)]
        return self.estado
class Estado(ABC):
    @staticmethod
    @abstractmethod
    def __str__(self):
        pass
class state.clima.Sol(Estado):
    def __str__(self):
        return "Tempo ensolarado."
class Chuva(Estado):
    def __str__(self):
        return "Tempo chuvoso."

class state.clima.Nublado(Estado):
    def __str__(self):
        return "Tempo state.clima.Nublado."
if __name__ == "__main__":
    clima = state.clima.Clima()
    print(clima.mudaEstado())
    print(clima.mudaEstado())
    print(clima.mudaEstado())

