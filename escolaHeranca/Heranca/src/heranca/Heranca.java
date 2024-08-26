/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 051968
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        do{
            p.ExibirMenu();
            p.SetOPC();
            if (p.GetOPC()<0 || p.GetOPC()>4){
                p.ExibirOPCInval();
            }
            else{
                if (p.GetOPC()==1){
                    Aluno a = new Aluno();
                    a.SetNome();
                    a.SetRa();
                    System.out.println("**ALUNO**");
                    a.ExibirDadosPessoa();
                    Avaliacao nt = new Avaliacao();
                    nt.setA1();
                    nt.setA2();
                    //nt.media();
                    nt.nota1();
                    nt.substituto();
                    a.ExibirRA();
                }
                if (p.GetOPC()==2){
                    Funcionario f = new Funcionario();
                    f.SetNome();
                    f.SetCargo();
                    System.out.println("**FUNCIONÁRIO**");
                    f.ExibirDadosPessoa();
                    f.ExibirCargo();
                }
                  if (p.GetOPC()==3){
                    Professor prof = new Professor();
                    prof.SetNome();
                    prof.SetCargo();
                    prof.SetTitulacao();
                    prof.SetCH();
                    System.out.println("**PROFESSOR**");
                    prof.ExibirDadosPessoa();
                    prof.ExibirCargo();
                    prof.exibirDadosProfessor();
                }
                  if (p.GetOPC()==4){
                    alunoPos alu  = new alunoPos();
                    alu.SetNome();
                    alu.SetRa();
                    alu.SetProjeto();
                    alu.SetND();
                    System.out.println("**ALUNO ´PÓS**");
                    alu.ExibirDadosPessoa();
                    alu.ExibirRA();
                    alu.exibirDadosAlunoPos();
                 }        
                             
                
                if(p.GetOPC()==0){
                    p.Sair();
                }
            }
        }while (p.GetOPC()!=0);
        
        
        
        
    }
    
}

