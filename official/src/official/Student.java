package official;
class Student{
    private String ID; 
    private String name; 
    private String group; 
    private String email; 

    
    Student() {}
    
    Student(String ID, String name, String group, String email){
        this.ID = ID; 
        this.name = name; 
        this.group = group; 
        this.email = email; 
    }
    
    Student(Student s)
    {
        this.ID = s.getID();
        this.name = s.getName();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
    
    String getName()  {  return name; }
    void setName(String name) { this.name = name; }
    
    String getID()  {  return ID; }
    void setID(String id) { this.ID = id; }
    
    String getGroup()  {  return group; }
    void setGroup(String group) { this.group = group; }
    
    String getEmail()  {  return email; }
    void setEmail(String email) { this.email = email; }
    
    String getInfo(){
        return ID+" "+name+" "+group+" "+email+"\n";
    }
}
