package click.klaassen.feedback;

import java.util.Random;

public class Feedback {
    public Integer id;
    public Integer rating;
    public String comment;

    public Feedback(Integer rating, String comment) {
        this.id = new Random().nextInt();
        this.rating = rating;
        this.comment = comment;
    }
}
