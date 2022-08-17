import java.io.FileNotFoundException;
import java.io.File;
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
       return "Title"; // to be fixed
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
       System.out.println("Ranked Reviews");
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
   }
   private void generateRankings(){

   }
   private void calAvgRanking(){

   }
   private void displayReviews(int[][] whichArray){

   }

   public void sortByRanking(){

   }
}

