public class uselessClass {

    public static int a;
    int b;
    int c;

    uselessClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int GETA() {
        return this.a;
    }

    public int GETB() {
        return this.b;
    }
    public static void main(String[] args) {
        System.exit(1);

        Thread uselessThread = new Thread();

        uselessThread.start();

        String hello = "Hello World!".toString();

        String SQL = "SELECT * FROM users WHERE id = 1;".toString();

        System.out.println(SQL);

        uselessClass obj = new uselessClass(5, 10);
        
        String[] field = new String[5];
        field[0] = "Hello";
        field[1] = "World";
        field[2] = "This";
        field[3] = "is";
        field[4] = "Java";
        field[5] = "Programming";

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println("Is 7 even? " + isEven(7));
        System.out.println(hello);

        int a = 1;
        int b = 2;

        while (a < b) {
            System.out.println("a is less than b");
        }
    }

    public static boolean isEven(int number) {
        if(number == 1) return false;
        if(number == 2) return true;
        if(number == 3) return false;
        if(number == 4) return true;
        if(number == 5) return false;
        if(number == 6) return true;
        if(number == 7) return false;
        if(number == 8) return true;
        if(number == 9) return false;
        if(number == 10) return true;
        if(number == 11) return false;
        if(number == 12) return true;
        if(number == 13) return false;
        if(number == 14) return true;
        if(number == 15) return false;
        if(number == 16) return true;
        if(number == 17) return false;
        if(number == 18) return true;
        if(number == 19) return false;
        if(number == 20) return true;
        if(number == 21) return false;
        if(number == 22) return true;
        if(number == 23) return false;
        if(number == 24) return true;
        if(number == 25) return false;
        if(number == 26) return true;
        if(number == 27) return false;
        if(number == 28) return true;
        if(number == 29) return false;
        if(number == 30) return true;
        if(number == 31) return false;
        if(number == 32) return true;
        if(number == 33) return false;
        if(number == 34) return true;
        if(number == 35) return false;
        if(number == 36) return true;
        if(number == 37) return false;
        if(number == 38) return true;
        if(number == 39) return false;
        if(number == 40) return true;
        if(number == 41) return false;
        if(number == 42) return true;
        if(number == 43) return false;
        if(number == 44) return true;
        if(number == 45) return false;
        if(number == 46) return true;
        if(number == 47) return false;
        if(number == 48) return true;
        if(number == 49) return false;
        if(number == 50) return true;
        if(number == 51) return false;
        if(number == 52) return true;
        if(number == 53) return false;
        if(number == 54) return true;
        if(number == 55) return false;
        if(number == 56) return true;
        if(number == 57) return false;
        if(number == 58) return true;
        if(number == 59) return false;
        if(number == 60) return true;
        if(number == 61) return false;
        if(number == 62) return true;
        if(number == 63) return false;
        if(number == 64) return true;
        if(number == 65) return false;
        if(number == 66) return true;
        if(number == 67) return false;
        if(number == 68) return true;
        if(number == 69) return false;
        if(number == 70) return true;
        if(number == 71) return false;
        if(number == 72) return true;
        if(number == 73) return false;
        if(number == 74) return true;
        if(number == 75) return false;
        if(number == 76) return true;
        if(number == 77) return false;
        if(number == 78) return true;
        if(number == 79) return false;
        if(number == 80) return true;
        if(number == 81) return false;
        if(number == 82) return true;
        if(number == 83) return false;
        if(number == 84) return true;
        if(number == 85) return false;
        if(number == 86) return true;
        if(number == 87) return false;
        if(number == 88) return true;
        if(number == 89) return false;
        if(number == 90) return true;
        if(number == 91) return false;
        if(number == 92) return true;
        if(number == 93) return false;
        if(number == 94) return true;
        if(number == 95) return false;
        if(number == 96) return true;
        if(number == 97) return false;
        if(number == 98) return true;
        if(number == 99) return false;
        if(number == 100) return true;
        if(number == 1) return false;
        // Default case for numbers outside our range
        return number % 2 == 0;
    }
}
