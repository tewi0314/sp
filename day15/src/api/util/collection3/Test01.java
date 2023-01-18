package api.util.collection3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		//Queue vs Stack
		//-사용법이 정해져 있는 Collection
		//-Queue는 FIFO(first in first out) 형태의 저장소
		//-Stack은 LIFO(Last in Frist out) 형태의 저장소
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
