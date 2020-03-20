##### 单例设计模式复盘

noe lazy 
```
public class Mgr01 {

    private static Mgr01 Instance = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return Instance;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);

    }
}
```

优点：线程安全；缺点：类加载的时候已经实例化，浪费空间


lazy
 
```
public class Mgr02{
    private static Mgr02 instance;
    
    private Mgr02(){}

    public static Mgr02 getInstance(){
        if(instance == null){
            instance = new mgr02();
   
        }
        return instance;    
    }    
}
```

线程不安全，给方法加锁

```
public class Mgr02{
    private static Mgr02 instance;
    
    private Mgr02(){}

    public static synchronized  Mgr02 getInstance(){
        if(instance == null){
            instance = new mgr02();   
        }
        return instance;    
    }    
}
```
由于将synchronized关键字加在方法上会造成线程阻塞(同步)，
在性能上会大打折扣。所以使用双重校验锁(在保证线程安全的同时提高了性能。)


```
public class Mgr02{
    private static Mgr02 instance;
    private Mgr02(){}
    public static Mgr02 getInstance(){
        if(instance == null){
            synchronized(Mgr02.class){
            
            if (instance == null){
                instance = new Mgr02();        
                }
            }    
        }
        return instance;
    }
}
```


