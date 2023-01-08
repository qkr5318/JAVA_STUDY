package source13.chapter13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// FIFO(선입선출) 자료구조형에 메시지를 저장 처리함
		messageQueue.offer(new Message("sendMail", "장나라"));
		messageQueue.offer(new Message("sendSMS", "김희선"));
		messageQueue.offer(new Message("sendKakaotalk", "이영자"));
		
		while (!messageQueue.isEmpty()) {  // messageQueue가 비어(isEmpty)있지 않다면(!)
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다!");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다!");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다!");
				break;
			}
		}
	}
}


