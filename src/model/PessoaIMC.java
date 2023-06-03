package model;

public abstract class PessoaIMC extends Pessoa{
    private double peso;
    private double altura;
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
        double IMC = this.peso / (this.altura * this.altura);
        return IMC;
    }

    public abstract String resultIMC();

    @Override
    public String toString(){
        return super.toString()+ "\n" +"Peso: " + peso + "\n" + "Altura: " + altura;
    }
}
