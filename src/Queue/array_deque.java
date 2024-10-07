package Queue;
import java.util.ArrayDeque;
public class array_deque {

	    public static void main(String[] args) {
	        
	        ArrayDeque<Integer> deque = new ArrayDeque<>();

	        deque.add(10);
	        deque.add(20);
	        deque.add(30);

	        deque.addFirst(5);
	        deque.addFirst(1);

	        deque.addLast(40);
	        deque.addLast(50);

	        System.out.println("Deque elements:");

	        for (Integer element : deque) {
	            System.out.println(element);
	        }

	        System.out.println("\nFirst element removed: " + deque.removeFirst());
	        System.out.println("Last element removed: " + deque.removeLast());

	        System.out.println("\nDeque after removal:");
	        for (Integer element : deque) {
	            System.out.println(element);
	        }
	    }
	}
