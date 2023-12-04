package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {

	public static void main(String[] args) {
		Queue<Integer> queue1=new PriorityQueue<>();
		queue1.offer(1);
		queue1.offer(2);
		queue1.offer(5);
		queue1.offer(3);
		System.out.println("Queue1 : "+queue1);
		int Frontelement=queue1.peek();
		System.out.println("Front Element :"+Frontelement);
		System.out.println(queue1);
		
		int dequeueelement=queue1.poll();
			//System.out.println("Dequeue Element : "+dequeueelement);
			System.out.println(queue1);

		
		queue1.remove();
		System.out.println("Queue1 after Remove : "+queue1);//First in First out
		
		queue1.clear();
		System.out.println(queue1);
		//int Frontelements=queue1.peek();
		
		queue1.offer(1);
		queue1.offer(2);
		queue1.offer(3);
		int dequeueelements=queue1.poll();
		System.out.println(dequeueelements);
		int Frontelements=queue1.peek();
		System.out.println("Front Element :"+Frontelements);
				System.out.println(queue1);
		
		
		//Queue<Integer> queue2=new PriorityQueue<>();
		//queue2.offer(2);
		//queue2.offer(11);
		//queue2.offer(11);
		//queue2.offer(11);
		//System.out.println("Queue2 : "+queue2);
		
		
		
		
		
		
		
	}

}
