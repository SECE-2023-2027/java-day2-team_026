public class Replace {
    public static void main(String[] args) {
        String str = "Java is famous than Python";
        str = str.replace("Java", "TEMP");
        str = str.replace("Python", "Java");
        str = str.replace("TEMP", "Python");
        System.out.println(str);
    }
}
