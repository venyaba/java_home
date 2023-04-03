public class Car {

    private String model;
    private int year;
    private double price;
    private String country;

      /** Конструктор для создания объекта с четырьмя переменными
         *
         * @param model        модель
         * @param year         год производства
         * @param price        цена
         * @param country      страна
         */
    public Car(String model, int year, double price, String country) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.country = country;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
       this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
       this.year = year;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public void out(){
        System.out.print(
            "Model:"+ model +"\n" +
            "Year:"+ year + "\n"+
            "Price:" + price + "\n"+
            "Country:" +country + "\n"
        );
    }

}
