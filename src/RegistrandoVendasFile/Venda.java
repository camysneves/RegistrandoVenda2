package RegistrandoVendasFile;

    public class Venda {
        private Vendedor vendedor;
        private double desconto;
        private int quantidadeItem;
        private double valor;
        private Produto produto ;

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

        public void setDesconto(double desconto) {
            this.desconto = desconto;
        }

        public int getQuantidadeItem() {
            return quantidadeItem;
        }

        public void setQuantidadeItem(int quantidadeItem) {
            this.quantidadeItem = quantidadeItem;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }


        public void efetuarDesconto(double desconto) {
            this.desconto += (produto.getValorVenda() * desconto) /100;


            if ((this.produto.getValorVenda() - this.desconto) < produto.getValorCusto()){
                System.out.println("O desconto não pode ser aplicado. O valor do produto ficaria abaixo do valor do custo.");
            }else{
                this.produto.setValorVenda(this.produto.getValorVenda()- this.desconto);
                System.out.println("Valor da venda com desconto é de: " + produto.getValorVenda());
            }
        }

        public void caucularValor(){
            valor += (produto.getValorVenda() - desconto) * quantidadeItem;
        }


        public void caucularComissao(){
            if (this.produto.isPromocao() == true) {
                vendedor.setComissao( (produto.getValorVenda() * (vendedor.getComissao()/100) )/2 );
            }else {
                vendedor.setComissao(produto.getValorVenda() * (vendedor.getComissao()/100) );
            }
        }

        public void imprimir(){
            System.out.println("Vendedor: " + " Nome: "+ vendedor.getNome() + " Código produto: " + vendedor.getCodigo() + " comissão: " + vendedor.getComissao());
            System.out.println("Quantidade de produtos vendidos: " + quantidadeItem);
            System.out.println("Produto(s): " + " com código: " + produto.getCodigo() + " descrição do item: " + produto.getDescricao());
            System.out.println("Valor da venda: " + produto.getValorVenda());
            System.out.println("Produto em promoção: " + produto.isPromocao());
            System.out.println("Valor de desconto sobre o produto: " + desconto);
            System.out.println("Valor total da venda: " + valor);
        }
    }
