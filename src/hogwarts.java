import java.util.Objects;

public class hogwarts {
    protected String nameSurname;
    //protected String faculty;

    protected int witchcraftPower;
    protected int transgressionDistance;

    public static void compareStudents(hogwarts person1, hogwarts person2){
        int sum1 = person1.witchcraftPower + person1.transgressionDistance;
        int sum2 = person2.witchcraftPower + person2.transgressionDistance;
        if (sum1 > sum2){
            System.out.println(person1.getNameSurname() + " лучший ученик, чем " + person2.getNameSurname());
        } else if (sum2 > sum1){
            System.out.println(person2.getNameSurname() + " лучший ученик, чем " + person1.getNameSurname());
        }
    }

   // public String getFaculty() {
    //    return faculty;
    //}

   // public void setFaculty(String faculty) {
    //    this.faculty = faculty;
   // }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hogwarts hogwarts = (hogwarts) o;
        return witchcraftPower == hogwarts.witchcraftPower && transgressionDistance == hogwarts.transgressionDistance &&
                Objects.equals(nameSurname, hogwarts.nameSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nameSurname, witchcraftPower, transgressionDistance);
    }

}
