import java.util.Objects;

public class Ravenclaw extends hogwarts{
    protected int mind;
    protected int wisdom;
    protected int wit;
    protected int creativity;


    public void getMassage(){
        System.out.println("Это - " + nameSurname +  ". Баллы за ум: " + mind
                + ". Баллы за мудрость: " + wisdom + ". Баллы за остроумие: " + wit + ". Баллы за креативность: " + creativity +
                ". Мощность колдовства: " + witchcraftPower +". Трансгрессия на "
                + transgressionDistance + " км." );

    }

    public void compareRavenclaw(Ravenclaw person1, Ravenclaw person2){
        int sumCategory1 = person1.mind + person1.wisdom + person1.wit + person1.creativity;
        int sumCategory2 = person2.mind + person2.wisdom + person2.wit + person2.creativity;
        if (sumCategory1 > sumCategory2){
            System.out.println(person1.nameSurname + " лучший Когтевранец, чем " + person2);
        } else if (sumCategory2 > sumCategory1){
            System.out.println(person2.nameSurname + " лучший Когтевранец, чем " + person1);
        }else {
            System.out.println(person1.nameSurname + " и " + person2 + " равноценные Когтевранцы.");
        }
    }

    public Ravenclaw(String nameSurname,int witchcraftPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity){
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
        if (mind >= 0){
            this.mind = mind;
        } else {
            this.mind = Math.abs(mind);
        }
        if (wisdom >= 0){
            this.wisdom = wisdom;
        } else {
            this.wisdom = Math.abs(wisdom);
        }
        if (wit >= 0){
            this.wit = wit;
        } else {
            this.wit = Math.abs(wit);
        }
        if (creativity >= 0){
            this.creativity = creativity;
        } else {
            this.creativity = Math.abs(creativity);
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +

                ", nameSurname='" + nameSurname + '\'' +
                ", witchcraftPower=" + witchcraftPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
