package DesignPatterns.Factory.AbstractFactoryPattern;

public class SourceDataFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("reads from file and ingests data");
    }
}
