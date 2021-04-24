import java.io.*;
import java.util.*;

public class MovieHeap {
    
    public static void main(String[] args)throws IOException {
    //Create Priority Queue Heap
    PriorityQueue<Integer> pQueue_heap = new PriorityQueue<Integer>(Collections.reverseOrder());

    //Create File and Scanner
    File movies = new File("movies.txt");
    Scanner scan = new Scanner(movies);

    //Loop to read File
    while (scan.hasNextLine()) {
        int ID = scan.nextInt();
        int seen = scan.nextInt();
        int rating = scan.nextInt();
        String title = scan.next();
        int year = scan.nextInt();
    }

    }
}

