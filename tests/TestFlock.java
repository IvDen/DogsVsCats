import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class TestFlock {

    @RepeatedTest(50)
    void checkSizeOfFlock(){
        Flock catFlock = new Flock(AnimalType.CAT);
        Flock dogFlock = new Flock(AnimalType.DOG);
        assertTrue(catFlock.getSizeOfFlock() <= 10 && catFlock.getSizeOfFlock() >= 1);
        assertTrue(dogFlock.getSizeOfFlock() <= 10 && dogFlock.getSizeOfFlock() >= 1);
    }

    @RepeatedTest(50)
    void checkBreed(){
        Flock catFlock = new Flock(AnimalType.CAT);
        Flock dogFlock = new Flock(AnimalType.DOG);
        assertTrue(catFlock.getCollection().stream().anyMatch(item -> !Objects.equals(((CatBreed) item).getBreedStr(), "нет данных")));
        assertTrue(dogFlock.getCollection().stream().anyMatch(item -> !Objects.equals(((DogBreed) item).getBreedStr(), "нет данных")));
    }
}
