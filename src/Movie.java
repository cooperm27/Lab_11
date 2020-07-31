import java.util.ArrayList;

public class Movie {
	
	private String title;
	private String category;
	
	static ArrayList<String> titleList = new ArrayList<>();
	static ArrayList<String> categoryList = new ArrayList<>();

	public Movie(String title, String category) {
		this.title = title; titleList.add(title);
		this.category = category;categoryList.add(category);
	}
	 public Movie() {
		 
	 }

	public String getCategory() {
	return category;
	
	} 
	public String getTitle() {
		return title;
		
		} 
	
	 public String toString() {

			return "Full Movie List[Title: " + title + "]" + "Category" + category + "]";
		}
}
