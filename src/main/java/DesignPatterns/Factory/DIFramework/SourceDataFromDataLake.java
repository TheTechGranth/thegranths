package DesignPatterns.Factory.DIFramework;

public class SourceDataFromDataLake implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("get data from data lake and ingest");
    }
}
