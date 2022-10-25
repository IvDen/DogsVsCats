public class Dog extends Animal{

    public Dog(){
        super(4,true);
        this.say();
    }

    @Override
    public void say() {
        System.out.println("гав");
    }


}
