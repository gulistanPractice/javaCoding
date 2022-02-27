package coding;

import java.util.*;

public class Hobbies {



    private final HashMap<String, String[]> hobbies = new HashMap<>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    //Implement method that returns a list of names of people
    // with the selected hobby in any order
    public List<String> findAllHobbyists(String hobby) {
        LinkedList<String> finalList = new LinkedList<>();

        Set<Map.Entry<String, String[]>> entries = hobbies.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            if (isPresent(entry.getValue(), hobby))
                finalList.add(entry.getKey());
        }
        return finalList;
    }

    private boolean isPresent(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic");
        hobbies.add("Chad",  "Pets", "Yoga");


        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }




}
