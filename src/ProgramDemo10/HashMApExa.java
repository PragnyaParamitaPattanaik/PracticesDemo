package ProgramDemo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMApExa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> map=new HashMap<>(n);
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            Integer phone=sc.nextInt();
            sc.nextLine();
            map.put(name,phone);
        }
        while(sc.hasNext())
        {
            String query=sc.nextLine().trim();
            if(map.containsKey(query))
            {
                System.out.println(query + "=" + map.get(query));
            }
            else
            {
                System.out.println("Not found");
            }

        }

    }
}
