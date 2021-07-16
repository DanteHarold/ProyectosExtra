package modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author dante
 */
public class ConsultasMascota extends conexion {
    public boolean Registrar (mascota al){
           Connection con = getConexion();
        try{
           Statement obj =con.createStatement(); 
           int cantidad=obj.executeUpdate("insert into mascotas values("+al.getId_mascota()+",'"
                                        +al.getNombre()+"','"
                                        +al.getEspecie()+"','"
                                        +al.getSexo()+"','"
                                        +al.getUbicacion()+"','"
                                        +al.getEstado()+"')");
           if(cantidad==1)return true;
           else return false;
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Error Agregar");
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("Error al Cerrar la Conexion");
            }
        }
    }
    public boolean Modificar (mascota al){
           Connection con = getConexion();
        try{
           Statement obj =con.createStatement(); 
           int cantidad=obj.executeUpdate("update mascotas set nombre_mascota='"+al.getNombre()+
                                            "',especie='"+al.getEspecie()+
                                            "',sexo='"+al.getSexo()+
                                            "',ubicacion='"+al.getUbicacion()+
                                            "',estado='"+al.getEstado()+"' where id_mascota="+al.getId_mascota());
           if(cantidad==1)return true;
           else return false;
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Error Modificar");
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("Error Modificar");
            }
        }
    }
    public boolean Eliminar(mascota al){
           Connection con = getConexion();
        try{
           Statement obj =con.createStatement(); 
           int cantidad=obj.executeUpdate("delete from mascotas where id_mascota="+al.getId_mascota());
           if(cantidad==1)return true;
           else return false;
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Error Eliminar");
            return false;
            
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("Error Eliminar");
            }
        }
    }
    public boolean Buscar(mascota al){
           Connection con = getConexion();
        try{
           Statement obj =con.createStatement(); 
           ResultSet rs=obj.executeQuery("select*from mascotas where id_mascota="+al.getId_mascota());
           if(rs.next()){
               al.setId_mascota(rs.getInt("id_mascota"));
               al.setNombre(rs.getString("nombre_mascota"));
               al.setEspecie(rs.getString("especie").charAt(0));
               al.setSexo(rs.getString("sexo").charAt(0));
               al.setUbicacion(rs.getString("ubicacion"));
               al.setEstado(rs.getString("estado").charAt(0));
               return true;
           }else return false;
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Error Consultar1");
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("Error Consultar2");
            }
        }
    }
    public boolean Listar(arreglomascota a){
           Connection con = getConexion();
        try{
            Statement obj =con.createStatement(); 
            ResultSet rs=obj.executeQuery("select*from mascotas");
            //ResultSetMetaData rsm = rs.getMetaData();
            //int col = rsm.getColumnCount();
            a.EliminarTodo();
           while(rs.next()){ 
               mascota ma = new mascota(rs.getInt("id_mascota"),rs.getString("nombre_mascota"),rs.getString("especie").charAt(0),rs.getString("sexo").charAt(0),rs.getString("ubicacion"),rs.getString("estado").charAt(0));
               a.Adicionar(ma);
               System.out.println("ID_Mascota: "+rs.getInt("id_mascota"));
               System.out.println("Nombre: "+rs.getString("nombre_mascota"));
               System.out.println("Especie: "+rs.getString("especie"));
               System.out.println("Sexo: "+rs.getString("sexo"));
               System.out.println("Ubicacion: "+rs.getString("ubicacion"));
               System.out.println("Estado: "+rs.getString("estado"));
               System.out.println("");
           }
           return true;
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Error Consultarr");
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("Error Consultar2");
            }
        }
        return false;
    }
}
