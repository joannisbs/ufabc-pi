/*

  Faca um programa que le tres numeros racionais (double), digamos 
  a, b e c, e que decide:

  * se existe um triangulo com lados a, b e c, ou se e imposse­vel;
  * caso exista, se ele Ã© isÃ³sceles ou nao;
  * caso exista, se ele Ã© equilÃ¡tero ou nao;
  * caso exista, se ele possui um angulo obtuso ou nao.

 */

import java.util.Scanner;

public class triangulo {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    double erro = 0.001;
    double aLado = 0;
    double bLado = 0;
    double cLado = 0;
    
    aLado = scanner.nextDouble();
    bLado = scanner.nextDouble();
    cLado = scanner.nextDouble();
    
    boolean isAequalB = false;
    boolean isAequalC = false;
    boolean isBequalC = false;
    
    boolean isTriangle = true;
    boolean existObtuse = false;

    // condicao de existencia de um triangulo
    // | b - c | < a < b + c 
    // | a - c | < b < a + c 
    // | a - b | < c < a + b 

    // condicao de existencia de um angulo obtuso
    // a² > b² + c² ou b² > a² + c² ou c² > a² + b²

    if (aLado >= bLado) {
      if (aLado >= cLado) {
        existObtuse = (aLado*aLado) > ((bLado*bLado) + (cLado*cLado));
      }else {
        existObtuse = (cLado*cLado) > ((bLado*bLado) + (aLado*aLado)); 
      }
    } else {
      if (bLado >= cLado){
        existObtuse = (bLado*bLado) > ((cLado*cLado) + (aLado*aLado));
      }else {
        existObtuse = (cLado*cLado) > ((bLado*bLado) + (aLado*aLado));
      }
    }

    if (aLado >= bLado) {
      isAequalB = (aLado - bLado) <= erro;
      isTriangle = isTriangle && (aLado - bLado) < cLado;
      isTriangle = isTriangle && cLado < (aLado + bLado);
    } else {
      isAequalB = (bLado - aLado) <= erro;
      isTriangle = isTriangle && (bLado - aLado) < cLado;
      isTriangle = isTriangle && cLado < (aLado + bLado);
    }
    
    if (aLado >= cLado) {
      isAequalC = (aLado - cLado) <= erro;
      isTriangle = isTriangle && (aLado - cLado) < bLado;
      isTriangle = isTriangle && bLado < (aLado + cLado);
    } else {
      isAequalC = (cLado - aLado) <= erro;
      isTriangle = isTriangle && (cLado - aLado) < bLado;
      isTriangle = isTriangle && bLado < (aLado + cLado);
    }

    if (bLado >= cLado) {
      isBequalC = (bLado - cLado) <= erro;
      isTriangle = isTriangle && (bLado - cLado) < aLado;
      isTriangle = isTriangle && aLado < (bLado + cLado);
    } else {
      isBequalC = (cLado - bLado) <= erro;
      isTriangle = isTriangle && (cLado - bLado) < aLado;
      isTriangle = isTriangle && aLado < (bLado + cLado);
    }

    if (isTriangle) {
      System.out.print("eh um triagulo");
      if (isAequalB && isAequalC) {
        System.out.print(" equilatero");
      } else if (isAequalB || isBequalC || isAequalC) {
        System.out.print(" isoceles");
      } 
      if (existObtuse) {
        System.out.println("\nPossui pelomenos um angulo obtuso");
      } else {
        System.out.println("\nNao possui nenhum angulo obtuso");
      }
    }
    else {
      System.out.println("impossivel formar um triangulo");
    }    
  }
}
