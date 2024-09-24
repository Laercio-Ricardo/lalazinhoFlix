   import br.com.lalalizinhoFlix.Modelos.Filme;
   import br.com.lalalizinhoFlix.Modelos.Serie;


public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O podereso Laérciozão");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setAtoresPrincipais("Laércio e Gisselaine");
        meuFilme.setDuracao(192);
        meuFilme.setSinopse("Laércio é um chefão que sai pelas ruas esppalhando sua alegria e beleza");

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);
        System.out.println("O total de avaliações foi: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações desse Filme: " + meuFilme.pegaMedia());


        //Criando series

        Serie lalazinho = new Serie();
        lalazinho.setNome("Lalazinho das meninas");
        lalazinho.setAnoDeLancamento(2024);
        lalazinho.exibeFichaTecnica();
        lalazinho.setTemporadas(15);
        lalazinho.setEpisodiosPorTemporadas(5);
        lalazinho.setAtoresPrincipais("Lalazinho e Gisselaine");
        lalazinho.setDuracao(200);



    }



}
