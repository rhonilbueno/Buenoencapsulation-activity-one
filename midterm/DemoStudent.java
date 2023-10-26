import java.util.Scanner;

public class DemoStudent{
   public static void main(String a[]){
         Course course = new Course();
      Scanner sc = new Scanner(System.in);
      String first_name = "";
      String last_name = "";
      String middle_name = "";
      String suffix = "";
      String telephone = "";
      int idno = 0;
      int age = 0;
      int year_level = 0;
      String email = "";

      System.out.println("Selection Menu:");
      System.out.println("----------------------------------");
      System.out.println("1. Create Student Record\n0. Exit");
      System.out.println("----------------------------------");
      System.out.print("Enter Selection: ");
      int choice = sc.nextInt();
      sc.nextLine();
      
      System.out.println("====================================\n");
      if(choice== 0)System.exit(0);
      
      System.out.println("Enter Student Details: ");
      System.out.println("----------------------------------");
      System.out.println("Student ID No.");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Student ID No.: ");
      idno = sc.nextInt();
      sc.nextLine();
      
      System.out.println("----------------------------------");
      System.out.println("First Name");
      System.out.println("----------------------------------\n");
      System.out.print("Enter First Name: ");
      last_name = sc.nextLine();
      
      System.out.println("----------------------------------");
      System.out.println("Middle Name");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Middle Name: ");
      middle_name = sc.nextLine();
      
      System.out.println("----------------------------------");
      System.out.println("Last Name");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Last Name: ");
      last_name = sc.nextLine();
      
      
      System.out.println("----------------------------------");
      System.out.println("Suffix");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Suffix: ");
      suffix = sc.nextLine();
      
      
      System.out.println("----------------------------------");
      System.out.println("Age");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Age: ");
      age = sc.nextInt();
      sc.nextLine();
      
      
      System.out.println("----------------------------------");
      System.out.println("Year Level");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Year Level: ");
      year_level = sc.nextInt();
      sc.nextLine();
      
      
      System.out.println("----------------------------------");
      System.out.println("Phone Number");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Phone Number: ");
      telephone = sc.nextLine();
      
      
      System.out.println("----------------------------------");
      System.out.println("Email");
      System.out.println("----------------------------------\n");
      System.out.print("Enter Email: ");
      email = sc.nextLine();
      
      Student st = new Student(first_name, last_name, middle_name,
    suffix, telephone, idno,age, year_level, email);
      while(true){
      System.out.println("====================================\n");
      
      System.out.println("Student Record Selection Menu:");
      System.out.println("----------------------------------");
      System.out.println("1. Update Student Profile Details\n2. Update Student Course Details\n3. Display Student Record\n0. Exit");
      System.out.println("----------------------------------");
      System.out.print("Enter Selection: ");
      choice = sc.nextInt();
      if(choice == 0) System.exit(0);
      System.out.println("====================================\n");

      if(choice == 1){
      System.out.println("Student Profile Update Selection Menu:");
      System.out.println("----------------------------------");
      System.out.println("1. Update Student ID No.");
      System.out.println("2. Update First Name");
      System.out.println("3. Update Middle Name");
      System.out.println("4. Update Last Name");
      System.out.println("5. Update Suffix");
      System.out.println("6. Update Age");
      System.out.println("7. Update Year Level");
      System.out.println("8. Update Phone Number");
      System.out.println("9. Update Email");
      System.out.println("0. Return");
      System.out.println("----------------------------------");
      System.out.print("Enter Selection: ");
      choice = sc.nextInt();
      sc.nextLine();
      
      System.out.println("Enter Student Details: (Update)");

      switch(choice){
         case 1: 
            System.out.println("----------------------------------");
            System.out.println("Student ID No.");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Student ID No.: ");
            st.setIDNo(sc.nextInt());
            sc.nextLine();
            break;
         case 2: 
            System.out.println("----------------------------------");
            System.out.println("First Name");
            System.out.println("----------------------------------\n");
            System.out.print("Enter First Name: ");
            st.setFName(sc.nextLine());
            break;
         case 3: 
            System.out.println("----------------------------------");
            System.out.println("Middle Name");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Middle Name: ");
            st.setMName(sc.nextLine());
            break;
         case 4: 
            System.out.println("----------------------------------");
            System.out.println("Last Name");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Last Name: ");
            st.setLName(sc.nextLine());
            break;
         case 5: 
            System.out.println("----------------------------------");
            System.out.println("Suffix");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Suffix: ");
            st.setSuffix(sc.nextLine());
            break;
         case 6: 
            System.out.println("----------------------------------");
            System.out.println("Age");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Age: ");
            st.setAge(sc.nextInt());
            sc.nextLine();
            break;
         case 7: 
            System.out.println("----------------------------------");
            System.out.println("Year Level");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Year Level: ");
            st.setYearLevel(sc.nextInt());
            sc.nextLine();
            break;
         case 8: 
            System.out.println("----------------------------------");
            System.out.println("Phone Number");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Phone Number: ");
            st.setTelephone(sc.nextLine());
            break;
         case 9: 
            System.out.println("----------------------------------");
            System.out.println("Email");
            System.out.println("----------------------------------\n");
            System.out.print("Enter Email: ");
            st.setEmail(sc.nextLine());
            break;
         case 0: 
            continue;
      }
      continue;
      }
      if(choice== 2){
      System.out.println("====================================\n");
      System.out.println("Enter Student Course Details: (Update)");
      System.out.println("----------------------------------");
      System.out.println("1. Bachelor of Science in Information Technology (BSIT)"+
                           "\n2. Bachelor of Science in Computer Science (BSCS)" + "\n3. Associate in Computer Technology (ACT)" +
                            "\n4. Bachelor of Science in Mechanical Engineering (BSME)" + "\n5. Bachelor of Science in Civil Engineering (BSCE)");
      System.out.println("----------------------------------");
      System.out.print("Enter Selection: ");
      course.courseSetter(sc.nextInt());
      sc.nextLine();
      
      }
      
      if(choice==3){
      while(true){
      System.out.println("----------------------------------");
      System.out.println("0. Exit");
      System.out.println("----------------------------------\n");
      System.out.println("Student Profile Details: ");
      System.out.println(" Student ID No: " + st.getIDNo());
      System.out.println(" Student First Name: "+ st.getFName());
      System.out.println(" Student Middle Name: "+ st.getMName());
      System.out.println(" Student Last Name: "+ st.getLName());
      System.out.println(" Suffix: "+ st.getSuffix());
      System.out.println(" Age: "+ st.getAge());
      System.out.println(" Year Level: "+ st.getYearLevel());
      System.out.println(" Phone Number: "+ st.getTelephone());
      System.out.println(" Email: "+ st.getEmail());
      
      System.out.println("Student Course Details: ");
      System.out.println(" Course Name: "+ course.getCourseName());
      System.out.println(" Course Code: "+ course.getCourseCode());
      System.out.println(" Department: "+ course.getDepartment());
      System.out.println("----------------------------------\n");
      System.out.print("Enter Selection: ");
      choice = sc.nextInt();
      sc.nextLine();
      System.out.println("====================================\n");
      if(choice==0) break;

      }
      }
   }
   }
}