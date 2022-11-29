package RegistrandoVendasFile;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("2222", "Bolsa R", 150, 100, false);
        Vendedor v1 = new Vendedor("Camylla", "4455", "Av.Aeroclube");
        Venda ve1 = new Venda();

        ve1.setProduto(p1);
        ve1.setVendedor(v1);
        ve1.setQtdItens(2);
        ve1.calcularValor();
        System.out.println("Valor da Comissão do Vendedor: R$" + ve1.calcularComissao());
        ve1.imprimeVenda();
        System.out.println();


        Produto p2 = new Produto("1213", "Bolsa Santini", 100, 80, true);
        Vendedor v2 = new Vendedor("Tatiana", "4444", "Av.João Pessoa");
        Venda ve2 = new Venda();

        ve2.setProduto(p2);
        ve2.setVendedor(v2);
        ve2.setQtdItens(3);
        ve2.efetuarDesconto(10);
        ve2.calcularValor();

        System.out.println("Valor da Comissão do Vendedor: R$" + ve2.calcularComissao());
        ve2.imprimeVenda();
        System.out.println();

        Venda ve3 = new Venda();
        ve3.setProduto(p2);
        ve3.setVendedor(v2);
        ve3.setQtdItens(2);
        ve3.efetuarDesconto(30);


        ve3.calcularValor();
        System.out.println("Valor da Comissão do Vendedor: R$" + ve3.calcularComissao());
        //O Valor do Produto vai ficar de 90 reais por conta do desconto aplocado na linha 43!!
        ve3.imprimeVenda();

    }
}