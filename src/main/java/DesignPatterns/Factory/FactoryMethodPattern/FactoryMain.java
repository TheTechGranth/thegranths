package DesignPatterns.Factory.FactoryMethodPattern;

public class FactoryMain {
    public static void main(String[] args) {
        OnPremiseStoreService onPremiseStoreService = new OnPremiseStoreService();
        IngestToDatabase ingestionService = onPremiseStoreService.getInstanceOfSource("FILE");
        ingestionService.ingestData();
        CloudStoreService cloudStoreService = new CloudStoreService();
        IngestToDatabase cloudIngestionService = cloudStoreService.getInstanceOfSource("API");
        cloudIngestionService.ingestData();
    }
}
