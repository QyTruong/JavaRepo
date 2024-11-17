package lib1;

public class SinhVien {
    private String lastName;
    private String firstName;

    public SinhVien(){};
    public SinhVien(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String toString(){
        return "Ho va ten: " + lastName + " " + firstName;
    }
}