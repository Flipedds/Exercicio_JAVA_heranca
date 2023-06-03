import model.ArrayPessoaIMC;
import model.Homem;
import model.Mulher;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Homem homem_um = new Homem("filipe", "06/03/2004", 72.0, 1.72);
        Mulher mulher_um = new Mulher("Maria", "03/03/2005", 60.0, 1.65);

        ArrayPessoaIMC lista_pessoas = new ArrayPessoaIMC(2);

        System.out.println(lista_pessoas.set_pessoa(homem_um));
        System.out.println(lista_pessoas.set_pessoa(mulher_um));
        System.out.println("\n");
        System.out.println(lista_pessoas.toString());
        }

    }