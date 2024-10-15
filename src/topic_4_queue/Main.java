package topic_4_queue;

public class Main {

    public static void main(String[] args) {

        Queue customerQueue = new Queue();
        
        // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Kent Coming"));
	     customerQueue.enqueue(new Customer("Dexter Saldivar"));
	     customerQueue.enqueue(new Customer("Joshua Gabitano"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


    }
}
