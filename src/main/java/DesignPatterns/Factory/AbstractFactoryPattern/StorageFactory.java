package DesignPatterns.Factory.AbstractFactoryPattern;

public class StorageFactory {
    public IngestionService getStorageService(String storageType){
        if(storageType.equals("ONPREMISE")) return new OnPremiseStoreService();
        else if(storageType.equals("CLOUD")) return new CloudStoreService();
        return null;
    }
}
