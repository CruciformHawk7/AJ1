import java.io.*;

class Measure {
    int feet;
    double inches;

    Measure() {
        feet = 0;
        inches = 0;
    }

    Measure(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public String toString()  {
        String out = "";
        if (feet == 1) out += (feet + " foot, ");
        else out+= (feet + " feet, ");
        out += (inches + " inch");
        if (inches!=1) out+="es";
        out+= ".";
        return out;
    }

    public Measure add(Measure another) {
        Measure out = new Measure();
        out.feet = this.feet + another.feet;
        out.inches = this.inches + another.inches;
        return out;
    }

    public Measure multiply(Measure another) {
        Measure out = new Measure();
        out.feet = this.feet * another.feet;
        out.inches = this.inches * another.inches;
        return out;
    }
}

public class MeasureTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Measure measure1, measure2, sum, product;
        int inputFeet;
        double inputInches;

        System.out.println("Enter for Measure 1: ");
        System.out.println("Feet: ");
        inputFeet = Integer.parseInt(br.readLine());
        System.out.println("Inches: ");
        inputInches = Double.parseDouble(br.readLine());
        measure1 = new Measure(inputFeet,inputInches);

        System.out.println("Enter for Measure 2: ");
        System.out.println("Feet: ");
        inputFeet = Integer.parseInt(br.readLine());
        System.out.println("Inches: ");
        inputInches = Double.parseDouble(br.readLine());
        measure2 = new Measure(inputFeet,inputInches);

        sum = measure1.add(measure2);
        product = measure1.multiply(measure2);
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);

    }
}