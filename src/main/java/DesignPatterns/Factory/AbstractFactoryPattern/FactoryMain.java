package DesignPatterns.Factory.AbstractFactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        StorageFactory storageFactory = new StorageFactory();
        IngestionService storageObject = storageFactory.getStorageService("ONPREMISE");
        storageObject.ingestDataToMyDatabase("FILE");
    }
}
