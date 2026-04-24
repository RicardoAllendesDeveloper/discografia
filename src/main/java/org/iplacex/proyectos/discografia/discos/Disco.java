package org.iplacex.proyectos.discografia.discos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("discos")
public class Disco {
    
    @Id
    public String _id;
    public String idArtista;
    public String nombre;
    public int anioLanzamiento;

    //Creamos un constructor vacío, necesario para Spring Data MongoDB
    public Disco() {
    }

    //Ahora creamos un constructor completo
    public Disco(String _id, String idArtista, String nombre, int anioLanzamiento) {
        this._id = _id;
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
    }
}
