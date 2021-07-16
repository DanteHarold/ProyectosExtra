package modelo;
import java.util.ArrayList;
/**
 *
 * @author dante
 */
public class arreglomascota {
    
    private ArrayList<mascota> C1;

    public arreglomascota() {
        
        C1 = new ArrayList<mascota>();
          
    }   
    
    public void Adicionar(mascota C){    
        C1.add(C);       
    }
    public int Size(){
        
        return C1.size();
    }
     public mascota Obtener(int i){
        return C1.get(i);
    }
    public void EliminarTodo(){
            C1.clear();
    }
     
}
