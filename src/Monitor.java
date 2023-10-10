public class Monitor {
    private static Monitor monitor;
    private final String name;
    private final String surname;

    private Monitor(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public static Monitor getMonitor(String name, String surname){
        if (monitor == null){
            monitor = new Monitor(name, surname);
        }
        return monitor;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
