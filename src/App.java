

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
       

        System.out.print("Digite a quantidade em litros de água ingerida hoje: ");
        double aguaIng = sc.nextDouble();
        
        
        double ideal = ((peso * 35)/ 1000);
        double faltante = (ideal - aguaIng);
        
        System.out.println("Nome:" +nome);
        System.out.println("Peso: " +Math.ceil(peso)+ "kg");
        System.out.println("Quantidade de água ingerida hoje: " +Math.ceil(aguaIng)+ " litros");
        System.out.println("Quantidade diária ideal a ingerir: " +Math.ceil(ideal)+ " litros");

        if (faltante < 0){
            System.out.println ("Parabéns! Você atingiu a meta de hidratação diária ");
            
        }
        else {
            System.out.print("Continue focado em se hidratar por hoje, ainda faltam " +Math.ceil(faltante)+ " litros, voce consegue!");
        
        }
        
    
        sc.close();

        }


        

        
    }

