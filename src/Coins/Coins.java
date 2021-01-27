package Coins;
//15
//Given a list of coins with different values (1, 3, 10, 25, 50), determine the minimum amount of coins needed to sum up a certain amount of money
//Given input n = 33, the output should be: 4 (due to 33 = 10+10+10+3)

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entere a number");
		int number = scanner.nextInt();
		int r = 0;
			if (number < 44){
				int t = number % 10;
				r = number / 10;
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

					int p = number % 50;
					r = number / 50;
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
		System.out.println(r);
	}
}