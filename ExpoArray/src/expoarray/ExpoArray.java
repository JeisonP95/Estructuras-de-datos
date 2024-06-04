package expoarray;
import java.util.ArrayList;

public class ExpoArray {

    public static void main(String[] args) {
        ArrayList<String> motos = new ArrayList<String>();
        
        //agregar al array
        motos.add("Ducati");
        motos.add("Suzuki");
        motos.add("Bajaj");
        motos.add("Yamaha");
        
        //para modificar
        motos.set(0, "husbarna");
        
        //para eliminar
        motos.remove(1);
        
        //para mostrar por indice
        System.out.println(motos.get(2) + "\n");

        //mostrar todos
        System.out.println("mostrar todos -> ");
        for (int i = 0; i < motos.size(); i++) {
             System.out.println(motos.get(i));  
        }

    }
}


