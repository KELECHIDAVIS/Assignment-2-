import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Watch> watches;
    public Person() {

    }
    public void addWatch(Watch watch){
        if(watches == null){
            watches = new ArrayList<>();
        }
        watches.add(watch);
    }
    public List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();

        for(Watch watch : watches){
            movies.add(watch.getMovie());
        }
        return movies;
    }

}
