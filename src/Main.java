

public class Main {
    public static void main(String[] args) {
        Flock dogFlock = new Flock(AnimalType.DOG);
        Flock catFlock = new Flock(AnimalType.CAT);

        System.out.printf("Создалось %s собак (%s)\n", dogFlock.getSizeOfFlock(), dogFlock.getStringOfBreed());
        System.out.printf("Создалось %s кошек (%s)\n", catFlock.getSizeOfFlock(), catFlock.getStringOfBreed());

        if (dogFlock.getSizeOfFlock() > catFlock.getSizeOfFlock()){
            System.out.println("Итог: выиграли собаки");
        } else if (dogFlock.getSizeOfFlock() < catFlock.getSizeOfFlock()) {
            System.out.println("Итог: выиграли коты");
        }
        else System.out.println("Итог: ничья");
    }

}