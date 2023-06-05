package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayPessoaIMC {
    private final List<PessoaIMC> pessoas;
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
        StringBuilder persons;
        persons = new StringBuilder("Pessoas: \n");
        for(PessoaIMC pessoa : this.pessoas){
            persons.append(pessoa.toString()).append("\n").append(pessoa.resultIMC()).append('\n');
        }
        return persons.toString();
    }
}
