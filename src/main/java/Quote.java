public class Quote {

    private String Quote;
    private String author;
    public Quote() {
    }

    public Quote(String quote, String author) {
        Quote = quote;
        this.author = author;
    }

    public String getQuote(){
        return Quote;
    }
    public  void setQuote(){
        this.Quote = Quote;
    }

    public void setQuote(String quote) {
        Quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


