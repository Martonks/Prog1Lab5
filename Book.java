public class Book{
    
    String title, author, ISBN;
    int yearpublish;
    static String publisher = "Vanier";
    static int amountofBooks = 0;

	/**
     * @param title is the title of the book
     * @param author is the author of the book
     * @param ISBN is the international standard book number
     * @param yearpublish is the year the book was published
     */

    public Book(String title, String author, String ISBN, int yearpublish){

        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearpublish = yearpublish;
        setYear(yearpublish);
    }

    public void increment(){
    amountofBooks++;
    }
    
    public boolean equals(Book other){
        return(ISBN.equals(other.ISBN));
    }

    void setYear(int yearpublish){

        this.yearpublish = yearpublish;
        if(yearpublish <= 0){
            System.out.println("That year is negative as a value.");
        }
    }

    void setPublisher (String publisher){
        this.publisher = publisher;
    }
    
    public String getPublisher(){
    return publisher;
    }

    public int getAmountofBooks(){
    return amountofBooks;
    }

    public String toString(){
        
        return "\nSELECTED BOOK: "+this.title+
               "\n---------------------------------------------------"+
               "\n The author is:             "+ this.author +
               "\n The ISBN is:               "+ this.ISBN + 
               "\n The book was published in: "+ this.yearpublish+
               "\n The publisher is           "+ this.publisher+
               "\n---------------------------------------------------";

    }
}

