package br.com.etec.guilherme.locadoraApi.repository.filter;


public class AtorFilter {
    private String nome;
    private String nomeator;
    private String nomegenero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
