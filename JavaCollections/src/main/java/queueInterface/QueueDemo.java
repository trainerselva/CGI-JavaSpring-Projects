package queueInterface;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<String>();
		
		// Add elements
		queue.add("Task2");
		queue.add("Task1");
		queue.add("Task3");
		queue.add("Task1");
		
		// Process elements
		while (!queue.isEmpty()) {
			System.out.println("Processing: " + queue.poll());
		}
		
		Queue<String> jobs = new PriorityQueue<String>();
		
		// Add elements
		jobs.add("Job2");
		jobs.add("Job1");
		jobs.add("Job3");
		jobs.add("Job2");
		
		while (!jobs.isEmpty()) {
			System.out.println("Processing job: " + jobs.poll());
		}
		

		Task t1 = new Task("First task", 3);
		Task t2 = new Task("Second task", 5);
		Task t3 = new Task("Third task", 2);
		
		Comparator<Task> comparator = (task1, task2) -> task1.compare(task1, task2);
		
		Queue<Task> tasks = new PriorityQueue<QueueDemo.Task>(comparator);
		tasks.add(t1);
		tasks.add(t2);
		tasks.add(t3);
		while(!tasks.isEmpty()) {
			System.out.println("Performing: " + tasks.poll());
		}
	}
	
	public static class Task implements Comparator<Task> {
		private String description;
		private int priority;
		
		public Task(String description, int priority) {
			super();
			this.description = description;
			this.priority = priority;
		}

		public String getDescription() {
			return description;
		}

		public int getPriority() {
			return priority;
		}

		@Override
		public String toString() {
			return "Task [description=" + description + ", priority=" + priority + "]";
		}

		@Override
		public int compare(Task t1, Task t2) {
			// TODO Auto-generated method stub
			if (t1.getPriority() > t2.getPriority()) {
				return -1;
			}
			if (t1.getPriority() < t2.getPriority()) {
				return 1;
			}
			return 0;
		}
		
		
	}

}
