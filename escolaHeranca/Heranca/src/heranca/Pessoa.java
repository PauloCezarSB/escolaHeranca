/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.Scanner;
/**
 *
 * @author 051968
 */
public class Pessoa {
    
    private String nome;
    private int opc;
    Scanner entrada = new Scanner(System.in);
    
    public void SetNome(){
        System.out.print("Digite o Nome da Pessoa: ");
        this.nome=entrada.nextLine();
        
    }
    
    public String GetNome(){
        return this.nome;
    }
    
    public void ExibirDadosPessoa(){
      System.out.print("Nome:" +nome);
    
}

    public void ExibirMenu(){
        System.out.println("\n****** MENU ******");
        System.out.println("* 1 - Aluno      *");
        System.out.println("* 2 - Funcionario*");
        System.out.println("* 3 - Professor  *");
        System.out.println("* 4 - Aluno Pós  *");
        System.out.println("* 0 - Sair       *");
        System.out.println("******************");
               
    }
    
    public void SetOPC(){
        System.out.print("Informe opção desejada: ");
        this.opc=entrada.nextInt();
    }
    
    public int GetOPC(){
        return this.opc;
    }
    
    public void Sair(){
        System.out.println("Sistema Encerrado");
        System.exit(0);
    }
    
    public void ExibirOPCInval(){
        System.out.println("Opção Inválida!");
    }
}
