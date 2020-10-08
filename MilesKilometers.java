

public class MilesKilometers {

    public static void main(String[] args) {

        System.out.println("miles   kilometers");

        for (byte i = 1; i <= 10; i++) {
            // byte miles = i;
            double kilometers = i * 1.609;

            System.out.println(i + "\t" + kilometers);
        }
    }

}