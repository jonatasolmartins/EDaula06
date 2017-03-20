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
public class ListaObj {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
    // Atributos
    private Object[] vetor;  // vetor que armazenará os elementos da lista
    private int nroElem;  // quantidade de elementos da lista
                          // e índice do próximo elemento a ser colocado na lista  

    // Construtor - recebe o tamanho da lista a ser criada
    public ListaObj(int tam) {
        vetor = new Object[tam];   // criação do vetor com o tamanho especificado
        nroElem = 0;            // zera a quantidade de elementos da lista
    }
    
    // Métodos
    
    /* Método adicionar - recebe o elemento a ser inserido na lista
       Devolve -1, se a lista estiver cheia
       Devolve zero, se inserção bem sucedida
    */
    public int adicionar (Object elem) {
        if (nroElem >= vetor.length) {
            return -1;     // lista está cheia, retorna -1
        }
        else {             // lista não está cheia 
            vetor[nroElem++] = elem; // coloca elem no vetor, incrementa nroElem
            //vetor[nroElem] = elem;
            //nroElem++;
            return 0;                // e retorna zero
        }
    }
    
    /* Método exibir
       Exibe os valores que estão na lista
    */
    public void exibir() {
        System.out.println("Lista:");
        /* percorre a lista para exibir os valores */
        /* porém percorre a lista enquanto i < nroElem
           para exibir somente os valores inseridos 
        */
        for (int i=0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }
    /* Método buscar - recebe o valor a ser procurado no vetor 
       Devolve -1 se não encontrou o valor
       Devolve o índice do valor no vetor, se encontrou o valor
    */
    public int buscar(Object valor) {
        // percorre o vetor procurando o valor
        for (int ind = 0; ind < nroElem; ind++) {
            if (vetor[ind].equals(valor)) {  // se encontrou o valor
                return ind;             // então retorna seu índice
            }
        }
        return -1;   // não encontrou o valor no vetor, retorna -1
    }
    
    /* Método removerPeloIndice - recebe o índice do elemento a ser
       removido
       Devolve -1 se o índice for inválido
       Devolve 0 se removeu com sucesso
    */
    public int removerPeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) { // se índice inválido
            return -1;                         // então retorna -1
        }
        else {
            // desloca os elementos do vetor, para sobrescrever 
            // o valor removido (para não ficar "buracos" no vetor)
            for (int i = indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1]; 
            }
            
            nroElem--;  // decrementa o nro de elementos da lista
            
            return 0;  // retorna zero
        }
    }
    
    /* Método removerElemento - recebe o elemento a ser removido
       Devolve 0 em caso de sucesso e -1 em caso de falha
    */
    public int removerElemento(Object elem) {
        // chama o método buscar para procura elem no vetor
        // a variável indice conterá -1 se o elem não foi encontrado
        // ou o índice do valor no vetor
        int indice = buscar(elem);
        
        // chama o método removerPeloIndice para remover o elem
        // que está no índice da variável indice
        return (removerPeloIndice(indice));
    }
    
    public int getTamanho(){
        return nroElem;
    }
    
    public Object getElemento(int indice){
        
        if (indice < 0 || indice >= nroElem) {
            return null;
        }else{
            return vetor[indice];
        }
        
        
    }
   
    
}
    

