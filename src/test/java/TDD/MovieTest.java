package TDD;

import org.example.model.Customer;
import org.example.model.Movie;
import org.junit.Test;

import static org.junit.Assert.*;


public class MovieTest {


    // testing for initiation of the movie object and its getters
    @Test
    public void testingCreatingMovie () {
        Movie movie = new Movie("Title" , "Director" , "Genre" , "2001");
        assertNotNull("Movie title should not be empty" , movie.getTitle());
        assertEquals("Two values should be equal" , "Director" , movie.getDirector());
        assertFalse("Released year value should not be empty" , movie.getYear().isEmpty());
        assertTrue("Availability should be True" , movie.isAvailable());
        assertEquals("Two values should be Equal" , "Genre" , movie.getGenre());
        assertNull("get borrowed variable should be null" , movie.getBorrowed());
        assertTrue("Customer List should be Empty" , movie.getCustomerList().isEmpty());
    }

    // testings for the setters of the movie object
    @Test
    public void testingSetters () {
        Movie movie = new Movie("Title" , "Director" , "Genre" , "2001");
        movie.setTitle("New Title");
        assertEquals("Two values should be equal" , "New Title" , movie.getTitle());
        movie.setDirector("New Director");
        assertEquals("Two values should be equal" , "New Director" , movie.getDirector());
        movie.setGenre("New Genre");
        assertEquals("Two values should be equal" , "New Genre" , movie.getGenre());
        movie.setYear("2021");
        assertEquals("Two values should be equal" , "2021" , movie.getYear());
        movie.setAvailable(false);
        assertFalse("Availability should be False" , movie.isAvailable());
        movie.setAvailable(true);
        assertTrue("Availability should be True" , movie.isAvailable());
        movie.setBorrowed(new Customer("Name" , "Age" , "Email"));
        assertNotNull("Borrowed should not be null" , movie.getBorrowed());
        movie.setBorrowed(null);
        assertNull("Borrowed should be null" , movie.getBorrowed());
    }

    // testing the addCustomer method of the movie object
    @Test
    public void testingAddCustomer () {
        Movie movie = new Movie("Title" , "Director" , "Genre" , "2001");
        Customer customer = new Customer("Name" , "Age" , "Email");
        movie.addCustomer(customer);
        assertFalse("Customer List should not be Empty" , movie.getCustomerList().isEmpty());
        assertEquals("Two values should be equal" , "Name" , movie.getCustomerList().keySet().iterator().next().getName());
    }

    // testing the removeCustomer method of the movie object
    @Test
    public void testingRemoveCustomer () {
        Movie movie = new Movie("Title" , "Director" , "Genre" , "2001");
        Customer customer = new Customer("Name" , "Age" , "Email");
        movie.addCustomer(customer);
        movie.removeCustomer(customer);
        assertTrue("Customer List should be Empty" , movie.getCustomerList().isEmpty());
    }

    // testing the toString method of the movie object
    @Test
    public void testingToString () {
        Movie movie = new Movie("Title" , "Director" , "Genre" , "2001");
        assertEquals("Two values should be equal" , "Movie{title='Title', director='Director', genre='Genre', year='2001', isAvailable=true, customerList={}, borrowed=null}" , movie.toString());
    }

    // testing the equals method of the movie object
    @Test
    public void testingEquals () {
        Movie movie1 = new Movie("Title" , "Director" , "Genre" , "2001");
        Movie movie2 = new Movie("Title" , "Director" , "Genre" , "2001");
        assertTrue("Two objects should be equal" , movie1.equals(movie2));
        movie2.setTitle("New Title");
        assertFalse("Two objects should not be equal" , movie1.equals(movie2));
    }

}
