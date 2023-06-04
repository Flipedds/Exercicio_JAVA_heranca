package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayPessoaIMC {
    private List<PessoaIMC> pessoas;
    private int tamanho;
    public ArrayPessoaIMC(){
        this.pessoas = new ArrayList<PessoaIMC>();
    }

    public String set_pessoa(PessoaIMC nova_pessoa){
            this.pessoas.add(nova_pessoa);
            return "Pessoa adicionada";
        }

    public boolean get_size(){
        return this.pessoas.size() > 0;
    }

    @Override
    public String toString(){
        String persons;
        persons = "Pessoas: \n";
        for(PessoaIMC pessoa : this.pessoas){
            persons += pessoa.toString()+ "\n" + pessoa.resultIMC() + '\n';
        }
        return persons;
    }
}
