public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  makeACall(Mobile mobile,String message){
        if (this.name == "IPhoneRobot") {
            if (mobile instanceof Iphone) {
                mobile.call(message);
            }
        }else {
            mobile.call(message);
        }

    }
}
