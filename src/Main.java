import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MovieReviews mV = new MovieReviews("MovieFile.txt");
        mV.displayRankedReviews();
    }
}
