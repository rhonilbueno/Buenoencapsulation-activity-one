public class Student {
   String first_name;
   String last_name;
   String middle_name;
   String suffix;
   String telephone;
   String email;
   int idno, age, year_level;
   public Student(String first_name, String last_name, String middle_name,
   String suffix, String telephone, int idno, int age, int year_level, String email){
   this.first_name = first_name;
   this.last_name = last_name;
   this.middle_name = middle_name;
   this.suffix = suffix;
   this.telephone = telephone;
   this.idno = idno;
   this.age = age;
   this.year_level = year_level;
   this.email = email;
   }
   
  public String getFName(){
   return first_name;
  }
  public String getLName(){
   return last_name;
  }
  public String getMName(){
   return middle_name;
  }
  public String getSuffix(){
   return suffix;
  }
  public String getEmail(){
   return first_name;
  }
  public String getTelephone(){
   return last_name;
  }
  public int getAge(){
   return age;
  }
  public String getYearLevel(){
   return suffix;
  }
  public int getIDNo(){
   return idno;
  }
  
  public void setFName(String Fname){
  
   first_name = Fname;
  }
  public void setMName(String Mname){
   middle_name = Mname;
  }
  public void setLName(String Lname){
   last_name = Lname;
  }
  public void setSuffix(String suffx){
   suffix = suffx;
  }
  
  public void setEmail(String email){
  
   this.email = email;
  }
  public void setTelephone(String Mname){
   middle_name = Mname;
  }
  public void setYearLevel(int year_level){
   this.year_level = year_level;
  }
  public void setAge(int age){
   this.age = age;
  }
  public void setIDNo(int idno){
   this.idno = idno;
  }
  
  public String getFullName(){
   return getFName() + " " + getMName() + " " + getLName() + " " + getSuffix(); 
  }
  
}