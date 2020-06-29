import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo
{
    public void hashSet()
    {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(null);
        hashSet.add(9);
        hashSet.add(67);
        hashSet.add(1);
        hashSet.add(12);
        hashSet.add(16);
        hashSet.add(5);
        // It follows random order of insertion and does no allow duplicate values.
        System.out.println(hashSet);
        System.out.println("Size of set = " + hashSet.size());
        System.out.println("Is the set empty?  " + hashSet.isEmpty());
        System.out.println("Does the set contain 16?  " + hashSet.contains(16));
        hashSet.remove(5);
        System.out.println(hashSet);

        Set<Integer> hashSet1 = new HashSet<>();
        // Adds the element to the set.
        hashSet1.add(1);
        hashSet1.add(3);
        hashSet1.add(7);
        hashSet1.add(null);
        hashSet1.add(9);
        hashSet1.add(67);
        hashSet1.add(1);
        hashSet1.add(12);
        hashSet1.add(16);
        hashSet1.add(5);
        // Removes that element from the set.
        hashSet1.remove(5);

        // Remember hashSet follows random order of insertion, so can you really check if two sets are equal??
        System.out.println("Does the hashSet1 equals hashSet = " + hashSet1.equals(hashSet));
    }
    public static void main (String[] args)
    {
        CollectionsDemo collections = new CollectionsDemo();
        collections.hashSet();

    }

}



