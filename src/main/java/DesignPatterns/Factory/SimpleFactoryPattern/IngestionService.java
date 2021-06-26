package DesignPatterns.Factory.SimpleFactoryPattern;

public class IngestionService {
    private FactoryOfSource factoryOfSource;

    public IngestionService(FactoryOfSource factoryOfSource) {
        this.factoryOfSource = factoryOfSource;
    }

    public void ingestDataToMyDatabase(String source){

        //SourceDataFromFile sourceDataFromFile = new SourceDataFromFile();
        IngestToDatabase sourceObject = factoryOfSource.getInstanceOfSource(source);
        sourceObject.ingestData();
    }
}
