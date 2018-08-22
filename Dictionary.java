import java.util.Map;
import java.util.HashMap;

public class Dictionary
{
	public static void main(String args[])
	{
		Map<String,String> EnglishBanglaDictionary = new HashMap<String,String>();
		// putting keys and values for EnglishBanglaDictionary
		EnglishBanglaDictionary.put("Monday","SomBaar");
		EnglishBanglaDictionary.put("Tuesday","MongolBaar");
		EnglishBanglaDictionary.put("Wednesday","BudhBaar");
		EnglishBanglaDictionary.put("Thrusday","BerospatiBaar");
		EnglishBanglaDictionary.put("Friday","SukraBaar");
		EnglishBanglaDictionary.put("Saturday","SaniBaar");
		EnglishBanglaDictionary.put("Sunday","RaviBaar");
		// Size of EnglishBanglaDictionary
		System.out.println("Size of EnglishBanglaDictionary is "+EnglishBanglaDictionary.size());
		
		// Retrive Values by keys
		System.out.println(EnglishBanglaDictionary.get("Tuesday"));
		System.out.println(EnglishBanglaDictionary.get("Friday"));
		
		// retrive all keys = Values
		System.out.println(EnglishBanglaDictionary.toString());
		
		// retrive only key set(all keys)
		System.out.println(EnglishBanglaDictionary.keySet());
		// retrive only values
		System.out.println(EnglishBanglaDictionary.values());
		
		// remove sunday from EnglishBanglaDictionary
		EnglishBanglaDictionary.remove("Sunday");
		System.out.println(EnglishBanglaDictionary.toString());
		
		// replace the value of saturday from EnglishBanglaDictionary
		EnglishBanglaDictionary.replace("Saturday","ShaniBaaar");
		System.out.println(EnglishBanglaDictionary.toString());
		
		// checking EnglishBanglaDictionary is empty or not
		System.out.println(EnglishBanglaDictionary.isEmpty());
		
		// clear EnglishBanglaDictionary 
		EnglishBanglaDictionary.clear();
		System.out.println(EnglishBanglaDictionary.isEmpty());
		System.out.println(EnglishBanglaDictionary.toString());
	}
}