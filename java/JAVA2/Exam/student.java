package JAVA2.Exam;

public class student {
    private String idStudent;
    private String name;
    private String address;
    private String phone;

    public student(){
        idStudent = "";
        name = "";
        address = "";
        phone = "";
    }

    public student(String idStudent, String name, String address, String phone){
        this.idStudent = idStudent;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30s%-30s\n",idStudent,name,address,phone);
    }
}
