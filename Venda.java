package RegistrandoVenda;

public class Venda {

    public Produto produto;
    public Vendedor vendedor;
    public int desconto;
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

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto =  desconto;
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
        float valor = quantidadeItens * produto.getValorVenda() - desconto;
        return valor;
    }

    public float calcularComissao() {
        float valorComissao = valor * vendedor.getComissao();

        if (this.produto.getPromocao()) {
            valorComissao = valorComissao / 2;
        }
        return valorComissao;
    }

    public  int efetuarDesconto(float desconto) {
        int valorDesconto = (int) (produto.getValorVenda() * desconto / 100);
        float valorProdutoDesconto = produto.getValorVenda() - valorDesconto;

        if (valorProdutoDesconto < this.produto.getValorCusto()){
            System.out.println("DESCONTO NÃO APLICADO");
            System.out.println("Valor desconto é menor que o valor total");
            return (int) produto.getValorVenda();
        }
        return (int) valorProdutoDesconto;

    }

    public void imprimir(){
        System.out.println("COD Vendedor: "+ this.vendedor.getCodigo());
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Comissão: " + this.vendedor.getComissao() + " %");
        System.out.println("COD Produto: "+ this.produto.getCodigo());
        System.out.println("Descrição Produto: "+ this.produto.getDescricao());
        System.out.println("QTD Itens: "+ quantidadeItens);
        System.out.println("Valor Venda: R$ "+ this.produto.getValorVenda());
        System.out.println("Promoção: " + (this.produto.getPromocao() ? "SIM" : "NÃO"));
        System.out.println("Valor Desconto: " + desconto + " %");
        System.out.println("Valor total: R$ "+ this.valor);

    }
}
