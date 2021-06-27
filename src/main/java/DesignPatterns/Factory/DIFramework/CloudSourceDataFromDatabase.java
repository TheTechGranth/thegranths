package DesignPatterns.Factory.DIFramework;

public class CloudSourceDataFromDatabase implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("CLOUD: source data from database and ingest in cloud storage");
    }
}
