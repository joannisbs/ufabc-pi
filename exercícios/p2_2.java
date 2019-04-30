import java.util.Scanner;


public class p2_2 {

    static private double sum(double vetor []){
        double sum = 0;
        for (int index = 0; index< vetor.length; index++){
            sum += vetor[index];
        }
        return sum;
    }

    static private double mediaOrSum (double vetor [], char op){

        double soma = sum(vetor);
        
        if (op == 'M' || op == 'm')
            soma = soma / 5.0;

        return soma;
    }


    static private String operacaoConvert (char op){
        
        String operacao = new String();
        if (op == 'M' || op == 'm')
            operacao = "Media";
        else
            operacao = "Soma";
           
        return operacao;
    }



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int opLinha = scanner.nextInt();
        
        // resolve o problema do /n
        scanner.nextLine();

        char operacao = scanner.nextLine().charAt(0);

        double matriz[][] = new double[5][5];

        for (int linha = 0; linha < 5; linha++){
            for(int coluna =0; coluna < 5; coluna ++){
                matriz[linha][coluna] = scanner.nextDouble();
            }
        }

        double result = mediaOrSum(matriz[opLinha], operacao);

        String opResponse = operacaoConvert(operacao);
        
        System.out.println(opResponse);
        System.out.print(result);

        scanner.close();

    }
}