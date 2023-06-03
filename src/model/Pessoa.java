package model;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String Datanasc;

    public Pessoa(String nome, String Datanasc){
        this.nome = nome;
        this.Datanasc = Datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return Datanasc;
    }

    public void setDatanasc(String datanasc) {
        Datanasc = datanasc;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +"\n"+"Data de nascimento: " + Datanasc;
    }

}
