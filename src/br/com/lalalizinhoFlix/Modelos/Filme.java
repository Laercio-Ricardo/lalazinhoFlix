package br.com.lalalizinhoFlix.Modelos;
//o extends é usado para informar que o Filme tem tudo que o Titulo tem
public class Filme extends Titulo{
 String diretor;


 //Chamando o GETTER e SETTER


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

