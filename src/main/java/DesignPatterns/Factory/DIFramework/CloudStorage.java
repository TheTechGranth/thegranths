package DesignPatterns.Factory.DIFramework;

public class CloudStorage implements IngestionService {
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if (source.equals("API"))  return new CloudSourceDataFromAPI();
        else if (source.equals("FILE"))  return new CloudSourceFromFile();
       // else if (source.equals("DATALAKE"))  return new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) return new CloudSourceDataFromDatabase();
        return null;
    }
}
