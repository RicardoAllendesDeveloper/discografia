package org.iplacex.proyectos.discografia.artistas;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArtistaRepository extends MongoRepository<Artista, String> {
    //MongoRepository ya nos proporciona métodos básicos como save, findById, findAll, deleteById, etc.
    //Si queremos agregar métodos personalizados, podemos hacerlo aquí.
}
