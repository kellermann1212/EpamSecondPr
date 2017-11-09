package epamTasks.task2_1.library;

import epamTasks.task2_1.library.utils.BooksPublComparator;
import java.util.Arrays;

public class BooksArray {

    private Book[] books;

    public BooksArray(){
        books = new Book[7];
        books[0] = new Book(1978, 1300, 1000,
                "Call of ktulhu", "Hovard Philips Lovecraft", "Book house");
        books[1] = new Book(1955, 800, 650,
                "The mountains of madness", "Hovard Philips Lovecraft", "Book house");
        books[2] = new Book(1996, 2500, 870,
                "It", "Steven King", "Century Fox");
        books[3] = new Book(2001, 1220, 780,
                "Metro 2033", "Dmitriy Hlyhovski", "Saint production");
        books[4] = new Book(1770, 400, 560,
                "Over the garden wall", "Bob Lovers", "Century Fox");
        books[5] = new Book(1956, 5300, 1200,
                "The music of erich zan", "Hovard Philips Lovecraft", "Book house");
        books[6] = new Book(2006, 1143, 920,
                "Liberty", "David Vine", "Akropolis entertainment");
    }


    public void GetBooksByAuthor(String author){
        if(CheckForAuthorValue(author)){
            System.out.println("Author: " + author);
            for(Book x: books){
                if(x.getAuthor().equals(author)){
                    System.out.println(x.toString());
                }
            }
        }
        else
            System.out.println("There is no books written by " + author);

    }

    public void GetBooksByPublish(String publisher){
        if(CheckForPublishValue(publisher)){
            System.out.println("Publishing house: " + publisher);
            for(Book x: books){
                if(x.getPublisher().equals(publisher)){
                    System.out.println(x.toString());
                }
            }
        }
        else
            System.out.println("There is no books with " + publisher + " publisher");
    }

    public void GetBooksAfterY(int year){
        if(CheckAfterYearValue(year)){
            if(year > 0){
                System.out.println("Year: " + year);
                for(Book x: books){
                    if(x.getYear() > year)
                        System.out.println(x.toString());
                }
            }
            else
                System.out.println("Error");
        }
        else
            System.out.println("There is no books after " + year + " year");

    }


    public void ShowArr(){
        System.out.println("Books in array:");
        for(Book x: books){
            System.out.println(x.toString());
            System.out.println("---------------------------------------------");
        }
    }
    public void ArraySort(){
        Arrays.sort(books, new BooksPublComparator());
    }

    public boolean CheckForPublishValue(String publish){
        if(!ArrIsEmpty())
            return false;
        for(Book x: books)
            if(x.getPublisher().equals(publish))
                return true;
        return false;
    }

    public boolean CheckAfterYearValue(int year){
        if(!ArrIsEmpty())
            return false;
        for(Book x: books)
            if(x.getYear() > year)
                return true;
        return false;
    }

    public boolean CheckForAuthorValue(String author){
        if(!ArrIsEmpty())
            return false;
        for(Book x: books)
            if(x.getAuthor().equals(author))
                return true;
        return false;
    }

    public boolean ArrIsEmpty(){
        return books.length != 0;
    }


}
