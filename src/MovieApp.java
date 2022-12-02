import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		
		List<Movie> movies = new ArrayList<> ();
		movies.add(new Movie("Moana ", "Animated"));
		movies.add(new Movie("Disturbia", "Horror"));
		movies.add(new Movie("Encanto", "Animated"));
		movies.add(new Movie("IT", "Horror"));
		movies.add(new Movie("Brave", "Animated"));
		movies.add(new Movie("The Hunger Games", "Scifi"));
		movies.add(new Movie("A Star is Born", "Drama"));
		movies.add(new Movie("The Grinch", "Animated"));
		movies.add(new Movie("Where the Crawdads Sing", "Drama"));
		movies.add(new Movie("Divergent", "Scifi"));
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this list.");
		
		String con = "y";
	
		while(con.equalsIgnoreCase("y")) {	
		System.out.println("Which movie category are you interested in?");
		String choice = scnr.next();
		for (Movie thisMovie : movies) {
		     if(choice.equalsIgnoreCase(thisMovie.category)) {
		         System.out.println(thisMovie.title);
		     }
		     
		}
			  System.out.print("Continue? y/n  ");
			  String ch;
			  ch = scnr.next();
			  if (ch.equals("n")) {
				  con = "n";
			  }
			}
		
		
	}
	
}
		
	
	
