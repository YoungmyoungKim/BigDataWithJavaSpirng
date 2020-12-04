package ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue que=new LinkedList();
		//데이터 입력 : offer
		que.offer(new Integer(10));
		que.offer(new Float(10.5));
		
		//AutoBoxing
		que.offer(true);
		que.offer(10.0);
		
		//먼저 들어간게 먼저 나옴 (FIFO)
		//제일 먼저 저장 된 객체 빼내기 poll
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}
