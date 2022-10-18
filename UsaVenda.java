package RegistrandoVenda;

public class UsaVenda {

    public static void main(String[] args) {
        System.out.println("[VENDA 1]");
        Produto produto = new Produto(13, "cerveja", 100.00f, 50.00f, false);
        Vendedor vendedor_1 = new Vendedor("Alírio", 98, 5.00f, "Rua 1");

        Venda venda_1 = new Venda();
        venda_1.setProduto(produto);
        venda_1.setVendedor(vendedor_1);
        venda_1.setQuantidadeItens(2);
        venda_1.setDesconto(0);

        float valorVenda_1 = venda_1.calcularValor();
        venda_1.setValor(valorVenda_1);

        venda_1.imprimir();


        System.out.println("[VENDA 2]");
        Produto produto_2 = new Produto(27, "Camisa", 100.00f, 80.00f, true);
        Vendedor vendedor_2 = new Vendedor("Machado", 76, 10f, "Rua 2");

        Venda venda_2 = new Venda();
        venda_2.setProduto(produto_2);
        venda_2.setVendedor(vendedor_2);
        venda_2.setQuantidadeItens(3);
        venda_2.setDesconto(10);

        float valorVenda_2 = venda_2.calcularValor();
        venda_2.setValor(valorVenda_2);
        float valorComissao2 = venda_2.calcularValor();

        venda_2.imprimir();


        System.out.println("[VENDA 3]");
        Venda venda_3 = new Venda();
        venda_3.setProduto(produto_2);
        venda_3.setVendedor(vendedor_2);
        venda_3.setQuantidadeItens(2);

        float valorVenda3 = venda_3.calcularValor();
        venda_3.setValor(valorVenda3);
        float valorComissao3 = venda_3.calcularComissao();

        venda_3.imprimir();

    }

}
