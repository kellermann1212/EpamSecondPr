package epamTasks.task2_1.Menu;

import epamTasks.task2_1.library.BooksArray;
import java.util.Scanner;

public class Menu {
    public static void ShowMenu(){
        BooksArray library = new BooksArray();
        Scanner scan = new Scanner(System.in);
        int num;
        stop:
        while (true){
            System.out.println("Choose what i have to do(Write num without ')' symbol)");
            System.out.println("1)Show library");
            System.out.println("2)Show books written by author");
            System.out.println("3)Show books published by publishing house");
            System.out.println("4)Show books published after certain year");
            System.out.println("5)Sort by publishing house");
            System.out.println("6)Cancel");
            num = GetCheckedNum();
            if(num > 0 & num < 7){
                switch (num){
                    case 1:
                        library.ShowArr();
                        break;
                    case 2:
                        System.out.println("Write author: ");
                        library.GetBooksByAuthor(scan.nextLine());
                        break;
                    case 3:
                        System.out.println("Write publishing house: ");
                        library.GetBooksByPublish(scan.nextLine());
                        break;
                    case 4:
                        System.out.println("Write a year: ");
                        library.GetBooksAfterY(GetCheckedNum());
                        break;
                    case 5:
                        library.ArraySort();
                        break;
                    case 6:
                        break stop;
                }
            }
            else
                System.out.println("---------------Try again-------------------");
        }
    }
    public static int GetCheckedNum(){
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        if(scanner.hasNextInt())
            num = scanner.nextInt();
        return num;
    }
}
