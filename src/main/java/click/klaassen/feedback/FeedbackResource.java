package click.klaassen.feedback;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/feedback")
public class FeedbackResource {
    private Set<Feedback> feedback = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FeedbackResource() {
        feedback.add(new Feedback(10, "great session"));
        feedback.add(new Feedback(1, "buuuuuh"));
    }

    @GET
    public Set<Feedback> list() {
        return feedback;
    }

    @POST
    public Set<Feedback> add(Feedback feedback) {
        this.feedback.add(new Feedback(feedback.rating, feedback.comment));
        return this.feedback;
    }

    @DELETE
    public Set<Feedback> delete(Feedback feedback) {
        this.feedback.removeIf(existingFeedback -> existingFeedback.id.equals(feedback.id));
        return this.feedback;
    }
}
