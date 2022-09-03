import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        String A = "a";
        String B = "b";
        String C = "c";
        String D = "d";

        String[] first = new String[4];
//        String[] second = new String{"a","b","c","d"};
//        String[] third = new String[]{"a","b","c","d"};

        first[0]="a";
        first[1]="b";
        first[2]="c";
        first[3]="d";

        int size1 = first.length;
//        int size2 = second.length;
//        int size3 = third.length;



        System.out.println("length of first : "+size1);
//        System.out.println("length of second : "+size2);
//        System.out.println("length of third : "+size3);

        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
    }
}