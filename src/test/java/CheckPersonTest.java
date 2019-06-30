import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import static org.junit.Assert.*;

public class CheckPersonTest {

    @org.junit.Test
    public void test1() {
    }


    // Utility method to create list
    private static List<Person> createList() {
        List<Person> tempList = new ArrayList<Person>();
        Person p1 = new Person("Mickey Mouse", LocalDate.of(2006,11,20), Person.Sex.MALE, "mmouse@disney.com");
        Person p2 = new Person("Daffy Duck", LocalDate.of(2016,05,03), Person.Sex.MALE, "theDuck@disney.com");
        Person p3 = new Person("Minnie Mouse", LocalDate.of(2010,06,10), Person.Sex.FEMALE, "minmouse@disney.com");
        Person p4 = new Person("Walt Disney",  LocalDate.of(1950,12,11), Person.Sex.MALE, "walt@disney.com");
        tempList.add(p1);
        tempList.add(p2);
        tempList.add(p3);
        tempList.add(p4);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }


//
//    // comparator implementation as anonymous class
//    // and sorting the list element on the basis of first name
//        Collections.sort(personList, new Comparator<Person>() {
//        public int compare(Person a, Person b) {
//            return a.getName().compareTo(b.getName());
//        }
//    });
//
//        System.out.println("Sorted list with anonymous implementation");
//        for (Person p : personList) {
//        System.out.print(p.getName() + " ");
//    }
//
//    // creating the same list again to use with lambda expression
//    personList = createList();
//    // Providing the comparator functional interface compare
//    /// method as lambda exression
//        Collections.sort(personList, (Person a, Person b) ->
//            a.getName().compareTo(b.getName()));
//        System.out.println("Sorted list with lambda implementation");
//    // Using the new ForEach loop of Java 8
//    // used with lambda expression
//        personList.forEach((p) -> System.out.print(p.getName() + " "));
//}



}