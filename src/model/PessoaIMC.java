package model;

public abstract class PessoaIMC extends Pessoa{
    private final double peso;
    private final double altura;
    public PessoaIMC(String nome, String Datanasc, double peso, double altura) {
        super(nome, Datanasc);
        this.altura = altura;
        this.peso = peso;

    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(){
        return this.peso / (this.altura * this.altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString(){
        return super.toString()+ "\n" +"Peso: " + peso + "\n" + "Altura: " + altura;
    }
}
