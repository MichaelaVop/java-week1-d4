public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("\t\t\t Multiplication table");

        for(int x = 1; x <= 9; x++) {
            System.out.print("\t" + x);
        }

        System.out.println("\n" + "---------------------------------------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j <= 9; j++) {
                if(j == 9) {
                    System.out.print("\t" + (i * j) + "\n");
                } else {
                    System.out.print("\t" + (i * j));
                }
                
            }
        }
        
    }
}