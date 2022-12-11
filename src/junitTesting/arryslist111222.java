package junitTesting;

import java.util.ArrayList;

public class arryslist111222 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(8);
        System.out.println(list);
        System.out.println("first element in list ="+list.get(0));
        System.out.println("size="+list.size());
        for(int  i =0 ; i<list.size(); i++)
        {
            if(i<list.size()-1)
                 System.out.print(list.get(i)+" - ");
            else System.out.print(list.get(i));

        }
        System.out.println();
        System.out.println("loop style num2");
        for (int  s : list)
        {

            System.out.print(s+" -- ");
        }
        System.out.println();

        System.out.println(list.set(0,222));

        System.out.println(list);
        list.remove(0);
        System.out.println("removing  element index 0="+list);
        System.out.println("if  list empty ="+list.isEmpty());
        list.clear();
        System.out.println("list  after  clear ="+list);
        ArrayList<person> contacts = new ArrayList<person>();
        contacts.add(new person("Avi",523333));
        contacts.add(new person("Eva",5677777));
        contacts.add(new person("Nikolya",5899999));
        System.out.println(contacts);
        for (person p : contacts)
        {
            System.out.println(p.getName());
        }
        for (int i =0; i<contacts.size();i++)
        {
            System.out.println(contacts.get(i).getPhone_num());
        }

    }
}
