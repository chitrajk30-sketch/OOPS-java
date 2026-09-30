import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationsArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chennai");
        cities.add("Madurai");
        cities.add("Trichy");

        int choice;

        do {
            System.out.println("\n----- STRING OPERATIONS USING ARRAYLIST -----");
            System.out.println("1. Append City");
            System.out.println("2. Insert City");
            System.out.println("3. Search City");
            System.out.println("4. Display Cities Starting with a Letter");
            System.out.println("5. Display All Cities");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter city to append: ");
                    String city = sc.nextLine();
                    cities.add(city);
                    System.out.println("Updated List: " + cities);
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter city to insert: ");
                    String insertCity = sc.nextLine();

                    if (index >= 0 && index <= cities.size()) {
                        cities.add(index, insertCity);
                        System.out.println("Updated List: " + cities);
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;

                case 3:
                    System.out.print("Enter city to search: ");
                    String searchCity = sc.nextLine();

                    if (cities.contains(searchCity)) {
                        System.out.println("City Found at Index: " + cities.indexOf(searchCity));
                    } else {
                        System.out.println("City Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter starting letter: ");
                    char ch = sc.next().charAt(0);

                    System.out.println("Cities Starting with '" + ch + "':");
                    for (String c : cities) {
                        if (Character.toUpperCase(c.charAt(0)) == Character.toUpperCase(ch)) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 5:
                    System.out.println("City List: " + cities);
                    break;

                case 6:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}


OUTPUT :

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 1
Enter city to append: madurai
Updated List: [Chennai, Madurai, Trichy, madurai]

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 2
Enter index: 1
Enter city to insert: trichy
Updated List: [Chennai, trichy, Madurai, Trichy, madurai]

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 3
Enter city to search: madurai
City Found at Index: 4

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 4
Enter starting letter: m
Cities Starting with 'm':
Madurai
madurai

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 5
City List: [Chennai, trichy, Madurai, Trichy, madurai]

----- STRING OPERATIONS USING ARRAYLIST -----
1. Append City
2. Insert City
3. Search City
4. Display Cities Starting with a Letter
5. Display All Cities
6. Exit
Enter your choice: 6
Program Exited.
