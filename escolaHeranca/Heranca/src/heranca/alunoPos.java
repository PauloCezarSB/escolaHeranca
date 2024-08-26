
package heranca;

public class alunoPos extends Aluno {
    
    private String projeto;
    private int nd;
    
    public void SetProjeto(){
        System.out.print("Titulo do Projeto: ");
        projeto=entrada.nextLine();
        getProjeto();
        
    }
       
    private String getProjeto(){
    
        return this.projeto;
        
    }
    
    public void SetND(){
        System.out.print("Nota da Defesa: ");
        nd=entrada.nextInt();
        getND();
        
    }
       
    private int getND(){
    
        return this.nd;
        
    }
    
    public void exibirDadosAlunoPos(){
        System.out.println("\n Titudo do Projeto: "+projeto);
        System.out.println("Nota da Defesa: "+nd);
        
    }
    
    
    
    
}
