package DesignPatterns.Factory.AbstractFactoryPattern;

public class OnPremiseStoreService implements IngestionService {
    IngestToDatabase sourceSystemObject=null;
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if (source.equals("API"))  sourceSystemObject = new SourceDataFromAPI();
        else if (source.equals("FILE"))  sourceSystemObject = new SourceDataFromFile();
        else if (source.equals("DATALAKE"))  sourceSystemObject = new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) sourceSystemObject = new SourceFromDataBase();
        return sourceSystemObject;
    }
}
