public class Filme {

    String nome;
    String atoresPrincipais;
    String sinopse;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracao;
    int anoDeLancamento;

    /* Criando metodos */

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Coadjuvantes: " + atoresPrincipais);
        System.out.println("Duração do filme: " + duracao + " Minutos");
        System.out.println("Resumo do filme: " + sinopse);
    }
    void avaliacao(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;


    }

    double pegaMedia(){
      /*Retorna as avaliações, a soma das avaliaçoes pelo total das avaliaçoes */
        return somaAvaliacao / totalDeAvaliacoes;


    }

}


