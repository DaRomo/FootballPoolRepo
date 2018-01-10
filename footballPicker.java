public class footballPicker{

	//The input data
    public static String[][] picks = {{"Anne 1	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"UCF",	"Notre Dame",	"Georgia",	"Clemson",	"Rose"},
    {"Anne 2	","Utah St",	"Southern Cal",	"Mississippi St",	"Memphis",	"Penn St",	"Wisconsin",	"Michigan",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Sugar"},
    {"Craig 1	","New Mexico St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"South Carolina",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Sugar"},
    {"Craig 2	","New Mexico St",	"Ohio State",	"Mississippi St",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"UCF",	"LSU",	"Oklahoma",	"Clemson",	"Rose"},
    {"Ed 1	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Clemson",	"Sugar"},
    {"Ed 2	","Utah St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Clemson",	"Rose"},
    {"Graham 1	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"Auburn",	"LSU",	"Georgia",	"Clemson",	"Sugar"},
    {"Graham 2	","Utah St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"LSU",	"Georgia",	"Clemson",	"Rose"},
    {"Harris 1	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Sugar"},
    {"Harris 2	","New Mexico St",	"Ohio State",	"Mississippi St",	"Memphis",	"Washington",	"Wisconsin",	"Michigan",	"Auburn",	"LSU",	"Georgia",	"Alabama",	"Sugar"},
    {"Hayes 1	","New Mexico St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"South Carolina",	"UCF",	"LSU",	"Georgia",	"Alabama",	"Sugar"},
    {"Hayes 2	","New Mexico St",	"Southern Cal",	"Mississippi St",	"Iowa State",	"Washington",	"Wisconsin",	"South Carolina",	"UCF",	"LSU",	"Oklahoma",	"Clemson",	"Sugar"},
    {"John 1	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Penn St",	"Wisconsin",	"Michigan",	"UCF",	"LSU",	"Georgia",	"Clemson",	"Rose"},
    {"John 2	","New Mexico St",	"Southern Cal",	"Louisville",	"Memphis",	"Penn St",	"Wisconsin",	"Michigan",	"UCF",	"Notre Dame",	"Georgia",	"Alabama",	"Sugar"},
    {"Kieran 1	","New Mexico St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Miami",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Clemson",	"Sugar"},
    {"Kieran 2	","Utah St",	"Southern Cal",	"Mississippi St",	"Memphis",	"Washington",	"Wisconsin",	"South Carolina",	"UCF",	"LSU",	"Oklahoma",	"Alabama",	"Rose"},
    {"Kristin 1	","New Mexico St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Wisconsin",	"South Carolina",	"Auburn",	"LSU",	"Georgia",	"Alabama",	"Sugar"},
    {"Kristin 2	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Washington",	"Miami",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Sugar"},
    {"Leslie 1	","New Mexico St",	"Southern Cal",	"Mississippi St",	"Memphis",	"Penn St",	"Wisconsin",	"South Carolina",	"UCF",	"LSU",	"Georgia",	"Alabama",	"Rose"},
    {"Leslie 2	","Utah St",	"Southern Cal",	"Louisville",	"Memphis",	"Washington",	"Miami",	"South Carolina",	"Auburn",	"LSU",	"Georgia",	"Alabama",	"Sugar"},
    {"Lucas 1	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Washington",	"Wisconsin",	"South Carolina",	"UCF",	"LSU",	"Georgia",	"Clemson",	"Rose"},
    {"Lucas 2	","Utah St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Wisconsin",	"South Carolina",	"Auburn",	"LSU",	"Georgia",	"Alabama",	"Rose"},
    {"Matthew 1	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Rose"},
    {"Matthew 2	","Utah St",	"Ohio State",	"Mississippi St",	"Iowa State",	"Washington",	"Miami",	"Michigan",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Sugar"},
    {"Megan 1	","New Mexico St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Rose"},
    {"Megan 2	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Washington",	"Miami",	"South Carolina",	"UCF",	"LSU",	"Georgia",	"Alabama",	"Sugar"},
    {"Michelle 1	","New Mexico St",	"Ohio State",	"Louisville",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"LSU",	"Georgia",	"Alabama",	"Rose"},
    {"Michelle 2	","Utah St",	"Southern Cal",	"Mississippi St",	"Memphis",	"Washington",	"Miami",	"South Carolina",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Sugar"},
    {"Mike 1	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Washington",	"Wisconsin",	"Michigan",	"Auburn",	"LSU",	"Oklahoma",	"Clemson",	"Sugar"},
    {"Mike 2	","Utah St",	"Ohio State",	"Mississippi St",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"Auburn",	"LSU",	"Oklahoma",	"Clemson",	"Rose"},
    {"Natalie 1	","New Mexico St",	"Ohio State",	"Mississippi St",	"Iowa State",	"Washington",	"Wisconsin",	"South Carolina",	"Auburn",	"Notre Dame",	"Oklahoma",	"Alabama",	"Rose"},
    {"Natalie 2	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Miami",	"Michigan",	"UCF",	"LSU",	"Georgia",	"Clemson",	"Sugar"},
    {"Pete 1	","New Mexico St",	"Ohio State",	"Louisville",	"Iowa State",	"Washington",	"Wisconsin",	"Michigan",	"UCF",	"Notre Dame",	"Oklahoma",	"Clemson",	"Rose"},
    {"Pete 2	","Utah St",	"Ohio State",	"Louisville",	"Memphis",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Sugar"},
    {"Ray 1	","Utah St",	"Ohio State",	"Mississippi St",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Rose"},
    {"Ray 2	","Utah St",	"Ohio State",	"Mississippi St",	"Iowa State",	"Penn St",	"Wisconsin",	"Michigan",	"Auburn",	"Notre Dame",	"Georgia",	"Alabama",	"Rose"}};

	//true if player is still in, false if out
	public static boolean[] stillIn = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};

	//the score of each player
	public static int[] score = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

	//the current game winners
    public static String[] gameWinners = {"New Mexico St","Ohio State","Mississippi St","Iowa State","Penn St","Wisconsin","South Carolina","UCF","Notre Dame","Georgia","Alabama","Sugar"};

	public static int gamesPlayed;
	public static int gamesLeft;
	public static int numberOfPlayers;

	String leftAlignFormat = "| %-15s | %-4d |%n";

	public static void main(String[] args){
		gamesPlayed = gameWinners.length;

		gamesLeft = (picks[0].length - 1) - gamesPlayed;

		calculateScore();

		int high = findHighest();

		//tooLow(high);
		pickComparison();
		//printRemaingPlayers();
        printScores();
	}
    
    public static void printScores(){
        for(int i = 0; i < picks.length; i++)
        {
            System.out.println(picks[i][0]+": " + score[i]);
        }
    }
    
	public static void calculateScore(){
		for(int i = 0; i < gamesPlayed; i++){
			for(int j = 0; j < score.length; j++){
				if(picks[j][i+1].equals(gameWinners[i])){
					if(picks[j][i+1].equals("Rose") || picks[j][i+1].equals("Sugar"))
						score[j]+=2;
					else
						score[j]++;
				}
			}
		}
	}

	public static int findHighest(){
		int ret = score[0];

		for(int i = 1; i < score.length; i++){
			if(score[i] > ret)
				ret = score[i];
		}
		return ret;
	}

	public static void tooLow(int high){
		for(int i = 0; i < score.length; i++){
			if(score[i] < (high - gamesLeft))
				stillIn[i] = false;
		}
	}

	public static void printRemaingPlayers(){
		System.out.println("\nRemaining Players:\n");
		for(int i = 0; i < score.length; i++){
			if(stillIn[i])
				System.out.println(picks[i][0]);
		}
	}

	public static void pickComparison(){
		for(int i = 0; i < picks.length; i++){
			for(int j = 0; j < picks.length; j++){
				if(i != j){
					int pickDifferential = 0;
					for(int k = 0; k < picks[0].length - gamesPlayed - 1; k++){
						if(!picks[i][k+gamesPlayed+1].equals(picks[j][k+gamesPlayed+1])){
							if(picks[i][k+gamesPlayed+1].equals("Peach") || picks[i][k+gamesPlayed+1].equals("Fiesta"))
								pickDifferential+=2;
							else
								pickDifferential++;
						}
					}
					if(pickDifferential<(score[i]-score[j])){
						stillIn[j] = false;
						//System.out.println(picks[i][0]+" eliminated "+picks[j][0]);
					}
				}
			}
		}
	}
}
