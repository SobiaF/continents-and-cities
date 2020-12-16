// This program will print out a continent and the largest city in that continent, based on the value of an integer.

public class Continents {

    public static void main(String[] args) {
        int continent = 2;

        switch (continent) {
            case 1:
                System.out.println("Asia: Seoul, South Korea");
                break;
            case 2:
                System.out.println("United Kingdom: London, England");
                break;
            case 3:
                System.out.println("Europe: Amsterdam, The Netherlands");
                break;
            case 4:
                System.out.println("Europe: Madrid, Spain");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Europe: Berlin, Germany");
                break;
            default:
                System.out.println("Undefined continent!");
                break;
        }
    }
}
