import java.util.Scanner;

public class Menu2Bebidas{
    public void desayunar(){
         int x=0;
    try (Scanner miScanner = new Scanner (System.in)) {
        int opcion;
   do{ 
        System.out.println("estas en la fonda de darwin");

        System.out.println("elige una opcion de bebida");

        System.out.println("1 Coca Cola");

        System.out.println("2 Fanta");
            
        System.out.println("3 Cerveza");
        
        System.out.println("4 Agua de limon");

        System.out.println("5 Agua de jamaica"); 

        System.out.println("6 Agua de Chia"); 

        System.out.println("7 Agua de jugo de naranja"); 

        opcion=miScanner.nextInt();
        
        switch (opcion){
            case 1:
            System.out.println("en un momento le damos su Coca Cola");

            break;

            case 2:
            System.out.println("en un momento le damos su Fanta");
            break;

            case 3:
            System.out.println("en un momento le damos su Cerveza");
            break;

            case 4:
            System.out.println("en un momento le damos su Agua de limon");
            break;

            case 5:
            System.out.println("en un momento le damos su Agua de jamaica");
            break;

            case 6:
            System.out.println("en un momento le damos su Agua de chia");
            break;

            case 7:
            System.out.println("en un momento le damos su Agua de jugo de naranja");
            break;

            case 8:
            System.out.println("Bye");
            System.exit(0);
            break;

            default:
            System.out.println("opcinn no disponible");
            break;
        }
        
}
   while (x!=5);
    }
}
}  



