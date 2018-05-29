package builderPattern;

public class TestBuilderPattern {
    public static void main(String... args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(3, 5).calories(300).carbohydrate(987).fat(1000).sodium(234).build();
        System.out.println(nutritionFacts.toString());
    }
}
