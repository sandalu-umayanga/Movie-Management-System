package org.example.model;

import java.util.*;

public class Movie {

    // properties of the movie object can have
    private String title;
    private String director;
    private String genre;
    private String year;
    private boolean isAvailable;    // help to update the availability of the movie to give or to return
    private Map<Customer, Integer> customerList;    // keep the track of the customers that borrowed the movie
    private Customer borrowed;  // keep the track of present borrower

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // movie constructor there are some properties that are essential for creating the movie instant
    public Movie ( String title , String director , String genre , String year ) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.isAvailable = true;    // automatically set to true when initiating
        this.customerList = new HashMap<>();  // automatically created
        this.borrowed = null;   // stay null until borrowed
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // getters

    public String getTitle () {
        return title;
    }

    public String getDirector () {
        return director;
    }

    public String getGenre () {
        return genre;
    }

    public String getYear () {
        return year;
    }

    public boolean isAvailable () {
        return isAvailable;
    }

    public Map<Customer, Integer> getCustomerList () {
        return customerList;
    }

    public Customer getBorrowed () {
        return borrowed;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // setters

    public void setTitle ( String title ) {
        this.title = title;
    }

    public void setDirector ( String director ) {
        this.director = director;
    }

    public void setGenre ( String genre ) {
        this.genre = genre;
    }

    public void setYear ( String year ) {
        this.year = year;
    }

    public void setAvailable ( boolean available ) {
        isAvailable = available;
    }

    public void setBorrowed ( Customer borrowed ) {
        this.borrowed = borrowed;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // addCustomer method to add the customer to the customerList
    public void addCustomer ( Customer customer ) {
        int count = customerList.getOrDefault(customer , 0);
        this.customerList.put(customer , count + 1);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // removeCustomer method to remove the customer from the customerList
    public void removeCustomer ( Customer customer ) {
        if (customerList.containsKey(customer)) {
            int count = customerList.get(customer);
            if (count == 1) {
                this.customerList.remove(customer);
            } else {
                this.customerList.put(customer , count - 1);
            }
        } else {
            System.out.println("Customer not found in the list");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // toString method to print the movie object
    @Override
    public String toString () {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", isAvailable=" + isAvailable +
                ", customerList=" + customerList +
                ", borrowed=" + borrowed +
                '}';
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    // equals method to compare two movie objects
    @Override
    public boolean equals ( Object obj ) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Movie movie = (Movie) obj;

        if (isAvailable != movie.isAvailable) return false;
        if (!Objects.equals(title , movie.title)) return false;
        if (!Objects.equals(director , movie.director)) return false;
        if (!Objects.equals(genre , movie.genre)) return false;
        if (!Objects.equals(year , movie.year)) return false;
        if (!Objects.equals(customerList , movie.customerList)) return false;
        return Objects.equals(borrowed , movie.borrowed);
    }

}
