import java.util.ArrayList;
import java.util.Arrays;


public class Solution  {

    public static Object[] reporte(ArrayList<Corredor> carrera) {
        double suma = 0;
        double avg = 0;
        double minTime = Double.MAX_VALUE;
        String corredorMinTime = "";
        double maxTime = Double.MIN_VALUE;
        String corredorMaxTime = "";

        for (Corredor corredor: carrera){
            suma += corredor.getTiempoMeta(); //Suma los tiempos a la suma total de las carreras

            // Se extrae el valor minimo y el nombre del corredor que obtuvo el tiempo minimo
            if (corredor.getTiempoMeta() > maxTime){
                maxTime = corredor.getTiempoMeta();
                corredorMaxTime = corredor.getNombreCompleto();
            }    
            // Se extrae el valor maximo y el nombre del corredor que obtuvo el tiempo maximo
            if (corredor.getTiempoMeta() < minTime){
                minTime = corredor.getTiempoMeta();
                corredorMinTime = corredor.getNombreCompleto();
           }    
        }
        avg = suma / carrera.size(); // Calcula el promedio de los tiempos de todas las carreras
       

        Object[] result = {avg, corredorMinTime, minTime, corredorMaxTime,  maxTime}; // Se crea un arreglo con los resultados
        return result; // Se retorna el arreglo con los resultados

    }
    public static void main (String[]args){
         
           ArrayList<Corredor> carrera = new ArrayList<>();
           carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
           carrera.add(new Corredor("Juan Corredor", "28", 1.75, 24, 21));
           carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
           carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));

           System.out.println(Arrays.toString(Solution.reporte(carrera)));
    }

    
}