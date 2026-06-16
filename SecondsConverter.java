public class SecondsConverter {
    public static void main(String[] args) {
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + secs);
    }
}