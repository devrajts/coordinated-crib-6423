package Dao_project.model;

public class Criminal {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String identifyingMarks;
    private String crimeArea;
    private String crimeName;

    public Criminal (){

    }

    public Criminal(String name, int age, String gender, String address, String identifyingMarks, String crimeArea, String crimeName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.identifyingMarks = identifyingMarks;
        this.crimeArea = crimeArea;
        this.crimeName = crimeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentifyingMarks() {
        return identifyingMarks;
    }

    public void setIdentifyingMarks(String identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
    }

    public String getCrimeArea() {
        return crimeArea;
    }

    public void setCrimeArea(String crimeArea) {
        this.crimeArea = crimeArea;
    }

    public String getCrimeName() {
        return crimeName;
    }

    public void setCrimeName(String crimeName) {
        this.crimeName = crimeName;
    }

    @Override
    public String toString() {
        return "Criminal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", identifyingMarks='" + identifyingMarks + '\'' +
                ", crimeArea='" + crimeArea + '\'' +
                ", crimeName='" + crimeName + '\'' +
                '}';
    }
}


