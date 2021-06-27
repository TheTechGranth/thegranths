package DesignPatterns.Factory.DIFramework;

public class StorageFactory {

    public IngestionService getStorageService(String storageType){
        if(storageType.equals("CLOUD")) return new CloudStorage();
        else if(storageType.equals("ONPREMISE")) return new OnPremiseStorage();
        return null;
    }
}
