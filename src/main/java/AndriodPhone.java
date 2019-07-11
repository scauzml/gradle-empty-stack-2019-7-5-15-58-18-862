public class AndriodPhone extends Mobile {

    public AndriodPhone(String name, String color, String brand, int limitLength) {
        super(name, color, brand, limitLength);
    }

    @Override
    public void call(String message) {
        if(message.length()>this.limitLength){
            System.out.println("<Andriod> Message cannot be sent");
        }else {
            System.out.println("<"+super.brand+">Message:["+message+"]");
        }

}
}
