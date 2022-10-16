package RegistrandoVendasFile;

public class Main {
    public static void main(String[] args) {

        Produto produto01 = new Produto(1,"Produto: Carro",  60000.00,30000.00,00,false);
        Vendedor vendedor01 = new Vendedor("Vendedor(a) Izabela Dias",1,"João Pessoa");
        Venda venda01 = new Venda();

        venda01.setProduto(produto01);
        venda01.setVendedor(vendedor01);
        venda01.setQuantidadeItem(2);
        venda01.caucularValor();
        venda01.caucularComissao();
        System.out.println("Comissão do vendedor(a): " +venda01.getVendedor().getComissao() + "%");
        venda01.imprimir();

        System.out.println();
        System.out.println();


        Produto produto02 = new Produto(2,"Produto02",50000.00,25000.00,true);
        Vendedor vendedor02 = new Vendedor("Vendedor02",2,"JoaoPessoa");
        Venda venda02 = new Venda();
        venda02.setProduto(produto02);
        venda02.setVendedor(vendedor02);
        venda02.setQuantidadeItem(3);
        venda02.setDesconto(10);
        venda02.efetuarDesconto(venda02.getDesconto());
        venda02.caucularValor();
        System.out.println("Comissão de " + vendedor02.getNome() +"é: "+ venda02.getVendedor().getComissao() + "%");
        venda02.imprimir();

        System.out.println();
        System.out.println();


        Venda venda03 = new Venda();
        venda03.setVendedor(vendedor02);
        venda03.setProduto(produto02);
        venda03.setQuantidadeItem(2);
        venda03.setDesconto(30);
        venda03.efetuarDesconto(venda03.getDesconto());
        venda03.caucularValor();
        System.out.println("Comissão do(a) " + vendedor02.getNome() +" é: "+ venda03.getVendedor().getComissao());
        venda03.imprimir();
    }

}
