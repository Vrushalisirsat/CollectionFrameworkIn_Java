import java.util.ArrayList;
import java.util.*;
class arrayList
{
    public static void main(String args[])
    {
        // Syntax of arraylist
        ArrayList<Integer> list = new ArrayList<>();      // craete a empty arraylist

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(55);                  //add 55 at the end of list
        System.out.println(list);
       
        list.add(1,66);                //this will add 66 at index 1
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList();       //creating new list
        newList.add(120);
        newList.add(130);
        list.addAll(newList);        //this will add all the elements from the list to newList
        System.out.println(list);
        
        System.out.println(list.get(3));   // for get the element from the list

        list.remove(0);              // this will remove the element at particular position
        System.out.println(list);

        list.remove(Integer.valueOf(55));            //This will remove particular element
        System.out.println(list);

        list.clear();                  //It will remove all the elements from the arrayList
        System.out.println(list);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.set(0,99);
        System.out.println(list);

        System.out.println(list.contains(3));
        
        //Iterator arrayList
        // For - Loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        // For Each Loop
        for(Integer element:list)
        {
            System.out.println(element);
        }

        Iterator<Integer> it =list.iterator(); 
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        

    }
}