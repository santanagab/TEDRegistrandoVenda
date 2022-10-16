package RegistrandoVenda;

public class Venda {

    public Produto produto;
    public Vendedor vendedor;
    public float desconto;
    public int quantidadeItens;
    public float valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float calcularValor() {
        float valor = quantidadeItens * produto.getValorVenda();
        return valor;
    }
    
    public float efetuarDesconto() {
        float valor_Desconto = produto.getValorVenda() * 100;
        float valorProdutoDesconto = produto.getValorVenda() - valor_Desconto;

        if (valorProdutoDesconto < produto.getValorCusto()) {
            System.out.printf("Cupom de desconto não se aplica!");
            return produto.getValorVenda();
        }
        return valorProdutoDesconto;

    }
    
    public float calcularComissao() {
        float valorComissao = (float) (valor * vendedor.getComissao());

        if (produto.getPromocao()) {
            valorComissao = valorComissao / 2;
        }
        return valorComissao;
    }

    public void imprimir(){
        System.out.println("CÓD Vendedor: "+ vendedor.getCodigo());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Comissão: "+ vendedor.getComissao());
        System.out.println("QTD itens: "+ quantidadeItens);
        System.out.println("CÓD Produto: "+ produto.getCodigo());
        System.out.println("Descrição Produto: "+produto.getDescricao());
        System.out.println("Valor Produto: R$ "+ produto.getValorVenda());
        System.out.println("Promoção: " + (produto.getPromocao() ? "SIM" : "NÃO"));
        System.out.println("Valor Desconto: R$ "+ desconto);
        System.out.println("Valor total: R$ "+ valor);
    }


}
