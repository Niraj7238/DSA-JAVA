package ARRAY;

public class LinearSearch2 {
    public static int search(String items[],String key){
        for (int i=0; i<items.length;i++){
            if(items[i].equals(key)){ // ==  => .equals
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String items[] = {"dosa", "chay","samosa","cold_drink"};
        String key = "cold_drink";
        int index = search(items,key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key at index : "+ index);
        }
    }
}
