package edu.knoldus;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Movie {

    String moviename;
    Integer releaseyear;
    Integer rating;
    String Genre;

    public Movie(String moviename, Integer releaseyear, Integer rating, String genre) {
        this.moviename = moviename;
        this.releaseyear = releaseyear;
        this.rating = rating;
        Genre = genre;
    }

    public String toString()
    {
        return moviename;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("abc",2000,9,"Comedy");
        Movie movie2 = new Movie("Abc", 2005,5,"Sci-Fi");
        Movie movie3 = new Movie("def",2002,10,"Comedy");
        Movie movie4 = new Movie("ghf",2017,7,"Sci-fi");
        List<Movie> movieinfo = new ArrayList<Movie>();
        movieinfo.add(movie1);
        movieinfo.add(movie2);
        movieinfo.add(movie3);
        //ques1
        List<Movie> comedyMovie = movieinfo.stream().filter(s->s.rating>8 && s.Genre.equals("Comedy")).collect(toList());
        System.out.println(" Movies with rating more than 8 and genre comedy" + comedyMovie);
        //ques2
        List<Movie> movieHavingRatingLessThaneight = movieinfo.stream().filter(s -> s.releaseyear > 2000 && s.rating < 8).collect(toList());
        System.out.println(" Movies with release year greater than 2000 and rating less than 8" + movieHavingRatingLessThaneight);
        //ques3
        List<Movie> movieHavingRatingAsEvenInNumber = movieinfo.stream().filter(s-> s.rating %2 == 0 ).collect(toList());
        System.out.println(" movies with rating as even number " + movieHavingRatingAsEvenInNumber);
        //ques4
        List<Movie> scifiMovies = movieinfo.stream().filter(s->s.rating == 7 && s.Genre.equals("Sci-Fi")).collect(toList());
        System.out.println("movies with rating equals to 7 and genre Sci-Fi" + scifiMovies);

    }
}




