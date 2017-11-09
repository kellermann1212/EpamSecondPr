package epamTasks.task2_1.library;

public class Book {

    private int year;
    private int pagesCount;
    private int price;

    private String name;
    private String author;
    private String publisher;


    public int getYear() {
        return year;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }



    public Book(){

    }

    public Book(int year, int pagesCount, int price, String name, String author, String publisher){

        this.year = year;
        this.pagesCount = pagesCount;
        this.price = price;

        this.name = name;
        this.author = author;
        this.publisher = publisher;

    }

    @Override
    public String toString(){
        return "Name: " + name +  ";  Author: " + author + ";  Publishing house: " + publisher + "\nPrice = " +
               price + ";  Number of pages: " + pagesCount + "p." + ";  Year: " + year + ".";
    }
}
