package DesignPatterns.Factory.FactoryMethodPattern;

public class SourceDataFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("read from API and ingest");
    }
}
