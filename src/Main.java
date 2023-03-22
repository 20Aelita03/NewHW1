public class Main {
    public static void main(String[] args) {
 Gryffindor garry = new Gryffindor("Гарри Поттер",  98, 78,
         69, 64,100);
 garry.getMassage();
 Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 94,33,
         71,91,99);
 germiona.getMassage();
 Gryffindor ron = new Gryffindor("Рон Уизли",  31, 47,
         66, 17, 55);
 ron.getMassage();
Gryffindor.compareStudents(garry,ron);

   Slytherin draco = new Slytherin("Драко Малфой",  85, 67,58,
           77,70,69,90);
   draco.getMassage();
   Slytherin grehem = new Slytherin("Грэхэм Монтегю", 21,16,24,
           13,95,23,22);
   grehem.getMassage();
   Slytherin goel = new Slytherin("Грегори Гойл",  5, 20,60,
           53, 48,2, 14);
   goel.getMassage();
   Slytherin.compareStudents(grehem, draco);

   Hufflepuff zaharia = new Hufflepuff("Захария Смит",  37,67,
           41,82,14);
   zaharia.getMassage();
    Hufflepuff sedrik = new Hufflepuff("Седрик Диггори",  71,32,
            7,16,77 );
    sedrik.getMassage();
    Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли",  19,72,
            41,6,9);
    justin.getMassage();
    Hufflepuff.compareStudents(justin, sedrik);

    Ravenclaw zhou = new Ravenclaw( "Чжоу Чанг",  46, 15,76,
            54,25,4);
    zhou.getMassage();
    Ravenclaw padma = new Ravenclaw("Падма Патил",  62, 7,28,
            35, 14, 38);
    padma.getMassage();
    Ravenclaw markus = new Ravenclaw("Маркус Белби",  46,71,5,
            21,1,41);
    markus.getMassage();
    Ravenclaw.compareStudents(padma,markus);

hogwarts.compareStudents(garry,draco);
    }
}