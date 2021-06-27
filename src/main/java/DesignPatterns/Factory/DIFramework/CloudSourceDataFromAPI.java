package DesignPatterns.Factory.DIFramework;

public class CloudSourceDataFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("CLOUD: pull data from api and ingest");
    }
}
