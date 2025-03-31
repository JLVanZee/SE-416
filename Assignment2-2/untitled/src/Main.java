public class Main {
    public static void main(String[] args) {
        AppCache program1 = AppCache.getInstance();
        AppCache program2 = AppCache.getInstance();
        AppCache program3 = AppCache.getInstance();

        // first program setting data
        program1.setAppCacheInstance(new EnhancementId(), new ConfigurationData());
        program1.setAppCacheInstance(new EnhancementId(), new ConfigurationData());
        program1.setAppCacheInstance(new EnhancementId(), new ConfigurationData());


        // second and third program receiving data
        program2.retrieveData(new EnhancementId());
        program2.retrieveData(new EnhancementId());

        program3.retrieveData(new EnhancementId());
        program3.retrieveData(new EnhancementId());
    }
}