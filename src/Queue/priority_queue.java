package Queue;
import java.util.PriorityQueue;

public class priority_queue {

	    public static void main(String[] args) {
	 
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
  
	        pq.add(40);
	        pq.add(10);
	        pq.add(30);
	        pq.add(20);
	  
	        System.out.println("PriorityQueue elements in order:");
	        
	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
	    }
	}
