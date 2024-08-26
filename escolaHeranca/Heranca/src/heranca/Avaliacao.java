package heranca;

import java.util.Scanner;

public class Avaliacao extends Aluno {
    
    private double a1, a2, a3, media;
    private Scanner entrada = new Scanner(System.in);
    
    public void setA1() {
        System.out.println("Informe a Nota A1: ");
        a1 = entrada.nextDouble();
    }
    
    public double getA1() {
        return this.a1;
    }
    
    public void setA2() {
        System.out.println("Informe a Nota A2: ");
        a2 = entrada.nextDouble();
    }
    
    public double getA2() {
        return this.a2;
    }
    
    public void nota1() {
        media = a1 + a2;
        if (media < 5) {
            System.out.println("A nota está abaixo, necessário A3");
            substituto();
        } else {
            System.out.println("APROVADO, NOTA: " + media);
        }
    }
    
    public void setA3() {
        System.out.println("Informe a Nota A3: ");
        a3 = entrada.nextDouble();
    }
    
    public double getA3() {
        return this.a3;
    }
    
    public void substituto() {
        setA3();
        
        if (a1 < a2) {
            media = a2 + a3;
        } else {
            media = a1 + a3;
        }
        
        if (media >= 5) {
            System.out.println("APROVADO com A3, NOTA: " + media);
        } else {
            System.out.println("NOTA INSUFICIENTE, REPROVADO!");
        }
    }
}