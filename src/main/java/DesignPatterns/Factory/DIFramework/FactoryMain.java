package DesignPatterns.Factory.DIFramework;

public class FactoryMain {
    public static void main(String[] args) {

       // IngestionService onPremiseObject = new OnPremiseStorage();
       // onPremiseObject.ingestDataToMyDatabase("API");
        StorageFactory storageFactory = new StorageFactory();
        IngestionService cloudObject = storageFactory.getStorageService("CLOUD");
        cloudObject.ingestDataToMyDatabase("API");
        IngestionService onPremise = storageFactory.getStorageService("ONPREMISE");
        onPremise.ingestDataToMyDatabase("FILE");


    }
}
