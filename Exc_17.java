package Exc_17;

import java.util.HashMap;
import java.util.Map;

public class Exc_17
{
    public static void main(String[] args)
    {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map1.put("Martin","1234");
        map1.put("Shit","234");
        map2.put("Erik","789");
        map2.put("Martin","123");
        map2.put("Shit","234");
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(subMap(map1,map2));
    }

    public static boolean subMap(Map<String,String> map1, Map<String,String> map2)
    {
        if(map2.entrySet().containsAll(map1.entrySet()))
        {
            return true;
        }
        return false;
    }

}
