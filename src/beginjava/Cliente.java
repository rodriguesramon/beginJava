/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beginjava;

/**
 *
 * @author Ramon Costa
 */
public class Cliente {
    private String nome;
    private int idade;  
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
