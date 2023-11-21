package task3;

public class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer integer = new Integer(30);
        Pair<String, Integer> pairOne = new Pair<>();
        System.out.println(pairOne.getFirst(str, integer));
        System.out.println(pairOne.getSecond(str, integer));
        System.out.println(pairOne.toString(str, integer));
    }
}
