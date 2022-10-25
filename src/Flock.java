import java.util.ArrayList;
import java.util.Random;

public class Flock {
    private ArrayList<Animal> flock;

    public int getSizeOfFlock(){
        return this.flock.size();
    }
    public Flock(AnimalType type) {
        long seed = System.currentTimeMillis();
        Random rnd  = new Random(seed);
        int count = rnd.nextInt(1,11);
        ArrayList<Animal> result = new ArrayList<>();
        for(int i = 0; i < count; i++){
            Color breed = getRandomBreed(rnd.nextInt(3));
            if (type == AnimalType.DOG){
                DogBreed temp = new DogBreed(breed);
                result.add(temp);
            }
            else {
                CatBreed temp = new CatBreed(breed);
                result.add(temp);
            }
        }
        this.flock =  result;
    }

    public String getStringOfBreed() {
        StringBuilder result = new StringBuilder();
        for (Animal item : this.flock) {
            if (item instanceof DogBreed) {
                result.append(((DogBreed) item).getBreedStr());
                result.append(", ");
            } else {
                result.append(((CatBreed) item).getBreedStr());
                result.append(", ");
            }
        }
        return result.substring(0, result.length()-2);
    }

    private Color getRandomBreed(int seed) {
        return switch (seed) {
            case 0 -> Color.BLUE;
            case 1 -> Color.GREEN;
            case 2 -> Color.RED;
            default -> Color.NONE;
        };
    }
}