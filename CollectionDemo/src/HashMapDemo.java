import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map=new HashMap<>();

        map.put(20, "Kanchan");
        map.put(40, "Sumit");
        map.put(30, "Virat");
        map.put(10, "Karpe");

        System.out.println("Before sorting:- "+map);
        TreeMap<Integer, String> treeMap=new TreeMap<>(map);
        System.out.println("After Sorting:- "+treeMap);
    }
}
