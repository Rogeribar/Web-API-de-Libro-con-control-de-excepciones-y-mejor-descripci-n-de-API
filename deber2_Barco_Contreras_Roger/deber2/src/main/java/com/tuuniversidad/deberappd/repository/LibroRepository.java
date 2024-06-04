package com.tuuniversidad.deberappd.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.deberappd.models.Libro;

@Repository
public class LibroRepository {

    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
        libros.add(new Libro(1L, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960));
        libros.add(new Libro(2L, "1984", "George Orwell", "Secker & Warburg", 1949));
        libros.add(new Libro(3L, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 1813));
        libros.add(new Libro(4L, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925));
        libros.add(new Libro(5L, "Moby-Dick", "Herman Melville", "Harper & Brothers", 1851));
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
