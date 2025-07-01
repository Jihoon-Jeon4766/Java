import java.util.Random;

public class TeamGenerator {
    public static void main(String[] args) {
        String[] players = {
            "조장1", "조장2", "조장3", "조장4", "조장5",
            "아무개1", "아무개2", "아무개3", "아무개4", "아무개5",
            "아무개6", "아무개7", "아무개8", "아무개9", "아무개10",
            "아무개11", "아무개12", "아무개13", "아무개14", "아무개15",
            "아무개16", "아무개17", "아무개18", "아무개19", "아무개20",
            "아무개21", "아무개22", "아무개23", "아무개24", "아무개25"
        };
        
        String[][] team = new String[5][6];
        
        // 팀장
        for (int i = 0; i < team.length; i++) {
			// 각 팀에 배정할 팀장명이 저장된 player 배열의 인덱스 번호를 0번부터 4번 인덱스까지 랜덤하게 얻어옴
        	
        	
        	// 한번 팀장 이름으로 사용된 인덱스 번호값은 사용된 값이라고 표시를 해두자
        	int leaderIndex = (int)(Math.random() * 5); // 0 ~ 4
        	
        	
        	// i == 1
        	if(players[leaderIndex] == null) {
        		i--;
        	}
        	else {
        	team[i][0] = players[leaderIndex];
        	players[leaderIndex] = null;
        	}
		}
        
		/*for (int i = 0; i < team.length; i++) {
			System.out.println((i + 1) + " 팀장명 : " + team[i][0]);
		}*/
        
        // 팀원 배정
        for (int i = 0; i < team.length; i++) {
			for (int j = 1; j < team[i].length; j++) {
				int memberIndex = (int)(Math.random() * 25) + 5;
				
				if(players[memberIndex] == null) {
					j--;
				}
				else {
					team[i][j] = players[memberIndex];
					players[memberIndex] = null;
				}
			}
		}
        
        // 출력
        for (int i = 0; i < team.length; i++) {
			System.out.println((i + 1) + "팀장 : " + team[i][0]);
			
			System.out.print("팀원 : ");
			for (int j = 1; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println();
		}
        
        
        
		/* String[][] team = new String[5][6]; 
		boolean[] check = new boolean[30]; 
		Random rand = new Random();
		
		// 조장 랜덤으로 뽑기
		for (int i = 0; i < 5; i++) {
		    int index = 0;
		    do{
		        index = rand.nextInt(5); 
		    }while(check[index]);
		    team[i][0] = players[index]; 
		    check[index] = true;   
		}
		 // 랜덤으로 섞인 조장에서 팀원들 배치하기
		for (int i = 0; i < 5; i++) {
		    for (int j = 1; j < 6; j++) { 
		        int index = 0;
		        do {
		            index = rand.nextInt(30); 
		        }while(check[index]);
		        team[i][j] = players[index]; 
		        check[index] = true; 
		    }
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "팀");
		    System.out.println("조장 : " + team[i][0]);
			System.out.print("팀원 : ");
			for (int j = 1; j < 6; j++) {
			    System.out.print(team[i][j] + (j < 5 ? ", " : " \n"));
			}
			System.out.println();
		}*/
    }
    
}
