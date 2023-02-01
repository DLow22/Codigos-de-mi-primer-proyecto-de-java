public class App {
    private static Menu mio;

    public static void main(String[] args) throws Exception {
        System.out.println("hola darwin");
        Menu mio = new Menu();
        mio.desayunar();
        
        Menu2Bebidas tuyo= new Menu2Bebidas();
        tuyo.desayunar();
        

    }
}

