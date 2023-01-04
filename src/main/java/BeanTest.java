


public class BeanTest {
    public static void main(String[] args) {
        // Create a few instances of Album, Author, and Quote
        Album album1 = new Album("Thriller", "Michael Jackson");
        Album album2 = new Album("The Dark Side of the Moon", "Pink Floyd");

        Author author1 = new Author("Stephen King");
        Author author2 = new Author("Jane Austen");

        Quote quote1 = new Quote("The only thing necessary for the triumph of evil is for good men to do nothing.", author1);
        Quote quote2 = new Quote("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.", author2);
    }

}