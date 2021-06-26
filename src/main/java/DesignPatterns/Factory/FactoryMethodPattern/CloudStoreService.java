package DesignPatterns.Factory.FactoryMethodPattern;

public class CloudStoreService implements IngestionService {
    IngestToDatabase sourceSystemObject=null;
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if (source.equals("API"))  sourceSystemObject = new CloudDataStoreFromAPI();
        else if (source.equals("FILE"))  sourceSystemObject = new SourceDataFromFile();
        else if (source.equals("DATALAKE"))  sourceSystemObject = new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) sourceSystemObject = new SourceFromDataBase();
        return sourceSystemObject;
    }
}
