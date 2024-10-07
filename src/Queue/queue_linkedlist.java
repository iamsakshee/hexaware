package Queue;
import java.util.LinkedList;
	import java.util.Queue;
public class queue_linkedlist {
	
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        queue.add("Customer 1: Sakshi");
	        queue.add("Customer 2: Chandni");
	        queue.add("Customer 3: Reese");
	        queue.add("Customer 4: Anushka");

	        System.out.println("First customer in queue: " + queue.peek());

	        System.out.println("Serving customer: " + queue.poll());

	        System.out.println("Queue after serving one customer:");
	        for (String customer : queue) {
	            System.out.println(customer);
	        }
	    }
	}

