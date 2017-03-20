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
public class AlunoGraduacao extends Aluno{

    private float notaContinuada;
    private float notaSemestral;

    public AlunoGraduacao(int ra, String nome, float notaContinuada, float notaSemestral) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public float getNotaCotinuada() {
        return notaContinuada;
    }

    public void setNotaCotinuada(float notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public float getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(float notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    @Override
    float calculaMedia() {
       
        return notaContinuada * 0.4f + notaSemestral * 0.6f;
        
    }

    @Override
    public String toString() {
        //return "AlunoGraduacao{" + "notaCotinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + '}';
        return "Aluno Graduação \n" + super.toString() + String.format("\nNotaContinuada: %.2f" +
                "\nNotaSemestral: %.2f" +
                "\nMedia: %.2f",notaContinuada, notaSemestral, calculaMedia());
    }
    
    
    
  
       
    
    
}
