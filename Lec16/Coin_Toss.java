package Lec16;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		CoinToss(n, "");

	}
	public static void CoinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		CoinToss(n-1, ans+"T");
		CoinToss(n-1, ans+"H");
		
	}

}
