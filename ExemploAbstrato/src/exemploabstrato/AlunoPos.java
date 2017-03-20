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
public class AlunoPos extends Aluno{
    
    private float nota1;
    private float nota2;
    private float notaMonografia;

    public AlunoPos(int ra, String nome, float nota1, float nota2, float notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(float notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

 
    
    //Metodo calculaMedia
    
    @Override
    float calculaMedia(){
        
        return (nota1 + nota2 + notaMonografia) / 3;
    }
    
    public String toString(){
        return "Aluno Pos\n" + super.toString() +
                String.format("\nNota1: %.2f" +
                        "\nNota2: %.2f", nota1,nota2, notaMonografia, calculaMedia());
        
    }
}
