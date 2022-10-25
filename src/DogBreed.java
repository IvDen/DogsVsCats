public class DogBreed extends Dog {
    private Color breed;

    public DogBreed(Color breed) {
        this.breed = breed;
    }

    public String getBreedStr() {
        return switch (this.breed) {
            case GREEN -> "зеленый";
            case BLUE -> "синий";
            case RED -> "красный";
            case NONE -> "нет данных";
        };
    }
}