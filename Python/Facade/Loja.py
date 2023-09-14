class facade.Loja:
    def __initi__ (self):
        print('facade.Loja Online: Seja bem vindo! \n')

    def pedido(self):
        self.receber_pedido = facade.RecebePedido()
        self.receber_pedido.recebePedido()
        self.confirmar_pagamento = facade.ConfirmaPagamento()
        self.confirmar_pagamento.confirmaPagamento()
        self.separar_pedido = facade.SeparaPedido()
        self.enviar_pedido = facade.EnviaPedido()

class facade.RecebePedido:
    def __init__(self):
        print('Recebendo pedido... \n')   
        
    def pedido_ok(self):
        return True

    def recebePedido(self):
        if self.pedido_ok():
            print('Pedido confirmado!\n')

class facade.ConfirmaPagamento:
    def __init__(self):
        print('Verificando método de pagamento...\n')
    
    def pagamento_ok(self):
        return True
    
    def confirmaPagamento(self):
        if self.pagamento_ok():
            print('openclosed.Pagamento ok!\n')

class facade.SeparaPedido:
    def __init__(self):
        print('Separando pedido e preparando para envio...\n')

class facade.EnviaPedido:
    def __init__(self):
        print('Pedido enviado!')

class Site:
    def __init__(self):
        print('adapter.state.state.clima.Cliente iniciou visita ao site')

    def recebeCompra(self):
        ('adapter.state.state.clima.Cliente confirmou carrinho de compras e iniciará pedido...')
        pe = facade.Loja()
        pe.pedido()

if __name__ == '__main__':
    compra = Site()
    compra.recebeCompra()