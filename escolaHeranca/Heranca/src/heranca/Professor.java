/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;


public class Professor extends Funcionario {
    private String titulacao;
    private int ch;
    
    public void SetTitulacao(){
        System.out.println("Digite a titulação do professor");
        titulacao=entrada.nextLine();
        getTitulacao();
        
    }
    
    private String getTitulacao(){
        return this.titulacao;
    }
    
    public void SetCH(){
        System.out.println("Digite a carga horária do professor");
        ch=entrada.nextInt();
        getCH();
   }
    
    private int getCH(){
        return this.ch;
    }
    
    public void exibirDadosProfessor(){
        System.out.println("\nTitulação do Professor:"+titulacao);
        System.out.println("\nCarga Horária do Professor:"+ch);
    }
    
    
    
    
    
}
