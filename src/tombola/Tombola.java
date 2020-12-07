/*
 *12.	Un supermercado realiza una tómbola con todos los clientes, 
si son hombres tienen que sacar de una canasta una bolita la cual tiene 
un número grabado y si son mujeres lo mismo pero de otra canasta, los premios s
e dan bajo la siguiente tabla:	

	HOMBRES				MUJERES
	# Bolita		Premio		# bolita		Premio
	1		Desodorante		1		Loción
	2		Six-Pack de cerveza	2		Bikini
	3		Camiseta		3		Crema para la cara
	4		Pantaloneta		4		Plancha para el cabello
	5		Sudadera		5		Esmalte de uñas	


 */
package tombola;

import java.util.Scanner;

/**
 *
 * @author karol martinez
 */
public class Tombola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        int hm,bola; 
        System.out.println("Digite 1 si es hombre ");
        System.out.println("Digite 2 si es mujer ");
        hm=leer.nextInt(); 
        
        if (hm==1){
            System.out.println("Que numero de bola le salio ");
            bola=leer.nextInt();
            
            switch (bola){
                case 1: 
                    System.out.println("FELICDADES SU PREMIO ES UN DESODORANTE");
                    break;
                case 2:
                    System.out.println("FELICIDADES SU PREMIO ES UN SIX PACK DE CERVESA");
                    break;
                case 3:
                    System.out.println("FELICIDADES SU PREMIO ES UNA CAMISA");
                    break;
                case 4:
                    System.out.println(" FELICIDADES SU PREMIO ES UN PANTALON");
                    break;
                case 5:
                    System.out.println("FELICIDADES SU PREMIO ES UNA SUDADERA");
                    break;
                default:
                    System.out.println("NO GANO NADA");
                
            
            }
            
        }
        else {
            if (hm==2){
                System.out.println("Que numero de bola le salio ");
            bola=leer.nextInt();
            
            switch (bola){
                case 1: 
                    System.out.println("FELICDADES SU PREMIO ES UNA LOCION");
                    break;
                case 2:
                    System.out.println("FELICIDADES SU PREMIO ES UN BIKINI");
                    break;
                case 3:
                    System.out.println("FELICIDADES SU PREMIO ES UNA CREMA PARA LA CARA");
                    break;
                case 4:
                    System.out.println(" FELICIDADES SU PREMIO ES UNA PLANCA PARA EL CABELLO");
                    break;
                case 5:
                    System.out.println("FELICIDADES SU PREMIO ES UN ESMALTE DE UÑAS");
                    break;
                default:
                    System.out.println("NO GANO NADA");
                
            
            }
            }
            else {
                System.out.println("DIGITO UN NUMERO EQUIVOCADO");
            }
        }
        
       
    }
    
}
