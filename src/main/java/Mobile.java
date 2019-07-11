public class Mobile {
    public String name;
    public String color;
    public String brand;
    public int limitLength;
    public Mobile() {
    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;

    }

    public Mobile(String name, String color, String brand, int limitLength) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.limitLength = limitLength;
    }

    public int getLimitLength() {
        return limitLength;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void call(String message){

        System.out.println("Message:["+message+"]");



    }
}
