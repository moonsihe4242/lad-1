import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        ProcessBuilder a = new ProcessBuilder("C:\\Ewm-praktikum\\ewm_project.exe");
        Process pr = a.start();
        ProcessBuilder b = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        Process pr1 = b.start();
        ProcessBuilder c = new ProcessBuilder("C:\\EMU8086\\emu8086.exe");
        Process pr2 = c.start();
        long a1 = pr.pid();
        long a2 = pr1.pid();
        long a3 = pr2.pid();
        String z = pr.info().command().get();
        String o = pr1.info().command().get();
        String v = pr2.info().command().get();
        System.out.println(z);
        System.out.println(a1);
        System.out.println(o);
        System.out.println(a2);
        System.out.println(v);
        System.out.println(a3);
        System.out.println("Завершить процессы?");
        if (scan.nextLine().trim().equalsIgnoreCase("да")){
            pr.destroyForcibly();
            pr1.destroyForcibly();
            pr2.destroyForcibly();
        }
    }
}