
package calculadoraimc;

import java.util.Scanner;

public class CalculadoraIMC {
 
    public static void main(String[] args) {
        double peso, altura, imc;
        String genero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o seu genero: ");
        genero = entrada.nextLine();
        System.out.println("Informe o seu peso: ");
        peso = entrada.nextDouble();
        System.out.println("Informe a sua altura: ");
        altura = entrada.nextDouble();
        
        imc = peso /(altura*altura);
        
        if(genero == "m"){
            if(imc < 20){
                System.out.printf("Abaixo do Normal, IMC:"+imc);
            }else if(imc >= 20 && imc <= 24.9){
                System.out.println("Normal, IMC:"+imc);
            }else if(imc >= 25 && imc <= 29.9){
                System.out.println("Obesidade Leve, IMC:"+imc);
            }else if(imc >= 30 && imc <= 39.9){
                System.out.println("Obesidade Moderada, IMC:"+imc);
            }else if(imc >= 43){
                System.out.println("Obesidade Morbida, IMC:"+imc);
            }
        }else if(genero == "f"){   
            if(imc < 19){
                System.out.println("Abaixo do Normal, IMC:"+imc);
            }else if(imc >= 19 && imc <= 23.9){
                System.out.println("Normal, IMC:"+imc);
            }else if(imc >= 24 && imc <= 28.9){
                System.out.println("Obesidade Leve, IMC:"+imc);
            }else if(imc >= 29 && imc <= 38.9){
                System.out.println("Obesidade Moderada, IMC:"+imc);
            }else if(imc >= 39){
                System.out.println("Obesidade Morbida, IMC:"+imc);
            }
        }   
    }
}    


