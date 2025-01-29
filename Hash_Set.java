import java.util.HashSet;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(9);
        set.add(1);
        set.add(7);
        set.add(5);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        // if we want to search in this Hash Set so that we use of Contains;
        if(set.contains(5)){
            System.out.println("Yes this number is contains in this set");
        }
         
    }
}