import java.io.File;
import java.util.*;

public class MovieHeap {
    
    PriorityQueue<Integer> pQueue_heap = new PriorityQueue<Integer>(Collections.reverseOrder());

    File movies = new File("movies.txt");
	Scanner scan = new Scanner(movies);

}
