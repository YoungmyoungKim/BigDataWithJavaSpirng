package ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue que=new LinkedList();
		//������ �Է� : offer
		que.offer(new Integer(10));
		que.offer(new Float(10.5));
		
		//AutoBoxing
		que.offer(true);
		que.offer(10.0);
		
		//���� ���� ���� ���� (FIFO)
		//���� ���� ���� �� ��ü ������ poll
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}
