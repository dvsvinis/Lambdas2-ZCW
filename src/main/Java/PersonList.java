import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonList {

    public  ArrayList<String> checkWithPredicate(List<Person> personList, CheckPerson toCompare){
        ArrayList<String> result = new ArrayList<>();
        personList.forEach(person -> {if (toCompare.test(person)) result.add(person.printAge());});

        return result;
    }

    class Tester implements CheckPerson{

        Predicate predicate;

        Tester(Predicate predicate){
            this.predicate = predicate;
        }

        public boolean test(Person p){
            return predicate.test(p);
        }
    }

}
