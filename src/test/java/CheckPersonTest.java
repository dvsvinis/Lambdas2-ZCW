import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;


import static org.junit.Assert.*;

public class CheckPersonTest {

    List<Person> tempList = new ArrayList<Person>();
    Person p1 = new Person("Mickey Mouse", LocalDate.of(2006,11,20), Person.Sex.MALE, "mmouse@disney.com");
    Person p2 = new Person("Daffy Duck", LocalDate.of(2016,05,03), Person.Sex.MALE, "theDuck@disney.com");
    Person p3 = new Person("Minnie Mouse", LocalDate.of(2010,06,10), Person.Sex.FEMALE, "minmouse@disney.com");
    Person p4 = new Person("Walt Disney",  LocalDate.of(1950,12,11), Person.Sex.MALE, "walt@disney.com");

    @Test
    public void checkWithPredicate1() {
        tempList.clear();
        Predicate<Person> predicate = person -> person.getAge() > 21;
        PersonList personList = new PersonList();

        tempList.add(p1);
        tempList.add(p2);
        tempList.add(p3);
        tempList.add(p4);

        CheckPerson tester = personList.new Tester(predicate);

        Integer expected = 1;
        Integer actual = personList.checkWithPredicate(tempList, tester).size();

        assertEquals(expected, actual);
    }

    @Test
    public void checkWithPredicate2(){
        tempList.clear();
        Predicate<Person> predicate = person -> person.getAge() < 21;
        PersonList personList = new PersonList();

        tempList.add(p1);
        tempList.add(p2);
        tempList.add(p3);
        tempList.add(p4);

        CheckPerson tester = personList.new Tester(predicate);

        Integer expected = 3;
        Integer actual = personList.checkWithPredicate(tempList, tester).size();

        assertEquals(expected, actual);
    }



}