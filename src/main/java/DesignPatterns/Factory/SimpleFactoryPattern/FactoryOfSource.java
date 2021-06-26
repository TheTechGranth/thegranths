package DesignPatterns.Factory.SimpleFactoryPattern;

public class FactoryOfSource {
    IngestToDatabase sourceSystemObject=null;
    public IngestToDatabase getInstanceOfSource(String source){
        if (source.equals("API"))  sourceSystemObject = new SourceDataFromAPI();
        else if (source.equals("FILE"))  sourceSystemObject = new SourceDataFromFile();
        else if (source.equals("DATALAKE"))  sourceSystemObject = new SourceDataFromDataLake();
        else if(source.equals("DATABASE")) sourceSystemObject = new SourceFromDataBase();
        return sourceSystemObject;
    }
}
