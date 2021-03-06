//Authors: Ethan Kupershtein, Liam Healy, Davian Brown, Daniel Gneco
//05/04/2021
//MovieHeap- This Program will create the priority Queues based on the comparators and ask the user which to display

import java.io.*;
import java.util.*;

public class MovieHeap {
    
    public static void main(String[] args)throws IOException {
    //Variable to choose sort
    int selection;
    
    //Create File and Scanner
    File movies = new File("movies2.txt");
    Scanner scan = new Scanner(movies);
    //Create Scanner for input
    Scanner input = new Scanner(System.in);

    //Create Priority Queues for each comparator
    PriorityQueue<Movie> yearCompare = new PriorityQueue<Movie>(1, new YearComparator());
    PriorityQueue<Movie> rateCompare = new PriorityQueue<Movie>(1, new RatingComparator());
    PriorityQueue<Movie> viewsCompare = new PriorityQueue<Movie>(1, new StudentsSawComparator());
    PriorityQueue<Movie> idCompare = new PriorityQueue<Movie>(1, new DistributionComparator());
    
    //Loop to read File
    while (scan.hasNextLine()) {
        //Read from file
        int ID = scan.nextInt();
        int seen = scan.nextInt();
        float rating = scan.nextFloat();
        String title = scan.next();
        int year = scan.nextInt();

        //Load Queues with values
        Movie adder = new Movie(ID, seen, rating, title, year);
        yearCompare.add(adder);
        rateCompare.add(adder);
        viewsCompare.add(adder);
        idCompare.add(adder);
    }

    //Display Prompt
    System.out.println("Choose your sorting parameters, " + "\n" + "1 to sort by Year" + "\n" + "2 to sort by Average Rating" + "\n" +
    "3 to sort by Viewers" + "\n" + "4 to sort by Numeric Score" + "\n" + "0 to Exit");
       //Exit flag
       boolean flag = false;
       //Loop to choose display
       while (!flag) {
            System.out.print("Sorting Parameter: ");
            //Select Parameter
            selection = input.nextInt();
            //By Year
            if (selection == 1) {
               print(yearCompare);
            }
            //By Average Raing
            else if (selection == 2) {
                print(rateCompare);
            }
            //By Viewers
            else if (selection == 3) {
                print(viewsCompare);
            }
            //By Numeric Score
            else if (selection == 4) {
                print(idCompare);
            }
            //Exit
            else if (selection == 0) {
                flag = true;
            }
            //Incorrect input
            else {
                System.out.println("Input not recognized. Try again, only numerals 0 through 4 are recognized");
            }
       }
    
    
    //Close Scanners
    scan.close();
    input.close();
    }
    
    //Print Method
    private static void print(PriorityQueue<Movie> e) {
        //Copy Queue so .poll doesn't delete it
        PriorityQueue<Movie> queueCopy = new PriorityQueue<>(e);
        System.out.printf("| %25s  |  %2s  |  %7s  |  %8s | %1s %n", "Title" , "Year" , "Rating" , "Viewers", "Numeric Score");
        while (!queueCopy.isEmpty()) {
            Movie m = queueCopy.poll();
            System.out.printf("| %25s  |  %2s  |  %7s  |  %8s | %1s %n", m.getMovieName() , m.getRelYear() , m.getAvgRating() , m.getNumberSeen(), m.getSerialDistributionID());
        }
    }

}



