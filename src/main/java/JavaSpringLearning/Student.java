package JavaSpringLearning;

public class Student {
    String Id;
    String Name;
    String Year;


    public Student() {

    }

    public Student(String id, String name, String year) {
        Id = id;
        Name = name;
        Year = year;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
