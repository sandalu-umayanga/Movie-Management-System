package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    // properties of the customer object
    private String name;
    private String age;
    private String email;
    private boolean isAvailable;    // give the status of the customer
    private Movie borrowedMovie;    // help to keep the track of the current borrowed movie
    private Map<Movie, Integer> movieList;  // help to keep the track past borrowed movies

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    // constructor for the customer object (there are some essential properties to initiate the object)
    public Customer(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isAvailable = true;
        this.borrowedMovie = null;
        this.movieList = new HashMap<>();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    // getters

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAvailable () {
        return isAvailable;
    }

    public Movie getBorrowedMovie () {
        return borrowedMovie;
    }

    public Map<Movie, Integer> getMovieList () {
        return movieList;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    // setters

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( String age ) {
        this.age = age;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setAvailable ( boolean available ) {
        isAvailable = available;
    }

    public void setBorrowedMovie ( Movie borrowedMovie ) {
        this.borrowedMovie = borrowedMovie;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    // method to add a movie to the movie list
    public void addMovie ( Movie movie ) {
        if (movieList.containsKey(movie)) {
            movieList.put(movie, movieList.get(movie) + 1);
        } else {
            movieList.put(movie, 1);
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    // method to remove a movie from the movie list
    public void removeMovie ( Movie movie ) {
        if (movieList.containsKey(movie)) {
            int count = movieList.get(movie);
            if (count == 1) {
                movieList.remove(movie);
            } else {
                movieList.put(movie, count - 1);
            }
        } else {
            System.out.println("Movie not found in the list");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    // method to equalize the customer object
    @Override
    public boolean equals ( Object obj ) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return name.equals(customer.name) && age.equals(customer.age) && email.equals(customer.email);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    // method to print the customer object
    @Override
    public String toString () {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", isAvailable=" + isAvailable +
                ", borrowedMovie=" + borrowedMovie +
                ", movieList=" + movieList +
                '}';
    }
}
