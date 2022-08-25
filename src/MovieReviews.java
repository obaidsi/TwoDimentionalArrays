import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class MovieReviews {
   private int[][] rawReviews;
   private int[][] rankedReviews;
   private String[] movieTitles;
   private String[] reviewers;
   private double[] avgRank;
   private int reviewersCount;
   private int movieCount;

   public MovieReviews(String fileName) throws FileNotFoundException{
       readReviews(fileName);
       generateRankings();


   }

   public int getReviewerCount(){
       return reviewersCount;
   }
   public int getMovieCount(){
       return movieCount;
   }
   public int getRawReview(int reviewerIdx, int movieIdx){
       return rawReviews[reviewerIdx][movieIdx];
   }
   public int getRankedReview(int reviewerIdx, int movieIdx){
       return 1; // to be fixed
   }
   public String getMovieTitle(int movieIdx){
       return movieTitles[movieIdx]; // to be fixed
   }
   public String getReviewer(int movieIdx){
       return "John"; // to be fixed
   }
   public double getAvgRank(int movieIdx){
       return 0.1; // to be fixed
   }
   public void displayRawReview(){
       System.out.println("Raw Reviews");
   }
   public void displayRankedReviews(){
       System.out.println(Arrays.deepToString(rankedReviews));
   }
   public void displayRankedMovies(){
       System.out.println("Ranked Movies");
   }

   private void readReviews(String fileName) throws FileNotFoundException {
       File inFile = new File(fileName);
       Scanner sc = new Scanner(inFile);
       reviewersCount = sc.nextInt();
       movieCount = sc.nextInt();
       sc.nextLine();
       rawReviews =  new int[reviewersCount][movieCount];
       for (int reviewers =0; reviewers<reviewersCount; reviewers++){
               String[] lineDate = sc.nextLine().split(" ");
               for ( int movies=0; movies<movieCount; movies++){
                   rawReviews[reviewers][movies] = Integer.parseInt(lineDate[movies]);
           }
       }
       movieTitles = new String[movieCount];
       for (int movie=0; movie<movieCount; movie++){
           movieTitles[movie] = sc.nextLine();
       }
   }
    private void generateRankings() {
        rankedReviews = new int[rawReviews.length][rawReviews[0].length];
        for (int row = 0; row < rawReviews.length; row++) {
            int swapCount = 0;
            int largest = 11;
            int rank = 1;
            while(swapCount != rawReviews[0].length) {
                int curentLargest = -1;
                for (int col = 0; col < rawReviews[0].length; col++) {
                    if (rawReviews[row][col] > curentLargest && rawReviews[row][col] < largest) {
                        curentLargest = rawReviews[row][col];
                    }
                }
                for (int col = 0; col < rawReviews[0].length; col++) {
                    if (rawReviews[row][col] == curentLargest) {
                        swapCount++;
                        rankedReviews[row][col] = rank;
                    }
                }
                rank++;
                largest = curentLargest;
            }
        }
    }
   private void calAvgRanking(){

   }
   private void displayReviews(int[][] whichArray){

   }

   public void sortByRanking(){
   }
}

