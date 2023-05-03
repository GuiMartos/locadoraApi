package br.com.etec.guilherme.locadoraApi.repository.filter;

public class GeneroFilter {

    private String descricao;
    private String nomeator;
    private String nomegenero;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    public String getNomegenero() {
        return nomegenero;
    }

    public void setNomegenero(String nomegenero) {
        this.nomegenero = nomegenero;
    }
}
