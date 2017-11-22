import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Chores {

	public static void main(String[] args) {
		
		Queue <String> chores = new ArrayDeque<String>();
		chores.add("Throw out the garbage.");
		chores.add("Fix a chair in the dining room");
		chores.add("Repair the radio");
		
		do {
		System.out.println("Choose :  \"add\" for adding a task to the list or \"get\" for showing a task from the list.");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		
		if (choice.equals("add")) {
			System.out.println("Add a task to my chore list: ");
			Scanner scanner2 = new Scanner(System.in);
			String chore1 = scanner.nextLine();
			chores.add(chore1);
		} else if (choice.equals("get")) {
			System.out.println(chores.poll());
		} else {
			System.out.println("Ups. Type \"add\" or \"get\" for further instructions");
		}
		
		} while (chores.isEmpty() != true); 
		
		System.out.println("It's your last chore. Congratulations!");
		
		
		
		
	}

}
