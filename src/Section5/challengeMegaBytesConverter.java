package Section5;

public class challengeMegaBytesConverter {
    public static void main(String [] args) {
    printMegaBytesAndKiloBytes(-5);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int diveder = 1024;
        if(kiloBytes >= 0) {
            int reminderkiloBytes = kiloBytes % diveder;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + " MB and " + reminderkiloBytes + "KB"   );
        } else{
            System.out.println("Invalid Value");
        }
    }
}
