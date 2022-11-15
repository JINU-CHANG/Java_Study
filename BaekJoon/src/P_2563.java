
import java.util.Scanner;
public class P_2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //색종이 갯수
		boolean[][] board = new boolean[100][100]; 
		
		int cnt=0; //검은색 색종이 넓이 계산
		
		for(int t=0; t<T ;t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for(int i=x;i<=x+9;i++) {
				for(int j=y;j<=y+9;j++) {
					if(board[i][j]==true) { //겹치는 부분이 있으면 패스!
						continue;
					}
					board[i][j]=true;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
