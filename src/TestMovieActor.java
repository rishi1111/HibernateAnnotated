
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.movieactor.Actor;
import lti.movieactor.Movie;
import lti.util.HibernateUtil;

public class TestMovieActor {

	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		

		Movie movie = new Movie();
		movie.setTitle("Harry Potter 1 ");
		movie.setGenre("Fiction");
		Actor act1 = new Actor("Johnny", movie);
		Actor act2 = new Actor("MaryAnne", movie);

		
		Set<Actor> actors = new HashSet<>();
		actors.add(act1);
		actors.add(act2);

		movie.setActors(actors);

		session.save(movie);
		txn.commit();

	}

}
