/*
 *  @ Danile Rakovský
 */
package occurrencecounter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class OccurrenceCounter {
    
    // Method for scaning input by user.
    public static String scan(){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String sample = input.nextLine();
        input.close();
        return sample;
    }
    // Method that takes sample and converts it to Array and than count 
    public static HashMap<Character, Integer> count( String sample){
        //String sample = "java is really fun! I love coding!";
        
        // Adding char via toCharArray()
        char [] charArr = sample.toCharArray();
        
        // Hashmap
        HashMap<Character, Integer> charactersMap = new HashMap<>();
        
        for(char c : charArr){
            if (!charactersMap.containsKey(c)){
                charactersMap.put(c, 1);
            } else {
                charactersMap.put(c, (charactersMap.get(c)+1));
            }
        }
        System.out.println(charactersMap);
        return charactersMap;
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
    count(scan());
    
    // Idk how to wait in console so I just call .wait on object to keep it open.
    System.out.println("Close window to exit program.");
    OccurrenceCounter o = new OccurrenceCounter();
    synchronized (o) {
        o.wait();
    }
    }
    
}
