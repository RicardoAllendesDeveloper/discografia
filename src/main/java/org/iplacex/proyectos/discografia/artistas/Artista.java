package org.iplacex.proyectos.discografia.artistas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document("artistas")
public class Artista {
    @Id
    public String _id;
    public String nombre;
    public List<String> estilos;
    public int anioFundacion;
    public boolean estaActivo;

    //se crea un constructor vacío, necesario para Spring Data MongoDB
    public Artista() {
    }

    //ahora creamoos un constructor con parámetros para facilitar la creación de objetos Artista
    public Artista(String _id,String nombre, List<String> estilos, int anioFundacion, boolean estaActivo) {
        this._id = _id;
        this.nombre = nombre;
        this.estilos = estilos;
        this.anioFundacion = anioFundacion;
        this.estaActivo = estaActivo;
    }
}
