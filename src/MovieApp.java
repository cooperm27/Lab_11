
import java.util.Scanner;


public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean playAgain = true;
		
		Movie movie1 = new Movie ("Kramer vs Kramer", "drama");
		Movie movie2 = new Movie ("Gone With the Wind", "drama");
		Movie movie3 = new Movie ("Toy Story", "animated");
		Movie movie4 = new Movie ("Finding Nemo", "animated");
		Movie movie5 = new Movie ("The Hills Have Eyes", "horror");
		Movie movie6 = new Movie ("Gigli", "horror");
		Movie movie7 = new Movie ("Aladdin", "animated");
		Movie movie8 = new Movie ("Soldier", "scifi");
		Movie movie9 = new Movie ("Avatar", "scifi");
		Movie movie10 = new Movie ("The Last Airbender", "scifi");
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are 10 movies in this list");
		System.out.println("You can choose: drama, horror, animated, or scifi");
		
	do {		
		System.out.println("What category are you interested in?");
		String entry = scnr.nextLine();
		String categoryChoice = entry.toLowerCase();
		
		for (int i = 0; i < Movie.categoryList.size(); i++) {
			if (Movie.categoryList.get(i).contentEquals(categoryChoice)) {
				System.out.println(Movie.titleList.get(i));
			}
			}
			if (!Movie.categoryList.contains(categoryChoice)) {
					System.out.println("Sorry, that is not a valid category");
			} playAgain = Validator.playAgain(scnr, "Are you interested in any other categories? (Yes or No)");
	
		}while (playAgain);
			System.out.println("Then go read a book, nerd");
	}
		
}	
		
	
	


