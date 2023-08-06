public interface Bird {

    void doSinging();
    String toString();

}

class Sparrow implements Bird {

    String name;

    public Sparrow(String name){
        this.name = name;
    }
    @Override
    public void doSinging() {
    }

    public void doEating() {
    }

    public String toString(){
        return "Species " + name;
    }
}


class Skylark extends Sparrow implements Bird{

    public Skylark(String name){
        super (name);
    }
    public void doSleep(){};
}

class Main1{
    public static void main(String[] args) {
        Bird bird = new Sparrow("Sparrow");
        bird.doSinging();
        System.out.println(bird);//Sparrow

        Bird bird1 = new Skylark("bird1");
        bird1.doSinging();
        System.out.println(bird1);//bird1

        Skylark skylark = new Skylark("Skylark2");
        skylark.doEating();
        skylark.doSinging();
        skylark.doSleep();
        System.out.println(skylark);//Skylark2
    }
}