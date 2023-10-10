import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] group = new Student[18];
        int i = 0;
        group[i] = new Student("Beksultan", "Aldebayev");
        i++;
        group[i] = new Student("Erzen", "Arman");
        i++;
        group[i] = new Student("Aruzhan", "Asset");
        i++;
        group[i] = new Student("Damir", "Baigenzhin");
        i++;
        group[i] = new Student("Dauren", "Bekuzakov");
        i++;
        group[i] = new Student("Bekzat", "Kanay");
        i++;
        group[i] = new Student("Mukhammed", "Kaskyrbayev");
        i++;
        group[i] = new Student("Aset", "Kuanyshbayev");
        i++;
        group[i] = new Student("Daiana", "Kuljanova");
        i++;
        group[i] = new Student("Nurbakyt", "Lesbek");
        i++;
        group[i] = new Student("Eskendir", "Ramazanov");
        i++;
        group[i] = new Student("Ramin", "Sagandykov");
        i++;
        group[i] = new Student("Tileukhan", "Seifulla");
        i++;
        group[i] = new Student("Ersultan", "Serimbetov");
        i++;
        group[i] = new Student("Taiyr", "Taishanov");
        i++;
        group[i] = new Student("Adilkhan", "Yeslyambek");
        i++;
        group[i] = new Student("Sayat", "Zeitkazy");
        i++;
        group[i] = new Student("Madiyar", "Zhanzhigitov");
        i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Which student you want to make a monitor of group SE-2210");
        System.out.println("Note: Type number to choose");
        for (int j = 0; j < 18; j++) {
            System.out.println(j + 1 + ". " + group[j].getName() + " " + group[j].getSurname());
        }
        int ch = sc.nextInt();
        Monitor monitor = Monitor.getMonitor(group[ch - 1].getName(), group[ch - 1].getSurname());
        System.out.println("Monitor now is " + monitor.getName() + " " + monitor.getSurname());
    }
}