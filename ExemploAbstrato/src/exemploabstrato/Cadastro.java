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
public class Cadastro {
    
    //Atributos
    private ListaObj lista;
    
    //Construtor
    
    public Cadastro(int tam){
        
        lista = new ListaObj(tam);
    }
    
    //Metodos
    public void adicionarAluno(Aluno a){
        
        lista.adicionar(a);
    }
    
    public void exibirTodos(){
        System.out.println("");
        lista.exibir();
    }
    
    
    
}
