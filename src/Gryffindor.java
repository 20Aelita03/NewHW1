import java.util.Objects;

public class Gryffindor extends hogwarts{

    protected int nobility;
    protected int honor;
    protected int bravery;

public void compareGryffindor(Gryffindor person1, Gryffindor person2){
int sumCategory1 = person1.nobility + person1.honor + person1.bravery;
int sumCategory2 = person2.nobility + person2.honor + person2.bravery;
if (sumCategory1 > sumCategory2){
    System.out.println(person1.nameSurname + " лучший Гриффиндорец, чем " + person2);
} else if (sumCategory2 > sumCategory1){
    System.out.println(person2.nameSurname + " лучший Гриффиндорец, чем " + person1);
}else {
    System.out.println(person1.nameSurname + " и " + person2 + " равноценные Гриффиндорцы.");
}
}

    public void getMassage(){
        System.out.println("Это - " + nameSurname +  ". Баллы за благородство: " + nobility
        + ". Баллы за честь: " + honor + ". Баллы за храбрость: " + bravery + ". Мощность колдовства: " + witchcraftPower +". Трансгрессия на "
                + transgressionDistance + " км." );
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +

                ", nameSurname='" + nameSurname + '\'' +
                ", witchcraftPower=" + witchcraftPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public Gryffindor(String nameSurname, int witchcraftPower, int transgressionDistance, int nobility, int honor, int bravery){
        if(nameSurname.isEmpty() || nameSurname.isBlank()){
            this.nameSurname = "Имя и Фамилия";
        } else {
            this.nameSurname = nameSurname;
        }

       // if(faculty.isEmpty() || faculty.isBlank()){
       //     this.faculty = "Гриффиндор";
       // } else {
        //    this.nameSurname = faculty;
       // }

        if (witchcraftPower >= 0){
            this.witchcraftPower = witchcraftPower;
        } else {
            this.witchcraftPower = Math.abs(witchcraftPower);
        }
        if (transgressionDistance >= 0){
            this.transgressionDistance = transgressionDistance;
        } else {
            this.transgressionDistance = Math.abs(transgressionDistance);
        }
        if (nobility >= 0){
            this.nobility = nobility;
        } else {
            this.nobility = Math.abs(nobility);
        }
        if (honor >= 0){
            this.honor = honor;
        } else {
            this.honor = Math.abs(honor);
        }
        if (bravery >= 0){
            this.bravery = bravery;
        } else {
            this.bravery = Math.abs(bravery);
        }



    }
}
