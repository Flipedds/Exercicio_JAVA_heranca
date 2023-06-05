import model.ArrayPessoaIMC;
import model.Homem;
import model.Mulher;
import java.util.Objects;
import java.util.Scanner;

import static model.Inputs.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayPessoaIMC lista_pessoas = new ArrayPessoaIMC();

        int quantidade = lerValor(scanner, "Quantos objetos você deseja criar? ");

        int i = 0;

        loop:
        while (i < quantidade) {
            String tipo = lerTipo(scanner,"Qual o tipo de objeto? homem ou mulher: " );

            String nome = lerNome(scanner,"Digite o nome: " );

            String datanasc = lerData(scanner, "Digite a data de nascimento: exemplo: 04/03/2004: " );

            double peso = lerPeso(scanner, "Digite o peso: exemplo: 70,0: " );

            double altura = lerAltura(scanner, "Digite a altura: exemplo: 1,72: " );

            switch (tipo) {
                case "homem" -> {
                    Homem novo_homem = new Homem(nome, datanasc, peso, altura);
                    System.out.println(lista_pessoas.set_pessoa(novo_homem));
                    i++;
                }
                case "mulher" -> {
                    Mulher nova_mulher = new Mulher(nome, datanasc, peso, altura);
                    System.out.println(lista_pessoas.set_pessoa(nova_mulher));
                    i++;
                }
                default -> {
                    String escolha = lerEscolha(scanner, "Objeto escolhido não é homem nem mulher" + "\n" + "Deseja tentar novamente? sim ou não: ");
                    switch (escolha) {
                        case "sim":
                            System.out.println("Então vamos lá!");
                            System.out.println("\n");
                            break;
                        case "não":
                            break loop;
                        default:
                            System.out.println("Opção inválida");
                    }
                }
            }
        }

        if(Objects.equals(lista_pessoas.get_size(),true)){
            System.out.println("\n");
            System.out.println(lista_pessoas);
        }
        else {
            System.out.println("Não existem registros para serem mostrados !");
        }
    }
}