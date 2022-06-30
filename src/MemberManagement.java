import java.util.Scanner;

public class MemberManagement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of members:");
		String tN = scanner.nextLine(); // tN is total number
		String[] mN = new String[Integer.parseInt(tN)]; // mN is membership
														// number
		for (int q = 0; q < Integer.parseInt(tN); q++) {
			mN[q] = "0";
		}
		String[] name = new String[Integer.parseInt(tN)];
		String[] age = new String[Integer.parseInt(tN)];
		String[] gender = new String[Integer.parseInt(tN)];
		boolean[] obser = new boolean[Integer.parseInt(tN)]; // obser is
																// observation
		int i = 1; // Number of members from the begining
		boolean exit = false;
		while (exit == false) {
			System.out.println("1-creat");
			System.out.println("2-delete");
			System.out.println("3-read");
			System.out.println("4-update");
			System.out.println("5-exit");
			System.out.print("Enter a number:");
			String x = scanner.nextLine();
			switch (Integer.parseInt(x)) {
			case 1: {
				System.out.print("Name:");
				name[i - 1] = scanner.nextLine();
				System.out.print("age:");
				age[i - 1] = scanner.nextLine();
				System.out.print("gender:");
				gender[i - 1] = scanner.nextLine();
				obser[i - 1] = true;
				mN[i - 1] = String.valueOf(i);
				System.out.print("membership number:");
				System.out.println(mN[i - 1]);
				i++;
			}
				break;
			case 2: {
				System.out.print("enter membership number:");
				String j = scanner.nextLine();
				int s = 0;
				while ((Integer.parseInt(mN[s]) != Integer.parseInt(j))) {
					s++;
					if (s >= (Integer.parseInt(tN) - 1))
						break;
				}

				if (s == (Integer.parseInt(tN) - 1)) {
					System.out.println("not found");
				} else if (obser[s] == true) {
					name[s] = "";
					age[s] = "";
					gender[s] = "";
					obser[s] = false;
					System.out.println("member deleted");
				} else {
					System.out.println("deleted member");
				}
			}
				break;

			case 3: {
				System.out.print("enter membership number:");
				String j = scanner.nextLine();
				int s = 0;
				while ((Integer.parseInt(mN[s]) != Integer.parseInt(j))) {
					s++;
					if (s >= (Integer.parseInt(tN) - 1))
						break;
				}

				if (s == (Integer.parseInt(tN) - 1)) {
					System.out.println("not found");
				} else {
					if (obser[s] == true) {
						System.out.print("Name:");
						System.out.println(name[s]);
						System.out.print("age:");
						System.out.println(age[s]);
						System.out.print("gender:");
						System.out.println(gender[s]);
						System.out.print("membership number:");
						System.out.println(mN[s]);
					} else {
						System.out.println("deleted member");
					}
				}
			}
				break;

			case 4: {
				{
					System.out.print("enter membership number:");
					String j = scanner.nextLine();
					int s = 0;
					while ((Integer.parseInt(mN[s]) != Integer.parseInt(j))) {
						s++;
						if (s >= (Integer.parseInt(tN) - 1))
							break;
					}

					if (s == (Integer.parseInt(tN) - 1)) {
						System.out.println("not found");
					} else if (obser[s] == true) {
						System.out.print("mew Name:");
						name[s] = scanner.nextLine();
						System.out.print("new age:");
						age[s] = scanner.nextLine();
						System.out.print("new gender:");
						gender[s] = scanner.nextLine();
					} else {
						System.out.println("deleted member");
					}
				}
			}
				break;

			case 5:
				exit = true;
				break;
			default:
				System.out.println("choose number from 1 to 5:");
			}
		}
		scanner.close();
	}

}
