import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class MovieReviewsTest {
    @Test
    void testConstructor() throws FileNotFoundException {
        MovieReviews mV = new MovieReviews("MovieFile.txt");
        assertEquals(4,mV.getReviewerCount());
        assertEquals(3, mV.getMovieCount());
        assertEquals(8, mV.getRawReview(1, 2));
    }
}