from __future__ import annotations
from abc import ABC, abstractmethod
import random
class Clima:
    def __init__(self):
        self.estados = [Sol(), Chuva(), Nublado()]
        self.estado = None    
    def mudaEstado(self):
        self.estado=self.estados[random.randint(0, 2)]
        return self.estado
class Estado(ABC):
    @staticmethod
    @abstractmethod
    def __str__(self):
        pass
class Sol(Estado):
    def __str__(self):
        return "Tempo ensolarado."
class Chuva(Estado):
    def __str__(self):
        return "Tempo chuvoso."

class Nublado(Estado):
    def __str__(self):
        return "Tempo Nublado."
if __name__ == "__main__":
    clima = Clima()
    print(clima.mudaEstado())
    print(clima.mudaEstado())
    print(clima.mudaEstado())

