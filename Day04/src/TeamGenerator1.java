import java.util.Random;

public class TeamGenerator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players = {
				"조장1", "조장2", "조장3", "조장4", "조장5",
				"아무개1", "아무개2", "아무개3", "아무개4", "아무개5",
				"아무개6", "아무개7", "아무개8", "아무개9", "아무개10",
				"아무개11", "아무개12", "아무개13", "아무개14", "아무개15",
				"아무개16", "아무개17", "아무개18", "아무개19", "아무개20",
				"아무개21", "아무개22", "아무개23", "아무개24", "아무개25"
		};
		String[][] team = new String[5][6];
		for (int i = 0; i < team.length; i++) {
			int leaderIndex = (int)(Math.random()*5);
			
			if(players[leaderIndex] == null) {
				i--;
			}
			else {
				team[i][0] = players[leaderIndex];
				players[leaderIndex] = null;
			}
		}
		for (int i = 0; i < team.length; i++) {
			for (int j = 1; j < team[i].length; j++) {
				int memberIndex = (int)(Math.random()*25)+5;
				if(players[memberIndex] == null) {
					j--;
				}
				else {
					team[i][j] = players[memberIndex];
					players[memberIndex] = null;
				}
			}
		}
		for (int i = 0; i < team.length; i++) {
			
				System.out.println("팀장 : " + team[i][0]);
				System.out.print("팀원 : ");
				for (int j = 1; j < team[i].length; j++) {
					System.out.print(team[i][j]);
				}
			System.out.println();
		}
	}
}
