import java.util.*;

class Student {
    String stud_id, stud_name, grade;
    double assign1mks, assign2mks, promks, individualtmks;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        stud_id = sc.nextLine();
        System.out.println("Enter Student name:");
        stud_name = sc.nextLine();
        System.out.println("Enter marks of Assignment 1:");
        assign1mks = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter marks of Assignment 2:");
        assign2mks = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Project marks:");
        promks = sc.nextDouble();
        sc.nextLine();
        // sc.close();
    }

    void cal() {
        individualtmks = assign1mks + assign2mks + promks;
        double per = (individualtmks / 300) * 100;
        if (per >= 60) {
            grade = "A";
        } else if (per >= 50 && per <= 59) {
            grade = "B";
        } else if (per >= 40 && per <= 49) {
            grade = "C";
        } else if (per >= 35 && per <= 39) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    void display() {
        System.out.println("Student ID:" + stud_id);
        System.out.println("Student Name:" + stud_name);
        System.out.println("Marks of Assignment 1:" + assign1mks);
        System.out.println("Marks of Assignment 2:" + assign2mks);
        System.out.println("Project Marks:" + promks);
        System.out.println("Individual Total Marks:" + individualtmks);
        System.out.println("Grade:" + grade);
    }

    class Assignment {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int ch;
            Student[] ss = new Student[11];
            ss[1] = new Student();
            ss[2] = new Student();
            ss[3] = new Student();
            ss[4] = new Student();
            ss[5] = new Student();
            ss[6] = new Student();
            ss[7] = new Student();
            ss[8] = new Student();
            ss[9] = new Student();
            ss[10] = new Student();
            do {
                System.out.println("Menu------>");
                System.out.println("1. Enter Student Record.");
                System.out.println("2. Display all Student Grade.");
                System.out.println("3. Display Statistics.");
                System.out.println("4. Exit Application.");
                System.out.println("Enter Choice:");
                ch = s.nextInt();
                //s.nextLine();

                switch (ch) {
                    case 1:
                        System.out.println("Enter records of 10 students->");
                        for (int i = 1; i <= 10; i++) {
                            ss[i].accept();
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 10; i++) {
                            ss[i].cal();
                            System.out.println("Student " + ss[i].stud_id + " grade:" + ss[i].grade);
                        }
                        break;
                    case 3:
                        for (int i = 1; i <=10; i++) {
                            ss[i].cal();
                            ss[i].display();
                        }
                        break;
                    case 4:System.out.println("Exit Successful. Thank You!");
                            System.exit(0);
                    default: System.out.println("Invalid Choice! Please Enter Again.");
                        
                }
            }while(ch!=4);
        }
    }

}