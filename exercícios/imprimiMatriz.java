/* 
Exercício proposto:
Faca um programa java que leia uma matrix 5x5 e:
- Imprima-a em formato matrixial, cada linha ocupa 5 espaços
- imprima somente a diagonal principal
- Imprima todos os elementos abaixo da diagonal principal (inclusive ela)
- Imprima todos os elementos acima da diagonal principal (inclusive ela)
Joannis Basile Stavrakas Professor Isidro
*/


import java.util.Scanner;

public class imprimiMatriz {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    
    int matriz[][];
    matriz = new int[5][5];

    for(int linha = 0; linha < 5; linha++ ){
      for(int coluna = 0; coluna < 5; coluna++ ){
        matriz[linha][coluna] = s.nextInt();
      }
    }
    s.close();

    for(int linha = 0; linha < 5; linha++ ){
      for(int coluna = 0; coluna < 5; coluna++ ){
        System.out.printf("%5d ",matriz[linha][coluna]);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();

    for(int linha = 0; linha < 5; linha++ ){
      for(int coluna = 0; coluna < 5; coluna++ ){
        if(linha == coluna){
          System.out.printf("%5d ",matriz[linha][coluna]);
        }else{
          System.out.print("      ");
        }
        
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();
    
    for(int linha = 0; linha < 5; linha++ ){
      for(int coluna = 0; coluna < 5; coluna++ ){
        if(linha >= coluna){
          System.out.printf("%5d ",matriz[linha][coluna]);
        }else{
          System.out.print("      ");
        }
        
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();

    for(int linha = 0; linha < 5; linha++ ){
      for(int coluna = 0; coluna < 5; coluna++ ){
        if(linha <= coluna){
          System.out.printf("%5d ",matriz[linha][coluna]);
        }else{
          System.out.print("      ");
        }
        
      }
      System.out.println();
    }


  }
}