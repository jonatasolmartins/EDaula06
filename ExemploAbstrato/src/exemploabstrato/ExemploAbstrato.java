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
public class ExemploAbstrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlunoGraduacao ag = new AlunoGraduacao (38055,"Jonatas Olziris Martins", 1.5f, 8);
        
        System.out.println(ag);
        
        AlunoPos ap = new AlunoPos (38056,"Jonatas Olziris", 1.3f,6.1f, 5.5f);
        
        System.out.println(ap);
        
        Cadastro escola = new Cadastro (10);
        
        escola.adicionarAluno(ag);
        escola.exibirTodos();
        escola.adicionarAluno(ap);
        escola.exibirTodos();
    }
    
}
