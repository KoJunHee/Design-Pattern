package adapterPattern;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }
    public void fly(){
        turkey.fly();
    }

}


