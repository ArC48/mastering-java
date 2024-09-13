package lecture4.examples.collection.set;

import lecture4.examples.collection.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Person levan = new Person("Levan", 28);
        Person alex = new Person("alex", 23);
        Person davit = new Person("davit", 25);

        //HashSet, order is not preserved
        Set<Person> hashSet = new HashSet<>();
        hashSet.add(levan);
        hashSet.add(levan);
        hashSet.add(alex);
        hashSet.add(davit);

        hashSet.remove(levan);

        //Hash set does not preserve order
        for (Person person : hashSet) {
            System.out.println(person);
        }

        //Constant time operation. O(1)
        System.out.println(hashSet.contains(davit));

        System.out.println();

        //LinkedHashSet
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(levan);
        linkedHashSet.add(alex);
        linkedHashSet.add(davit);

        for (Person person : linkedHashSet) {
            System.out.println(person);
        }

        System.out.println();

        //TreeSet
        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(levan);
        treeSet.add(alex);
        treeSet.add(davit);

        //order according to comperable
        for (Person person : treeSet) {
            System.out.println(person);
        }

        //Logarithmic time O(log N)
        System.out.println(treeSet.contains(davit));
    }
}
