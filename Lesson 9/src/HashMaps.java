import java.util.HashMap;

public class HashMaps {
  public static void main(String[] args) {
    HashMap<String, String> dandClass = new HashMap<String, String>();
    dandClass.put("Bard", "Charisma");
    dandClass.put("Cleric", "Wisdom");
    dandClass.put("Paladin", "Strength");
    dandClass.put("Rogue", "Dexterity");
    dandClass.put("Wizard", "Intelligence");
    System.out.println("D&D Classes and Strengths" + dandClass); 
    System.out.println(dandClass.size());
  }
}
