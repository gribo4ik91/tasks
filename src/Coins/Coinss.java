package Coins;
//15
//Given a list of coins with different values (1, 3, 10, 25, 50), determine the minimum amount of coins needed to sum up a certain amount of money
//Given input n = 33, the output should be: 4 (due to 33 = 10+10+10+3)
import java.util.Scanner;


public class Coinss {

	static  Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int coins = getCoins();
		int numberOfCoins = getValidation(coins);
		notification(numberOfCoins);
	}


	public static int getCoins (){
		System.out.println("Entere a number of coins");
		int number = scanner.nextInt();
		return number;
	}
	public static int getValidation(int coins){
		int r = 0;
		if (coins < 44){
			int t = coins % 10;
			r = coins / 10;
			if (t > 0){
				int aa = t % 3;
				int q = t / 3;
				r+=q;
				if (aa>0){
					int z = aa % 1;
					int x = aa / 1;
					r+=x;

				}
			}
		}
		else {

			int p = coins % 50;
			r = coins / 50;
			if (p > 0 ) {
				int o = p % 25;
				int l = p / 25;
				r += l;
				if ( o > 0 ) {
					int y = o % 10;
					int h = o / 10;
					r+=h;
					if ( y > 0){
						int v = y % 3;
						int g = y / 3;
						r+=g;
						if (v > 0){
							int c = v % 1;
							int j = v / 1;
							r+=j;
						}
					}
				}
			}

		}
		return r;
	}
	public static void notification(int numberOfCoins){
		System.out.println("Minimum amount of coins needed: " +numberOfCoins);
	}
}
