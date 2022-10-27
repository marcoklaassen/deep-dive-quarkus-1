package click.klaassen.feedback;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/feedback")
public class FeedbackResource {
    @Inject
    FeedbackRepository feedbackRepository;

    @GET
    public List<Feedback> list() {
        return feedbackRepository.listAll();
    }

    @POST
    @Transactional
    public List<Feedback> add(Feedback feedback) {
        feedbackRepository.persist(feedback);
        return feedbackRepository.listAll();
    }

    @DELETE
    public List<Feedback> delete(Feedback feedback) {
        feedbackRepository.delete(feedback);
        return feedbackRepository.listAll();
    }
}
