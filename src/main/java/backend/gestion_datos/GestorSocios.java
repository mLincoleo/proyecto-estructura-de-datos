package backend.gestion_datos;

import backend.clientes.Validable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GestorSocios implements Validable{
    
    private final String dateFormat;
    
    public GestorSocios(){
        this.dateFormat = "dd/MM/yyyy";
    }

    @Override
    public boolean validarFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento == null){
            return false;
        }
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try{
            sdf.parse(fechaNacimiento);
        }catch(ParseException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    

}
