package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayPessoaIMC {
    private List<PessoaIMC> pessoas;
    private int tamanho;
    public ArrayPessoaIMC(int tamanho){
        this.tamanho = tamanho;
        this.pessoas = new ArrayList<PessoaIMC>();
    }

    public String set_pessoa(PessoaIMC nova_pessoa){
        if (this.tamanho > 0){
            this.tamanho -= 1;
            this.pessoas.add(nova_pessoa);
            return "Pessoa adicionada";
        }
        else {
            return "Número máximo atingido";
        }
    }


    @Override
    public String toString(){
        String persons;
        persons = "Pessoas: \n";
        for(PessoaIMC pessoa : this.pessoas){
            persons += pessoa.getNome()+ ": " + pessoa.resultIMC() + '\n';
        }
        return persons;
    }
}
