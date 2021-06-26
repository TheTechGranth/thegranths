package DesignPatterns.Factory.AbstractFactoryPattern;

public class CloudDataStoreFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("CLOUD: read from api and ingest");
    }
}
