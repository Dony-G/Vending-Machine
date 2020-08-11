package vendmach;
import java.util.Scanner;
public class vendingmachine {

	public static void main(String[] args) {
		double tvbar = 15.90, kitkat = 20.50, lunbar = 18.90, lays = 16.50, simba = 17.00, willards = 18.00, coke = 17.50, fanta = 16.80, still = 18.00, telkom = 40.00, mtn = 115.00, voda = 160.00, balance;
		int choice;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Welcome to the Automated Vending Machine!!!\n");

		System.out.println("Please enter in your credit amount: ");
		double credit = sc.nextDouble();
		while (credit < 15.90) {
			System.out.println(" Insufficient funds!!!");
			System.out.println("Please enter in sufficient amount of funds: ");
			credit = sc.nextDouble();
		}

		System.out.println("Please select an option from the items below for purchase:\n(1)Chocolate\n(2)Potatoe Chips\n(3)Cold drink\n(4)Mobile Data");
		int select = sc.nextInt();

		if (select == 1) {
			System.out.println("Please see submenu with allocated prices below:");
			System.out.println("(1)TV Bar - R15.90\n(2)Kit Kat - R20.50\n(3)Lunchbar - R18.90");
			System.out.println("Please enter in your choice:");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("You have selected a TV Bar at a cost of R" + tvbar);
				balance = credit - tvbar;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 2) {
				System.out.println("You have selected a Kit Kat at a cost of R" + kitkat);
				balance = credit - kitkat;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 3) {
				System.out.println("You have selected a Lunchbar at a cost of R" + lunbar);
				balance = credit - lunbar;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}
		}

		if (select == 2) {
			System.out.println("Please see submenu with allocated prices below:");
			System.out.println("(1)Lays - R16.50\n(2)Simba - R17\n(3)Willards - R18");
			System.out.println("Please enter in your choice:");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("You have selected Lays chips at a cost of R" + lays);
				balance = credit - lays;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 2) {
				System.out.println("You have selected Simba chips at a cost of R" + simba);
				balance = credit - simba;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}


			if (choice == 3) {
				System.out.println("You have selected Willards chips at a cost of R" + willards);
				balance = credit - willards;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}
		}

		if (select == 3) {
			System.out.println("Please see submenu with allocated prices below:");
			System.out.println("(1)Coke - R17.50\n(2)Fanta - R16.80\n(3)Still Water - R18");
			System.out.println("Please enter in your choice:");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("You have selected a Coke at a cost of R" + coke);
				balance = credit - coke;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 2) {
				System.out.println("You have selected a Fanta at a cost of R" + fanta);
				balance = credit - fanta;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 3) {
				System.out.println("You have selected a Still Water at a cost of R" + still);
				balance = credit - still;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}		
		}

		if (select == 4) {
			System.out.println("Please see submenu with allocated prices below:");
			System.out.println("(1)Telkom 100Mb - R40\n(2)MTN 100Mb - R115\n(3)Vodacom 100Mb - R160");
			System.out.println("Please enter in your choice:");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("You have selected Telkom at a cost of R" + telkom);
				balance = credit - telkom;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 2) {
				System.out.println("You have selected MTN at a cost of R" + mtn);
				balance = credit - mtn;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}

			if (choice == 3) {
				System.out.println("You have selected Vodacom at a cost of R" + voda);
				balance = credit - voda;
				if (balance < 0) {
					System.out.println("You do not have enough funds!!!");
				}else{
					System.out.println("Your balance is: R" + balance);
				}
			}		
		}
		sc.close();

	}
}



