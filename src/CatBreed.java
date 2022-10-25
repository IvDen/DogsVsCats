public class CatBreed extends Cat {
    private Color breed;

    public CatBreed(Color breed){
        this.breed = breed;
    }

    public String getBreedStr(){
        return switch (this.breed){
            case GREEN -> "зеленый";
            case BLUE -> "синий";
            case RED -> "красный";
            case NONE -> "нет данных";
        };
    }
}
