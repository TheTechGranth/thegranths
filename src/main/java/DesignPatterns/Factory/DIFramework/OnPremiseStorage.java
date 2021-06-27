package DesignPatterns.Factory.DIFramework;

public class OnPremiseStorage implements IngestionService {
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if (source.equals("API"))  return new SourceDataFromAPI();
        else if (source.equals("FILE"))  return new SourceDataFromFile();
        else if (source.equals("DATALAKE"))  return new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) return new SourceFromDataBase();
        return null;
    }
}
