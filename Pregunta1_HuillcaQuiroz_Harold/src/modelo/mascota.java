package modelo;
/**
 *
 * @author dante
 */
public class mascota {
    private int id_mascota;
    private String nombre;
    private char especie;
    private char sexo;
    private String ubicacion;
    private char estado;

    public mascota() {
    }

    public mascota(int id_mascota, String nombre, char especie, char sexo, String ubicacion, char estado) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEspecie() {
        return especie;
    }

    public void setEspecie(char especie) {
        this.especie = especie;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
