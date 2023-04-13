# Python program showing
# abstract base class work

from abc import ABC, abstractmethod

class Polygon(ABC):

	@abstractmethod
	def noofsides(self):
		pass

class Triangle(Polygon):

	# overriding abstract method
	def noofsides(self):
		print("Eu tenho 3 lados")

class Pentagon(Polygon):

	# overriding abstract method
	def noofsides(self):
		print("Eu tenho 5 lados")

class Hexagon(Polygon):

	# overriding abstract method
	def noofsides(self):
		print("Eu tenho 6 lados")

class Quadrilateral(Polygon):

	# overriding abstract method
	def noofsides(self):
		print("Eu tenho 4 lados")

# Driver code
R = Triangle()
R.noofsides()

K = Quadrilateral()
K.noofsides()

R = Pentagon()
R.noofsides()

K = Hexagon()
K.noofsides()