import java.util.Scanner;

public class Menu {
    public void desayunar(){
         int x=0;
    try (Scanner MiScanner = new Scanner (System.in)) {
        int opcion;
   do{ 
  System.out.println("*");


  
        System.out.println("estas en la fonda de darwin");

        System.out.println("elige una opcion de comida");

        System.out.println("1 huevos revueltos");

        System.out.println("2 milanesas");

        System.out.println("3 tacos");

        System.out.println("4 sopa de arroz");

        
        System.out.println("*");



        System.out.println("elige una opcion de bebida");

        System.out.println("5 Coca Cola");

        System.out.println("6 Fanta");
            
        System.out.println("7 Cerveza");
        
        System.out.println("8 Agua de limon");

        System.out.println("9 Agua de jamaica"); 

        System.out.println("10 Agua de Chia"); 

        System.out.println("11Agua de jugo de naranja"); 

        System.out.println("12 salir"); 

        opcion=MiScanner.nextInt();
        switch (opcion){
            case 1:
            System.out.println("en un momento sale tus huevos revueltos");

            break;

            case 2:
            System.out.println("en un momento sale tus milanesas");
            break;

            case 3:
            System.out.println("en un momento sale tus tacos");
            break;
            case 4:

            System.out.println("en un momento sale tu sopa de arroz");
            break;

            case 5:
            System.out.println("en un momento le damos su Coca Cola");

            break;

            case 6:
            System.out.println("en un momento le damos su Fanta");
            break;

            case 7:
            System.out.println("en un momento le damos su Cerveza");
            break;

            case 8:
            System.out.println("en un momento le damos su Agua de limon");
            break;

            case 9:
            System.out.println("en un momento le damos su Agua de jamaica");
            break;

            case 10:
            System.out.println("en un momento le damos su Agua de chia");
            break;

            case 11:
            System.out.println("en un momento le damos su Agua de jugo de naranja");
            break;
            case 12:
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


