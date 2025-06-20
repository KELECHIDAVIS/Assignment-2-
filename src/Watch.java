public class Watch {
    private Person person;
    private Movie movie;
    private int rating;

    public Watch(Person person, Movie movie, int rating) {
        this.person = person;
        this.movie = movie;
        this.rating = rating;
        movie.addWatch(this);
        person.addWatch(this);

    }

    public Person getPerson() {
        return person;
    }


    public Movie getMovie() {
        return movie;
    }

}
