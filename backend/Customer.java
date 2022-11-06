package backend;

public class Customer {
    String firstName;
    String lastName;
    String DOB;
    String phone;
    Address address;
    int broncoID;

    // constructor
    public Customer(){}
    public Customer(String firstName, String lastName, String DOB, String phone, Address address, int broncoID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.phone = phone;
        this.address = address;
        this.broncoID = broncoID;
    }

    // getters
    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getDOB(){
        return this.DOB;
    }

    String getPhone(){
        return this.phone;
    }

    Address getAddress(){
        return this.address;
    }

    int getBroncoID(){
        return this.broncoID;
    }

    // setters
    void setFirstName(String name){
        this.firstName = name;
    }

    void setLastName(String name){
        this.lastName = name;
    }

    void setDOB(String DOB){
        this.DOB = DOB;
    }

    void setPhone(String phone){
        this.phone = phone;
    }

    void setAddress(Address address){
        this.address = address;
    }

    void setBroncoID(int id){
        this.broncoID = id;
    }
}

class Address{
    String street;
    int number;
    int zipCode;
    String city;
    String state;

    // constructor
    public Address(){}
    public Address(String street, int number, int zipCode, String city, String state){
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    // getters
    String getStreet(){
        return this.street;
    }

    int getNumber(){
        return this.number;
    }

    int getZipCode(){
        return this.zipCode;
    }

    String getCity(){
        return this.city;
    }

    String getState(){
        return this.state;
    }

    // setters
    void setStreet(String street){
        this.street = street;
    }

    void setNumber(int number){
        this.number = number;
    }

    void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }

    void setCity(String city){
        this.city = city;
    }

    void setState(String state){
        this.state = state;
    }
}

interface Student_I{
    // getters
    String getEnterDate();
    String getGradDate();
    String getMajor();
    String getMinor();

    // setters
    void setEnterDate(String date);
    void setGradDate(String date);
    void setMajor(String major);
    void setMinor(String minor);
}

interface Professor_I{
    // getters
    String getDepartment();
    String getOffice();
    String getResearch();

    // setters
    void setDepartment(String department);
    void setOffice(String office);
    void setResearch(String research);
}

class Student extends Customer implements Student_I{
    String enterDate;
    String gradDate;
    String major;
    String minor;

    // constructor
    public Student(){}
    public Student(String firstName, String lastName, String DOB, String phone, Address address, int broncoID, String enterDate, String gradDate, String major, String minor){
        super(firstName, lastName, DOB, phone, address, broncoID);
        this.enterDate = enterDate;
        this.gradDate = gradDate;
        this.major = major;
        this.minor = minor;
    }

    // getters
    public String getEnterDate(){
        return this.enterDate;
    }

    public String getGradDate(){
        return this.gradDate;
    }

    public String getMajor(){
        return this.major;
    }

    public String getMinor(){
        return this.minor;
    }

    // setters
    public void setEnterDate(String date){
        this.enterDate = date;
    }

    public void setGradDate(String date){
        this.gradDate = date;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setMinor(String minor){
        this.minor = minor;
    }
}

class Professor extends Customer implements Professor_I{
    String department;
    String office;
    String research;

    // constructor
    public Professor(){}
    public Professor(String firstName, String lastName, String DOB, String phone, Address address, int broncoID, String department, String office, String research){
        super(firstName, lastName, DOB, phone, address, broncoID);
        this.department = department;
        this.office = office;
        this.research = research;
    }

    // getters
    public String getDepartment(){
        return this.department;
    }

    public String getOffice(){
        return this.office;
    }

    public String getResearch(){
        return this.research;
    }

    // setters
    public void setDepartment(String department){
        this.department = department;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void setResearch(String research){
        this.research = research;
    }
}

class StudentProfessor extends Customer implements Student_I, Professor_I{
    String enterDate;
    String gradDate;
    String major;
    String minor;
    String department;
    String office;
    String research;

    // constructor
    public StudentProfessor(){}
    public StudentProfessor(String firstName, String lastName, String DOB, String phone, Address address, int broncoID, String enterDate, String gradDate, String major, String minor, String department, String office, String research){
        super(firstName, lastName, DOB, phone, address, broncoID);
        this.enterDate = enterDate;
        this.gradDate = gradDate;
        this.major = major;
        this.minor = minor;
        this.department = department;
        this.office = office;
        this.research = research;
    }

    // getters
    public String getEnterDate(){
        return this.enterDate;
    }

    public String getGradDate(){
        return this.gradDate;
    }

    public String getMajor(){
        return this.major;
    }

    public String getMinor(){
        return this.minor;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getOffice(){
        return this.office;
    }

    public String getResearch(){
        return this.research;
    }

    // setters
    public void setEnterDate(String date){
        this.enterDate = date;
    }

    public void setGradDate(String date){
        this.gradDate = date;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setMinor(String minor){
        this.minor = minor;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void setResearch(String research){
        this.research = research;
    }
}