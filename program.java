/**
 * program
 */
public class program {

    public static void main(String[] args) {
        System.out.println("bye world"); //sys снипет
        int a = '3';
        double d = 5;
        float f = 4.2f;
        long l = 34;
        short s = 2;
        byte b = 12;
        boolean bool = true;

        char ch = 'g';
        ch = 12;


        String str = "Hello";
        String str2 = new String("Qwerty");

        int[] ints = new int[10]; //320 байтё
        ints[4] = ints[1] = 6;

        if (a <= 9) {    //ifn
            a = 2; 
        } else if (a > 10) {  //elsei
            a = 10;
        } else {a = 0;

        for (int i = 0; i < 10; i++, a++) { 
        }   //fori
        
        
        for (int i: ints) {
            System.out.println();
        }

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        if (str.equals("Hello"))  System.out.println(String.valueOf(true));
        else System.out.println(String.valueOf(false));

        str.charAt(str.length()/2);


        str.replace("+", "plus");
        System.out.println(str.replace("+", "plus"));

        System.out.println(str.compareTo(str2)); //сравнить

        System.out.println("Hello".repeat(5));

        str.concat(str).contains("ooHel");
        str.contains("ooHel");

        String[] tmp = str2.split(" ");
        System.out.println(tmp[0]+" "+tmp[1].toUpperCase().charAt(0)+"."+tmp[2].toUpperCase().charAt(0)+".");
           
        str.trim();
        str.subSequence(2, 5); //вырезать 2 и 5 символ
    } 

}
}
