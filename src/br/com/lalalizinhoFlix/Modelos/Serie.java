package br.com.lalalizinhoFlix.Modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodios;
// Inicio do GEt e sett

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }


    // Fim go Get e setter

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;


    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;

    }
}
