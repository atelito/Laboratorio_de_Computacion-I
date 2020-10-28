package tp2;


public class Ej16 {

    public static void main(String[] args) {
        /* Como transformo una variable tipo Double a una variable tipo double.
         
        tres metodos pero no entiendo la diferencia:
        Double.parseDouble()
        Double.valueOf()
        y usando un constructor new Double()
        */
        Double numD = 4.5;
        System.out.println(numD);
        System.out.println("El numero ingresado ahora es de tipo " +  ((Object)numD).getClass().getSimpleName());
        
        String numS = String.valueOf(numD);
        System.out.println(numS);
        System.out.println("El numero ingresado ahora es de tipo " +  ((Object)numS).getClass().getSimpleName());
        
        double numd = Double.parseDouble(numS);
        System.out.println(numd);
                
    }
}
