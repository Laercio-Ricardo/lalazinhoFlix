public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O podereso Laérciozão";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.atoresPrincipais = "Laércio e Gisselaine";
        meuFilme.duracao = 192;
        meuFilme.sinopse = "Laércio é um chefão que sai pelas ruas esppalhando sua alegria e beleza";

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(9);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("Média das avaliações desse Filme: " + meuFilme.pegaMedia());
    }


}
