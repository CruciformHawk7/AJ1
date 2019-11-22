class FirstClass {
    FirstClass() {
        System.out.println("From the first class!");
        System.out.println(getSecretMessage());
    }
    private String getSecretMessage() {
        return "This is the secret message!";
    }
    public String getPublicMessage() {
        return "This is public message!";
    }
}

class SecondClass extends FirstClass {
    SecondClass() {
        System.out.println("From the second class!");
        System.out.println("From First class, ");
        // System.out.println(super.getSecretMessage()); Illegal
        System.out.println(super.getPublicMessage());
    }
    public String getPublicMessage() {
        return "Second class interrupted public message!";
    }
}

final class ThirdClass extends SecondClass {
    ThirdClass() {
        System.out.println("From the third class!");
        System.out.println("From second class: ");
        System.out.println(super.getPublicMessage());
    }
}

//class FourthClass extends ThirdClass { }

public class MultilevelTest {
    public static void main(String[] args) {
        FirstClass t = new FirstClass();
        System.out.println();
        t = new SecondClass();
        System.out.println();
        t = new ThirdClass();
    }
}

