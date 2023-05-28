package aula12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import Util.UserInput;

public class Ex3 {

    public static void main(String[] args) {
        List<Movie> movies = readMoviesFromFile("movies.txt");
        System.out.println("Filmes sorteados pelo Nome:");
        displayMovies(movies);

        
        Collections.sort(movies, Comparator.comparingDouble(Movie::getScore).reversed());
        System.out.println("\nFilmes sorteados pelo Score por ordem decrescente:");
        displayMovies(movies);

        Collections.sort(movies, Comparator.comparingInt(Movie::getTime));
        System.out.println("\nFilmes sorteados por Tempo de Execução por ordem ascendente:");
        displayMovies(movies);

        System.out.println("\nGéneros distintos / Número de filmes desse género:");
        displayDistinctGenres(movies);     
        
        writeMovies(movies, "myselection.txt");
    }

    private static List<Movie> readMoviesFromFile(String fileName) {
        List<Movie> movies = new ArrayList<>();

        try{
            Scanner input = new Scanner(new FileReader(fileName));
            String line = input.nextLine();
            boolean firstLine = true;
            while (input.hasNextLine()) {
                if (!firstLine) {
                    String[] tokens = line.split("\t");
                    Movie movie = new Movie(tokens[0], Double.parseDouble(tokens[1]), tokens[2], tokens[3], Integer.parseInt(tokens[4]));
                    movies.add(movie);
                }else{
                    firstLine = false;
                }
                line = input.nextLine();
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Erro ao encontrar o ficheiro "+fileName);;
        }
        return movies;
    }

    private static void displayMovies(List<Movie> movies){
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    
    private static void displayDistinctGenres(List<Movie> movies) {
        Set<String> generos = new HashSet<>();

        for (Movie movie : movies) {
            generos.add(movie.getGender());
        }

        for (String genero : generos) {
            int count = 0;
            for (Movie movie : movies) {
                if (movie.getGender().equals(genero)) {
                    count++;
                }
            }
            System.out.println(genero + ": " + count);
        }
    }

    private static void writeMovies(List<Movie> movies, String file) {
        try{
            Set<String> generos = new HashSet<>();
            boolean contains = false;
            Scanner input = new Scanner(System.in);
            String escolha;
            FileWriter fileWriter = new FileWriter(file);

            for (Movie movie : movies) {
                generos.add(movie.getGender());
            }

            System.out.println("Insira um dos seguintes géneros que pretende selecionar!");
            for (String genero : generos) {
                System.out.print(genero+"   ");
            }
            System.out.println();
            do{
                do{
                    escolha = input.next();
                    if(UserInput.is_numeric(escolha)){
                        System.out.println("ERRO! Insira uma palavra!");
                    }
                }while(UserInput.is_numeric(escolha));

                if(generos.contains(escolha)){
                    contains = true;
                }else{
                    System.out.println("ERRO! A sua escolha não corresponde a nenhum dos géneros disponiveis!");
                }
            }while(!contains);
            input.close();
            for (Movie movie : movies) {
                if(movie.getGender().equals(escolha) && movie.getScore()>60){
                    fileWriter.write(movie.getName()+"\n");
                }
            }
            fileWriter.close();

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo " + file + ": " + e.getMessage());
        }
    }
}
