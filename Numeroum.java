import java.util.Scanner;

public class Numeroum{
    public static void main(String[] args) {
       double n1;
       double n2;
       double n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
            n1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
            n2 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
            n3 = scanner.nextDouble();
        if(n1 > n2 && n1>n3){
            System.out.println("O maior número é: " + n1);
        }
        if(n1 < n2 && n1<n3){
            System.out.println("O menor número é: "+ n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: " + n2);          
        }
        if (n2 < n1 && n2<n3) {
            System.out.println("O menor número é: "+ n2);
            
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é: " + n3);          
        }
        if (n3 < n1 && n3<n2) {
            System.out.println("O menor número é: "+ n3);
            
        }
        
        System.out.println("A média aritmética é: " + (n1+n2+n3)/3);

        scanner.close();
                    
        
        
    }
    
}