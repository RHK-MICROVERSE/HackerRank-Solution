/*
 * HackerRank: SINGLETON PATTERN
 * JAVA 15
 * Problem no: 56
 */

 public class SingleTon{
    private Singleton() {}
    public String str;
    private static Singleton singleton;
    static Singleton getSingleInstance() {
        if (singleton == null)
            singleton = new Singleton();
        
        return singleton;
    }
 }