package br.com.lalalizinhoFlix.Modelos;

public class Titulo {

    private String nome;
    private String atoresPrincipais;
    private String sinopse;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracao;
    private int anoDeLancamento;

    //Usando o GET para enviar valores - clica nop botão direto/Generate

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public String getSinopse() {
        return sinopse;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }


    public int getDuracao() {
        return duracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    //Usando o SETTER para deixar digitar valores - clica com o botão esquerdo/Generate


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setAtoresPrincipais(String atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }

    /* Criando metodos */

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Coadjuvantes: " + getAtoresPrincipais());
        System.out.println("Duração do filme: " + getDuracao() + " Minutos");
        System.out.println("Resumo do filme: " + getSinopse());
    }
    public void avaliacao(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;


    }

    public double pegaMedia(){
        /*Retorna as avaliações, a soma das avaliaçoes pelo total das avaliaçoes */
        return somaAvaliacao / totalDeAvaliacoes;


    }

}



