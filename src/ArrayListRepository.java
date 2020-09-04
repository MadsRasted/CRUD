import java.util.ArrayList;
import java.util.List;

public class ArrayListRepository implements ICrud<Person> {

    private List<Person> list;

    public ArrayListRepository(){
        list = new ArrayList<>();
    }
    @Override
    public void create(Person person) {
        list.add(person);
    }

    @Override
    public Person read(int index) {
        return list.get(index);

/*
        for(String p : list ){
        }
 */
    }

    @Override
    public void update(Person person, int index) {
        list.remove(index);
        list.add(index, person);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

}
