import java.util.Scanner;

public class Numerodois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorCompra;
        double valorPago;
        
        System.out.println("Informe o valor da compra: ");
            valorCompra = scanner.nextDouble();
        System.out.println("Informe o valor pago: ");
            valorPago = scanner.nextDouble();

        scanner.close(); 

        double troco = valorPago - valorCompra;

        System.out.println("\nValor pago: R$"+ valorPago);
        System.out.println("\nValor da compra: R$"+ valorCompra);
        System.out.println("\nTroco: R$" + troco);
        
        if(valorPago < valorCompra){
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
            return;
            
        }
        int[] notas = {50,20,10,5,2,1};
            for (int nota : notas) {
                int numeroNotas = (int) troco/nota;           
                System.out.println("\nNota(s) R$"+ nota + ": " + numeroNotas);
            troco = troco - (numeroNotas * nota);
                     
            }
            
           
    }
    
}

