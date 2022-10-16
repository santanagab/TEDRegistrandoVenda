package RegistrandoVenda;

public class UsaVenda {

    public static void main(String[] args) {
        Produto produto_1 = new Produto(13, "Cerveja", 40, 30, false);

        Vendedor vendedor_1 = new Vendedor("Machado", 98, 5, "Rua 1");
        vendedor_1.setComissao(2f);


        Venda venda_1 = new Venda();
        venda_1.setProduto(produto_1);
        venda_1.setVendedor(vendedor_1);
        venda_1.setQuantidadeItens(2);
        venda_1.setDesconto(10f);


        float valorVenda_1 = venda_1.calcularValor();
        venda_1.setValor(valorVenda_1);
        System.out.printf("Valor: R$ %.2f", valorVenda_1);

        float valorComissao_1 = venda_1.calcularComissao();
        System.out.printf("Comissão: R$ %.2f", valorComissao_1);

        venda_1.imprimir();


        Produto produto_2 = new Produto(31, "fone de ouvido", 80, 100, true);

        Vendedor novo_vendedor = new Vendedor("Alírio", 2, 5, "Rua 2");

        Venda venda_2 = new Venda();
        venda_2.setProduto(produto_2);
        venda_2.setVendedor(novo_vendedor);
        venda_2.setQuantidadeItens(3);
        venda_2.setDesconto(10f);

        float valorVenda_2 = venda_2.calcularValor();
        venda_2.setValor(valorVenda_2);
        System.out.printf("Valor: R$ %.2f", valorVenda_2);


        float valorComissao_2 = venda_2.calcularValor();
        System.out.printf("Comissão: R$ %.2f", valorComissao_2);

        venda_2.imprimir();


        Venda venda_3 = new Venda();
        venda_3.setProduto(produto_2);
        venda_3.setVendedor(novo_vendedor);
        venda_3.setQuantidadeItens(2);

        float valorDesconto = venda_3.efetuarDesconto();
        System.out.printf("Valor com desconto: R$ " +valorDesconto);

        float valorVenda_3 = venda_3.calcularValor();
        venda_3.setValor(valorVenda_3);
        System.out.printf("Comissão: R$ %.2f", valorVenda_3);

        float valorComissao_3 = venda_3.calcularComissao();
        System.out.printf("Comissão: R$ 2.f", valorComissao_3);

        venda_3.imprimir();

    }

}
