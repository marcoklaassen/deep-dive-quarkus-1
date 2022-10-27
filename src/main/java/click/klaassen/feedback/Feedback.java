package click.klaassen.feedback;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Feedback extends PanacheEntity {
    public Integer rating;
    public String comment;

}
