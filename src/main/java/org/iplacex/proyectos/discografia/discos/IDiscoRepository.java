package org.iplacex.proyectos.discografia.discos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface IDiscoRepository extends MongoRepository<Disco, String> {
    //MongoRepository ya nos proporciona métodos básicos como save, findById, findAll, deleteById, etc.
    //Si queremos agregar métodos personalizados, podemos hacerlo aquí.

    //Ejemplo de método personalizado para encontrar discos por el ID del artista
    @Query("{ 'idArtista': ?0 }")
    List<Disco> findByIdArtista(String idArtista);
}
