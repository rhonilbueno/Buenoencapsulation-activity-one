public class Course{
   public Course(){
   
   }
   String[] selection_name = {"Bachelor of Science in Information Technology",
    "Bachelor of Science in Computer Science", "Associate in Computer Technology", "Bachelor of Science in Mechanical Engineering",
     "Bachelor of Science in Civil Engineering"};
   String course_name;
   String course_code;
   String department;
   
   public String getCourseName(){
   return course_name;
  }
  public String getCourseCode(){
   return course_code;
  }
  public String getDepartment(){
   return department;
  }
  public void courseSetter(int sel){
   setDepartment(sel);
   setCourseName(sel);
   setCourseCode(sel);
  }
  public void setDepartment(int selection){
   if(selection == 1 || selection == 2 || selection == 3){
      this.department = "College of Computer Studies Department";
   }
   else{
      this.department = "College of Engineering Department";
   }
  }
  
  public void setCourseName(int selection){
   if(selection == 1){
      this.course_name = selection_name[0];
   }
   if(selection == 2){
      this.course_name = selection_name[1];
   }
   if(selection == 3){
      this.course_name = selection_name[2];
   }
   if(selection == 4){
      this.course_name = selection_name[3];
   }
   if(selection == 5){
      this.course_name = selection_name[4];
   }
 
  }
   
  
  public void setCourseCode(int selection){
  
   if(selection == 1){
      this.course_code = "BSIT";
   }
   if(selection == 2){
      this.course_code = "BSCS";
   }
   if(selection == 3){
      this.course_code = "ACT";
   }
   if(selection == 4){
      this.course_code = "BSME";
   }
   if(selection == 5){
      this.course_code = "BSCE";
   }
  }
 
}