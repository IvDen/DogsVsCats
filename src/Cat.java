public class Cat extends Animal {

    public Cat(){
        super(4, true);
        this.say();
    }

    @Override
    public void say() {
        System.out.println("мяу");
    }

}
