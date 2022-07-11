package lesson7.Tours;

public class Tour {
    private int id;
    private String[] countries = new String[15];
    private int days;
    private String typeOfTransport;
    private int stars;
    private int price;
    private String typeOfService;

    public Tour() {

    }

    public Tour(int id, int days, String typeOfTransport, int stars, int price, String typeOfService) {
        this.id = id;
        this.days = days;
        this.stars = stars;
        this.typeOfService = typeOfService;
        this.typeOfTransport = typeOfTransport;
        this.price = price;
    }

    public void addCountry(String country) {
        //добавляет в массив страны
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null){
                countries[i] = country;
                break;
            }
        }

    }

}
