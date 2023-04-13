class Loja:
    def __initi__ (self):
        print('Loja Online: Seja bem vindo! \n')

    def pedido(self):
        self.receber_pedido = RecebePedido()
        self.receber_pedido.recebePedido()
        self.confirmar_pagamento = ConfirmaPagamento()
        self.confirmar_pagamento.confirmaPagamento()
        self.separar_pedido = SeparaPedido()
        self.enviar_pedido = EnviaPedido()

class RecebePedido:
    def __init__(self):
        print('Recebendo pedido... \n')   
        
    def pedido_ok(self):
        return True

    def recebePedido(self):
        if self.pedido_ok():
            print('Pedido confirmado!\n')

class ConfirmaPagamento:
    def __init__(self):
        print('Verificando método de pagamento...\n')
    
    def pagamento_ok(self):
        return True
    
    def confirmaPagamento(self):
        if self.pagamento_ok():
            print('Pagamento ok!\n')

class SeparaPedido:
    def __init__(self):
        print('Separando pedido e preparando para envio...\n')

class EnviaPedido:
    def __init__(self):
        print('Pedido enviado!')

class Site:
    def __init__(self):
        print('Cliente iniciou visita ao site')

    def recebeCompra(self):
        ('Cliente confirmou carrinho de compras e iniciará pedido...')
        pe = Loja()
        pe.pedido()

if __name__ == '__main__':
    compra = Site()
    compra.recebeCompra()