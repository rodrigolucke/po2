/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4grafico;

/**
 *
 * @author m80027
 */
public class Pessoa {
    String nome;
    int dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, int dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + '}';
    }
    
}
