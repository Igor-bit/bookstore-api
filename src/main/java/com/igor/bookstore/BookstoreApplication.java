package com.igor.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igor.bookstore.domain.Categoria;
import com.igor.bookstore.domain.Livro;
import com.igor.bookstore.repositories.CategoriaRepository;
import com.igor.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}