package DesignPatterns.Factory.FactoryMethodPattern;

public class SourceDataFromDataLake implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("get data from data lake and ingest");
    }
}
