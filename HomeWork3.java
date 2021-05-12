import java.util.HashMap;

public class HomeWork3 {
    public static void main(String[] args) {
        fruit();
        phoneDirectory();

    }
    private static void fruit(){
        String[] arr = new String[]{"apple","banana","cherry","pear","cherry","apple","apricot","strawberry","plum","apricot"};
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        System.out.println(hm);

    }

    private static void phoneDirectory(){
        Directory directory = new Directory();
        directory.add("Ivanov", 659816);
        directory.add("Smirnov", 874563);
        directory.add("Popov", 123684);
        directory.add("Ivanov", 452387);
        directory.add("Kozlov", 785216);
        directory.add("Popov", 455651);

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Kozlov"));
        System.out.println(directory.get("Smirnov"));
    }
}
