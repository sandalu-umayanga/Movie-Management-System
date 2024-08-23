package TDD;

import org.example.model.Customer;
import org.example.model.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    // testing for initiating of the customer and its getter functions
    @Test
    public void testingCreatingCustomer () {
        Customer customer = new Customer("Name", "12", "sandalu@gmail.com");
        assertEquals("These values should be equal", "Name", customer.getName());
        assertEquals("These values should be equal", "12", customer.getAge());
        assertEquals("These values should be equal", "sandalu@gmail.com", customer.getEmail());
        assertTrue("Status of the availability should be true", customer.isAvailable());
        assertNull("The value of borrowed should be null because it does not borrow when initiating", customer.getBorrowedMovie());
        assertTrue("List should be empty", customer.getMovieList().isEmpty());
    }

    // tests for customer setter functions
    @Test
    public void testingSetters () {
        Customer customer = new Customer("Name" , "12" , "sandalu@gmail.com");
        customer.setName("New Name");
        customer.setAge("13");
        customer.setEmail("sandaluNew@gmail.com");
        customer.setAvailable(false);
        customer.setBorrowedMovie(new Movie("Movie", "Priya", "Action", "2021"));
        assertFalse("Status of the availability should be false", customer.isAvailable());
        assertEquals("These values should be equal", "New Name", customer.getName());
        assertEquals("These values should be equal", "13", customer.getAge());
        assertEquals("These values should be equal", "sandaluNew@gmail.com", customer.getEmail());
        assertEquals("These values should be equal", "Movie", customer.getBorrowedMovie().getTitle());
    }

    // tests for adding movie to the customer list
    @Test
    public void testingAddMovie () {
        Customer customer = new Customer("Name" , "12" , "sandalu@gmail.com");
        Movie movie = new Movie("Movie" , "Priya" , "Action" , "2021");
        customer.addMovie(movie);
        assertEquals("These values should be equal" , "Movie" , customer.getMovieList().keySet().iterator().next().getTitle());
        assertEquals("These values should be equal" , 1 , customer.getMovieList().values().iterator().next().intValue());
    }

    // tests for removing movie from the customer list
    @Test
    public void testingRemoveMovie () {
        Customer customer = new Customer("Name" , "12" , "SANDALU@gmail.com");
        Movie movie = new Movie("Movie" , "Priya" , "Action" , "2021");
        customer.addMovie(movie);
        customer.removeMovie(movie);
        assertTrue("List should be empty" , customer.getMovieList().isEmpty());
    }

    // testing for equals method
    @Test
    public void testingEquals () {
        Customer customer = new Customer("Name" , "12" , "sandalu@gmail.com");
        Customer customer1 = new Customer("Name" , "12" , "sb@gmail.com");
        assertFalse("These objects should be equal" , customer.equals(customer1));
    }

    // testing for toString method
    @Test
    public void testingToString () {
        Customer customer = new Customer("Name" , "12" , "sn@gmail.com");
        assertEquals("These values should be equal" , "Customer{name='Name', age='12', email='sn@gmail.com', isAvailable=true, borrowedMovie=null, movieList={}}" , customer.toString());
    }



}
