package DesignPatterns.Singleton;

import java.io.Serializable;

class Singleton implements Cloneable, Serializable {
    private volatile static Singleton singletonObject;
    private Singleton() {
        if(singletonObject!= null)
            throw new IllegalStateException("Object already created");
    }
    public static Singleton getInstance() {
        if(singletonObject == null) {
            synchronized(Singleton.class){
                if(singletonObject == null) {
                    singletonObject = new Singleton();
                }
            }
        }
        return singletonObject;
    }
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected Object readResolve(){
        return singletonObject;
    }
    public void doSomeWork(){
        // do some work
    }
}

