public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call("hello");
        Mobile iphone = new Mobile("iphonemobile", "red", "iPhone");
        iphone.call("hello");
        Mobile andriod = new Mobile("andriod phone", "red", "andriod");
        andriod.call("hello");
        Mobile iphone1 = new Iphone();

    }
}
