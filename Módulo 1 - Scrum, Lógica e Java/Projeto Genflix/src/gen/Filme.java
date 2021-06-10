package gen;

import java.util.Scanner;

public class Filme {

    private String nome;
    private String categoria;
    private int duracao;
    private String classificacaoIndicativa;
    private int momento;
    private String descricao;

    public Filme(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao)
    {
        setNome(nome);
        setCategoria(categoria);
        setDuracao(duracao);
        setClassificacaoIndicativa(classificacaoIndicativa);
        setMomento(momento);
        setDescricao(descricao);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getMomento() {
        return momento;
    }

    public void setMomento(int momento) {
        this.momento = momento;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void apresentarInfo()

    {
        System.out.println("Filme: "+nome+"\nCategoria: "+categoria+"\nDuração: "+duracao
                +"\nClassificação indicativa: "+classificacaoIndicativa+"\n -----Descrição-----\n"+descricao);

    }

	/*
	public lista Favoritar(Usuario x)
	{
		x.addFilme;
		return lista;

     }
	*/



    public void parar()
    {
        System.out.println("Ficaremos com saudades... ");
    }

    public void pausar()
    {
        System.out.println("Estamos te esperando! ");
    }

}