package ch01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue que=new LinkedList();
		//������ �Է� : offer
		que.offer("HGD");
		que.offer("IJM");
		que.offer("HGD");
		que.offer("IKJ");
		
		//���� ���� ���� ���� (FIFO)
		//���� ���� ���� �� ��ü ������ poll
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}
