package collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Queue<Integer> myQ = new PriorityQueue<Integer>();

		myQ.add(9);
		myQ.add(6);
		myQ.add(3);
		myQ.add(5);
		System.out.println(myQ);
		System.out.println(myQ.poll());
		System.out.println(myQ.poll());
		System.out.println(myQ.poll());
//		System.out.println(myQ.peek());
//		System.out.println(myQ.peek());
//		System.out.println(myQ.peek());
		System.out.println(myQ);
		myQ.offer(9);
		myQ.offer(4);
		System.out.println(myQ.poll());
		System.out.println(myQ.poll());
		System.out.println(myQ);
		System.out.println(myQ.poll());
		System.out.println(myQ.poll());
	}

}
