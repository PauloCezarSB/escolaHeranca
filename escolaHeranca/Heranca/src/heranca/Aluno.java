
package heranca;


public class Aluno extends Pessoa {
    private String ra;
    
    public void SetRa(){
        System.out.print("Digite o RA do Aluno: ");
        this.ra=entrada.nextLine();
        GetRa();
        
    }
    
    public String GetRa(){
        return this.ra;
    }
    public void ExibirRA(){
        System.out.print(" RA do Aluno:" +ra);
    }
    
}
