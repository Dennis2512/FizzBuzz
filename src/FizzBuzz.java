
public class FizzBuzz {

    public static void main(String[] args) {

        zahlenAusgeben();

    }

    public static int zahlenAusgeben() {

        int fizz = 0;
        int buzz = 0;
        int zahlen;
        for(int i = 1; i <= 100; i++){
            zahlen = i;
            if(zahlen % 3 == 0 && zahlen % 5 == 0){
                System.out.println("fizzbuzz");
            } else if(zahlen % 3 == 0 && zahlen % 5 != 0) {
                System.out.println("fizz");
                fizz++;
            } else if(zahlen % 5 == 0 && zahlen % 3 != 0){
                System.out.println("buzz");
                buzz++;
            } else {
                System.out.println(zahlen);
            }
        }

        return fizz+buzz;

    }

}
