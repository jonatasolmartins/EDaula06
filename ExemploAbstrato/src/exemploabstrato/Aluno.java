/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploabstrato;

/**
 *
 * @author jonatas
 */
public abstract class Aluno {
    
    private int ra;
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Metodo Abstrato CalculaMedia
    
     abstract float calculaMedia();

     //Subscreve o metodo toString para exibir os valores dos atributos
     
    @Override
        public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
     
     
    
}
