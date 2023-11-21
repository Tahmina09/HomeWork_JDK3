package task3;

public class Pair<T, U> {

    public T getFirst(T first, U second) {
        return first;
    }

    public U getSecond(T first, U second) {
        return second;
    }

    public String toString(T first, U second) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(first + " ");
        stringBuilder.append(second);
        return stringBuilder.toString();
    }
}
