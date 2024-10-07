import java.time.LocalDate;

public class CarrotSeller {
    //atributy
    private String name; //jméno prodejce
    private String address; //celá adresa prodejce (ulice/mesto/psc)
    private LocalDate birthDate; //Datum narození prodejce
    private int numberOfConcludedContracts; //Počet dosud sjednaných smluv
    private double totalWeightOfSoldCarrots; //Celkové množství prodané mrkve v tunách
    private String addressCity; //adresa - město
    private String stateRegistrationPlate; //Registrační značka vozidla („SPZ“)
    private double averageFuelConsumption; //Spotřeba vozidla v litrech na 100km
    //přístupové metody

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}