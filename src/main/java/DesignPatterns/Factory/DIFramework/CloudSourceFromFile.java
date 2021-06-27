package DesignPatterns.Factory.DIFramework;

public class CloudSourceFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("CLOUD: pull data from file and ingest");
    }
}
