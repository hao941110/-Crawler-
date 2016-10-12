import java.util.LinkedList;

public class Queue {
	//使用链表实现队列
	private LinkedList<String> queue = new LinkedList<>();
	//入队列
	public void enQueue(String t){
		queue.addLast(t);
	}
	//出队列
	public String deQueue() {
		return queue.removeFirst();
	}
	//判断队列是否为空
	public boolean isQueueEmpty() {
		return queue.isEmpty();
	}
	//判断队列是否包含t
	public boolean contains(Object t) {
		return queue.contains(t);
	}
}
