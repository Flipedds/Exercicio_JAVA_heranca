package model;

public class Homem extends PessoaIMC{
    public Homem(String nome, String Datanasc, double peso, double altura) {
        super(nome, Datanasc, peso, altura);
    }

    @Override
    public String resultIMC() {

        double resultado = super.calculaIMC();
        if(resultado < 20.7){
            return "Abaixo do peso ideal";
        }
        if((resultado > 20.7) & (resultado < 26.7)){
            return "Peso ideal";
        }
        if (resultado > 26.4){
            return "Acima do peso ideal";
        }
     return "Não foi possível decidir o imc";
    }
}
