import java.util.HashMap;
import java.util.Map;

public class AppCache {
    private static AppCache instance;
    private static Map<EnhancementId, ConfigurationData> appCacheInstance;

    /* PROBLEM 2.1 */
    public static AppCache getInstance() {
        if (instance == null) {
            instance = new AppCache();
        }
        return instance;
    }

    private AppCache() {
        appCacheInstance = new HashMap<EnhancementId, ConfigurationData>();
    }

    public void setAppCacheInstance(EnhancementId enhancementId, ConfigurationData configurationData) {
        appCacheInstance.put(enhancementId, configurationData);
    }

    public ConfigurationData retrieveData(EnhancementId enhancementId) {
        return appCacheInstance.get(enhancementId);
    }
}
