import java.util.Scanner;


public class p2_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int vetor[] = new int [10];

        int position = 0;
        
        for(int index = 0; index < 10; index++) {
            vetor[index] = scanner.nextInt();

            if(vetor[index] < vetor[position] ){
                position = index;
            }
        }
        
        System.out.print("Menor valor ");
        System.out.println(vetor[position]);
        System.out.print("Posicao ");
        System.out.println(position);
        
        scanner.close();
    }
}