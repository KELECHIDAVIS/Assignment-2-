import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> watches ;
    public Movie() {}

    public void addWatch(Watch watch){
        if(watches == null){
            watches = new ArrayList<>();
        }
        watches.add(watch);
    }

    public List<Person> getPersons(){
        List<Person> persons = new ArrayList<>();
        for(Watch watch : watches){
            persons.add(watch.getPerson());
        }
        return persons;
    }
}
