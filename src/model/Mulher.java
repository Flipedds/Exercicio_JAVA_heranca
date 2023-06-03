package model;

public class Mulher extends PessoaIMC{
    public Mulher(String nome, String Datanasc, double peso, double altura) {
        super(nome, Datanasc, peso, altura);
    }

    @Override
    public String resultIMC() {

        double resultado = super.calculaIMC();
        if(resultado < 19){
            return "Abaixo do peso ideal";
        }
        if((resultado > 19) & (resultado < 25.8)){
            return "Peso ideal";
        }
        if (resultado > 25.8){
            return "Acima do peso ideal";
        }
        return "Não foi possível decidir o imc";
    }
}
