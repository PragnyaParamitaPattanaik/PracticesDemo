package Array;

public class Whitespace {
    public static void main(String[] args) {
        String str = " i am a student ";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
