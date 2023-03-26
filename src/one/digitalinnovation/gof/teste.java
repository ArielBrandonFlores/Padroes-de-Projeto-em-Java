package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.*;

public class teste {

    public static void main(String[] args) {
        //Teste Desing Pattern Singleton:
    SingletonLazy lazy = SingletonLazy.getInstance();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);
    eager = SingletonEager.getInstance();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);

    //Teste de Strategy
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();
    //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ariel","17418497545");

    }
}
