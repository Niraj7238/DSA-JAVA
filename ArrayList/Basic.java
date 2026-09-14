
import java.util.ArrayList;


public class Basic{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        //  add operation-------->  0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); 

        list.add(1,15);

        System.out.println(list);

        // get operation----> 0(1)
        int element = list.get(2);
        System.out.println(element);


        // delete operation ----------->0(n)
        list.remove(2);
        System.out.println(list);


        //  set element at index ---->0(n)
        list.set(1, 10);
        System.out.println(list);


        //  cotains 
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        // size 
        System.out.println(list.size());

        // print the arrayList
        for(int i=0; i<list.size(); i++){
            System.out.print (list.get(i) + " ");
        }
        System.out.println();




    }
}