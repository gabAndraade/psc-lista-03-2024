import java.util.Scanner;

public class Numeroquatro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double op;
        double raio;
        System.out.println("Digite 1 para calcular o perímetro do círculo, 2 para área do círculo \ne 3 para volume da esfera: ");
        op = scanner.nextDouble();
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        if(op != 1 && op != 2 && op !=3){
            System.out.println("O código da operação é invalido.");
        }
        if(op == 1){
            System.out.println("O perímetro do círculo é:" + 2 * Math.PI * raio);
        }
        if(op == 2){
            System.out.println("A área do círculo é: "+ Math.PI * (raio*raio));
        }
        if(op == 3){
            System.out.println("O volume da esfera é: "+ (4.0/3.0) * Math.PI *(raio*raio*raio));
        }


        scanner.close();
    }
    
}
