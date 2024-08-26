
package heranca;

public class Funcionario extends Pessoa{
    
    private String cargo;
    
    public void SetCargo(){
        System.out.print("Digite o Cargo do Funcionário:");
        this.cargo=entrada.nextLine();
    }
    public String GetCargo(){
        return this.cargo;
    }
    
    public void ExibirCargo(){
        System.out.print(" Cargo do Funcionário: "+cargo);
         
    }
    
}
