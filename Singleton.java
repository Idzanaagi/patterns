public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setUp() {
        System.out.println("setUp");
    }

    public void readInstance() {
        System.out.println(instance.hashCode());
        System.out.println(instance);
    }
}

/*
public class SingletonTest {
    public static void main(String[] args) {
       NewSingleton newSingleton = NewSingleton.getInst();
       newSingleton.create();
    }
}
 */
