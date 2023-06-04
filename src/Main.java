import model.ArrayPessoaIMC;
import model.Homem;
import model.Mulher;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayPessoaIMC lista_pessoas = new ArrayPessoaIMC();

        System.out.print("Quantos objetos você deseja criar? ");
        int quantidade = scanner.nextInt();

            for (int i = 0; i < quantidade;) {
                System.out.print("Qual o tipo de objeto: homem ou mulher: ");
                String tipo = scanner.next();

                System.out.println("Digite o nome: ");
                String nome = scanner.next();

                System.out.println("Digite a data de nascimento: exemplo: 04/03/2004 ");
                String datanasc = scanner.next();

                System.out.println("Digite o peso: exemplo: 70,0 ");
                double peso = scanner.nextDouble();

                System.out.println("Digite a altura: exemplo: 1,72");
                double altura = scanner.nextDouble();

                if (Objects.equals(tipo, "homem")) {
                    Homem novo_homem = new Homem(nome, datanasc, peso, altura);
                    System.out.println(lista_pessoas.set_pessoa(novo_homem));
                    i++;
                } else if (Objects.equals(tipo, "mulher")) {
                    Mulher nova_mulher = new Mulher(nome, datanasc, peso, altura);
                    System.out.println(lista_pessoas.set_pessoa(nova_mulher));
                    i++;
                }
                else {
                    System.out.println("Objeto escolhido não é homem nem mulher");
                    System.out.println("\n");

                    System.out.println("Deseja tentar novamente?: sim ou não");
                    String escolha = scanner.next();
                    if(Objects.equals(escolha, "sim")){
                        System.out.println("Então vamos lá!");
                        System.out.println("\n");
                    } else if (Objects.equals(escolha, "não")) {
                        break;
                    }
                }
            }

        if(Objects.equals(lista_pessoas.get_size(), true) ){
            System.out.println("\n");
            System.out.println(lista_pessoas.toString());
        }
        }

    }