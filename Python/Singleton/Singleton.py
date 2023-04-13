class Universo:

    def __init__(self):
        self.some_attribute = None
universo = Universo()

if __name__ == '__main__':
    universo.some_attribute = 'teste'
    print(universo.some_attribute)
