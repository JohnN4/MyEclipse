

import java.util.HashMap;
import java.util.Map;

public class DisneyService {

	// Hold a main character as a value mapped by a key of the movie name
	private Map<String, String> disneyCharacterMap = new HashMap<>();
	{
		disneyCharacterMap.put("Mulan","Mulan");
	}
	
	public String getCharacter(String movie) {
		System.out.println(movie);
		return disneyCharacterMap.getOrDefault(movie, "Unknown");
	}
	
	public void setCharacter(String movie, String character) {
		disneyCharacterMap.put(movie, character);
	}
}