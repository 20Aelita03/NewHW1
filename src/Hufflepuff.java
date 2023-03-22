import java.util.Objects;

public class Hufflepuff extends hogwarts{
 protected int industriousness;
 protected int loyalty;
 protected int honesty;

    public void getMassage(){
        System.out.println("Это - " + nameSurname +  ". Баллы за трудолюбие: " + industriousness
                + ". Баллы за верность: " + loyalty + ". Баллы за честность: " + honesty + ". Мощность колдовства: " + witchcraftPower +". Трансгрессия на "
                + transgressionDistance + " км." );

}
    public void compareHufflepuff(Hufflepuff person1, Hufflepuff person2){
        int sumCategory1 = person1.industriousness + person1.loyalty + person1.honesty;
        int sumCategory2 = person2.industriousness + person2.loyalty + person2.honesty;
        if (sumCategory1 > sumCategory2){
            System.out.println(person1.nameSurname + " лучший Пуффендуец, чем " + person2);
        } else if (sumCategory2 > sumCategory1){
            System.out.println(person2.nameSurname + " лучший Пуффендуец, чем " + person1);
        }else {
            System.out.println(person1.nameSurname + " и " + person2 + " равноценные Пуффендуйцы.");
        }
    }
public Hufflepuff(String nameSurname,  int witchcraftPower, int transgressionDistance, int industriousness, int loyalty, int honesty){
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
    if (industriousness >= 0){
        this.industriousness = industriousness;
    } else {
        this.industriousness = Math.abs(industriousness);
    }
    if (loyalty >= 0){
        this.loyalty = loyalty;
    } else {
        this.loyalty = Math.abs(loyalty);
    }
    if (honesty >= 0){
        this.honesty = honesty;
    } else {
        this.honesty = Math.abs(honesty);
    }
}

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +

                ", nameSurname='" + nameSurname + '\'' +
                ", witchcraftPower=" + witchcraftPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
