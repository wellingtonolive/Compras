package br.com.compras.models;

public class Compra {

    private String descricao;
    private Double valor;

    public Compra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra : " +
                "Descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
