import java.util.Objects;

public class Slytherin extends hogwarts{
    protected int cunning;
    protected int determination;
    protected int ambition;
    protected int resourcefulness;
    protected int lustForPower;

    public void getMassage(){
        System.out.println("Это - " + nameSurname  + ". Баллы за хитрость: " + cunning
                + ". Баллы за решительность: " + determination + ". Баллы за амбициозность: " + ambition + ". Баллы за находчивость: "
                + resourcefulness + ". Баллы за жажду власти:" + lustForPower + ". Мощность колдовства: " + witchcraftPower +". Трансгрессия на "
                + transgressionDistance + " км." );

    }

    public void compareSlytherin(Slytherin person1, Slytherin person2){
        int sumCategory1 = person1.cunning + person1.determination + person1.ambition + person1.resourcefulness + person1.lustForPower;
        int sumCategory2 = person2.cunning + person2.determination + person2.ambition + person2.resourcefulness + person2.lustForPower;
        if (sumCategory1 > sumCategory2){
            System.out.println(person1.nameSurname + " лучший Когтевранец, чем " + person2);
        } else if (sumCategory2 > sumCategory1){
            System.out.println(person2.nameSurname + " лучший Когтевранец, чем " + person1);
        }else {
            System.out.println(person1.nameSurname + " и " + person2 + " равноценные Когтевранцы.");
        }
    }

    public Slytherin(String nameSurname,  int witchcraftPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower){
        if(nameSurname.isEmpty() || nameSurname.isBlank()){
            this.nameSurname = "Имя и Фамилия";
        } else {
            this.nameSurname = nameSurname;
        }


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
        if (cunning >= 0){
            this.cunning = cunning;
        } else {
            this.cunning = Math.abs(cunning);
        }
        if (determination >= 0){
            this.determination = determination;
        } else {
            this.determination = Math.abs(determination);
        }
        if (ambition >= 0){
            this.ambition = ambition;
        } else {
            this.ambition = Math.abs(ambition);
        }
        if (resourcefulness >= 0){
            this.resourcefulness = resourcefulness;
        } else {
            this.resourcefulness = Math.abs(resourcefulness);
        }
        if (lustForPower >= 0){
            this.lustForPower = lustForPower;
        } else {
            this.lustForPower = Math.abs(lustForPower);
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, lustForPower);
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +

                ", nameSurname='" + nameSurname + '\'' +
                ", witchcraftPower=" + witchcraftPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
