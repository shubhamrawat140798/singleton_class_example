//WAP to create a singleton class.
public class Main {
    public static void main(String[] args) {

        System.out.println("\nCompile by Shubham Singh Rawat");
        singleton a =singleton.getInstance();
        singleton b =singleton.getInstance();
        System.out.println("Hashcode of a: "+a.hashCode());
        System.out.println("Hashcode of b: "+b.hashCode());
    }
}

class singleton{
    private static singleton instance= null;
    public String str;
    private singleton(){
        str="Singleton Class";
    }
    public static singleton getInstance(){
        if (instance==null)
            instance = new singleton();
        return instance;
    }
}
