import java.util.*;

interface Department {
    String deptName = "BTECH CSE";
    String depthead = "Soumalya";
    void display();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberofRooms;

    void input(String hn, String hl, int nr) {
        hostelName = hn;
        hostelLocation = hl;
        numberofRooms = nr;
    }

    void output() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberofRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getdata(String sn, int rgn, String es, double avg) {
        studentName = sn;
        regdNo = rgn;
        electiveSubject = es;
        avgMarks = avg;
    }

    void printdata() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    public void display() {
        System.out.println("Department Head: " + depthead);
        System.out.println("Department Name: " + deptName);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] ob = new Student[100];
        int i = 0;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate (Search by Regd No)");
            System.out.println("3. Display All");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    while (true) {
                        System.out.println("Press -1 to stop, any other number to continue:");
                        int stop = sc.nextInt();
                        sc.nextLine();

                        if (stop == -1)
                            break;

                        ob[i] = new Student();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Regd No: ");
                        int reg = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Elective Subject: ");
                        String sub = sc.nextLine();

                        System.out.print("Enter Avg Marks: ");
                        double avg = sc.nextDouble();
                        sc.nextLine();

                        ob[i].getdata(name, reg, sub, avg);

                        System.out.print("Enter Hostel Name: ");
                        String hn = sc.nextLine();

                        System.out.print("Enter Hostel Location: ");
                        String hl = sc.nextLine();

                        System.out.print("Enter Number of Rooms: ");
                        int nr = sc.nextInt();
                        sc.nextLine();

                        ob[i].input(hn, hl, nr);

                        i++;
                    }
                    break;

                case 2:
                    System.out.print("Enter Regd No to Migrate: ");
                    int rg = sc.nextInt();

                    boolean found = false;

                    for (int k = 0; k < i; k++) {
                        if (ob[k].regdNo == rg) {
                            System.out.println("\nStudent Found & Migrated:");

                            ob[k].printdata();
                            ob[k].output();
                            ob[k].display();

                            // Delete (shift array)
                            for (int j = k; j < i - 1; j++) {
                                ob[j] = ob[j + 1];
                            }

                            i--; // reduce count
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    if (i == 0) {
                        System.out.println("No students available.");
                    } else {
                        for (int k = 0; k < i; k++) {
                            System.out.println("\n--- Student " + (k + 1) + " ---");
                            ob[k].printdata();
                            ob[k].output();
                            ob[k].display();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}