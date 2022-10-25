public abstract class Animal {
    protected int pawsCount;
    protected boolean hasTail;

    public Animal(int pawsCount, boolean hasTail){
        this.pawsCount = pawsCount;
        this.hasTail = hasTail;
    }

    protected abstract void  say();

}
