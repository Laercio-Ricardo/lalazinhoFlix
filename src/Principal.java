import br.com.lalalizinhoFlix.Modelos.Filme;
import br.com.lalalizinhoFlix.Modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Laérciozão");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setAtoresPrincipais("Laércio e Gisselaine");
        meuFilme.setDuracao(192);
        meuFilme.setSinopse("Laércio é um chefão que sai pelas ruas esppalhando sua alegria e beleza");

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(9);
        System.out.println("O Filme: " + meuFilme.getNome() + " teve " + meuFilme.getTotalDeAvaliacoes()+ " avaliações");
        System.out.println("Média das avaliações : " + meuFilme.pegaMedia());

        //criando uma nova série
        Serie lalalzinho = new Serie();
        lalalzinho.setNome("Lalazinho das Meninas");
        lalalzinho.setAnoDeLancamento(2024);
        lalalzinho.exibeFichaTecnica();
        lalalzinho.setTemporadas(15);
        lalalzinho.setEpisodiosPorTemporadas(5);
        lalalzinho.setAtoresPrincipais("Eu e vc");

    }


}
