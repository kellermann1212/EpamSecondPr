package epamTasks.task2_1.library.utils;

import epamTasks.task2_1.library.Book;
import java.util.Comparator;

public class BooksPublComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Book b1 = (Book)o1;
        Book b2 = (Book)o2;
        char firstCharB1 = b1.getPublisher().trim().toCharArray()[0];
        char firstCharB2 = b2.getPublisher().trim().toCharArray()[0];
        if(firstCharB1 < firstCharB2) return -1;
        if(firstCharB1 > firstCharB2) return 1;
        return  0;
    }
}
