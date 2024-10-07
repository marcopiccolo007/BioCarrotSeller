import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instance pro uložení informací pro 1. prodejce
        CarrotSeller firstCarrotSeller = new CarrotSeller();
        firstCarrotSeller.setBirthDate(LocalDate.of(1988,05, 03));
        //System.out.println(firstCarrotSeller.getBirthDate());
        firstCarrotSeller.setName("Květoslav Zahrádka");
        firstCarrotSeller.setAddress("U průhonu 28, Malé Kyšice, 273 51");
        //System.out.println(firstCarrotSeller.getAddress());
        //vypsani jmena 1. prodejce na konzoli
        System.out.print("Jméno prvního prodejce: " );
        System.out.println(firstCarrotSeller.getName());
        //instance pro uložení informací pro 2 prodejce
        CarrotSeller secondCarrotSeller = new CarrotSeller();
        secondCarrotSeller.setName("Rostislav Malina");
        secondCarrotSeller.setAddress("Mezi ploty 25, Rumburk, 365 18");
        //vypsani jmena 2. prodejce na konzoli
        System.out.print("Jméno druhého prodejce: " );
        System.out.println(secondCarrotSeller.getName());
    }
}