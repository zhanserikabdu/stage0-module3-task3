package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        System.out.println(first);
        int second = 10;
        System.out.println(second);
        int third = 100;
        System.out.println(third);
        int linkToFirst;
        linkToFirst = first = 15;
        System.out.println( linkToFirst);
        int linkToSecond;
        linkToSecond = second = 6;
        System.out.println( linkToSecond);
        int linkToThird;
        linkToThird = third = 4;
        System.out.println( linkToThird);

    }
}
