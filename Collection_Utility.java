package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<Character>chars=new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','T','P','V','A'));

        System.out.println(chars);

        Collections.sort(chars);

        System.out.println(chars);

        ArrayList<String>students=new ArrayList<>();
        students.addAll(Arrays.asList("Hakki","Nesibe","Virginia","ZEliha","Aliye"));

        Collections.swap(students,1,4);
        Collections.swap(students,4,1);

       Collections.swap(students,0,2);

        System.out.println(students);

        ArrayList<String>items=new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","Coffee","Egg","Battery","Battery","Battery"));

        int count=Collections.frequency(items,"Battery");

        System.out.println(count);

        ArrayList<String> unique=new ArrayList<>();

        for(String each:items){
            int i =Collections.frequency(items,each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        ArrayList<String> unique2=new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p->Collections.frequency(unique2,p)>1);
        System.out.println(unique2);

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(12,34,5,6,7,89,6,5,-98,65,345));

        Integer max=Collections.max(list);
        Integer min=Collections.min(list);

        System.out.println("max: "+max);
        System.out.println("min: "+min);

        Collections.replaceAll(list,7,765);
        System.out.println(list);







    }
}
