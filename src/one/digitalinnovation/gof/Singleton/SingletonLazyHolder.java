package one.digitalinnovation.gof.Singleton;

public class SingletonLazyHolder {
    private static class IntanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    public SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return IntanceHolder.instancia;
    }
}
