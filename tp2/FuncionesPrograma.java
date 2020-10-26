package tp2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesPrograma {
    //atributos
    private Date fecha;
    public static String VARIABLE_QUE_NO_CAMBIA; //es unica para la clase y no cambia. Si los valores creados con este tipo de variable van cambiando, cambiara el valores para todos los objetos creados con esta clase
    //si se pone el calificador final hace que no se pueda modificar nunca el valor de ese atributo
    
    //Constructor sobrecargado. Sirve para que al crear un objeto haya que definir especificamente los parametros
    public FuncionesPrograma(Date fecha) {
        this.fecha = fecha;
    }
    //Explicitamente creo un constructor vacio, para no tener que obligatoriamente usar el constructor sobrecargado
    public FuncionesPrograma(){
    }

    //Encapsular para ser accedido desde otra clase, pero de manera privada   
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //Se coloca this.atributo cuando se hace referencia a una variable(atributo) que esta definida en la propia clase. Si se usara en otra case no.
    
    //Si el metodo es estatico no es necesario hacer una instanciacion de la clase -no poner Clase xx = new Clase();-
    //Se quiere usar un metodo de la clase pero sin necesidad de ir creando objetos
    
    //Es necesario que la clase o el metodo que lo utiliza o llama tambien sea estatico
    public static String getFechaString(Date fecha) {
        Date fechaHora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String fechaHoraconvertida = formatter.format(fechaHora);  
        System.out.println("Fecha con formato dd/MM/yyyy : "+ fechaHoraconvertida);
        return fechaHoraconvertida;
    }
    
    public static Date getFechaDate(int día, int mes, int anio){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, día);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.YEAR, anio);
        System.out.println("Fecha con 3 valores enteros -Ej18- : "+ cal.getTime());
        return cal.getTime();
        
    }
    
    
    }
