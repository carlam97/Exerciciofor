/*Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x */

public class ExerFor5{
    public static void main(String args[]){
        int x = 58;
        if(x%2==0){
         x = x/2; 
         System.out.println("O valor de X é par e é igual a: "+ x);  
        }
            else{
                x = 3 * x + 1;
            System.out.println("O valor de X é impar e é igual a: "+ x);
            }
    }
}