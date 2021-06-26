package DesignPatterns.Factory.SimpleFactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryOfSource factoryOfSource = new FactoryOfSource();
        IngestionService ingestionService = new IngestionService(factoryOfSource);
        ingestionService.ingestDataToMyDatabase("API");
    }
}
