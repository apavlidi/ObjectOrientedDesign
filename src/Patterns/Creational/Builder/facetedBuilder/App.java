package Patterns.Creational.Builder.facetedBuilder;

public class App {

    public static void main(String[] args) {
        StudentBuilderFacade builderFacade = new StudentBuilderFacade();

        Student student = builderFacade
                .info()
                    .firstName("alexis")
                    .lastName("pavlidis")
                    .age(22)
                .lives()
                    .in("Thessaloniki")
                    .at("25 Melou 8")
                    .with("61200")
                .build();

        System.out.println(student);
    }

}
