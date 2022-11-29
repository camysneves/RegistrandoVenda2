package RegistrandoVendasFile;

public class Vendedor {
    private String nome;
    private final int codigo;
    private final double comissao = 5;

    public Vendedor(String nome, String codigo, String endereco) {
        this.nome = nome;
        this.codigo = Integer.parseInt(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getComissao() {
        return 0;
    }
}

