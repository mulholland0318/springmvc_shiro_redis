package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import javax.cache.CacheManager;

public class EhcacheTest {

    public static void main(String[] args) {

        net.sf.ehcache.CacheManager cacheManager = net.sf.ehcache.CacheManager.create();
        String c = cacheManager.getActiveConfigurationText();
        System.out.println(c);

        Cache cache = cacheManager.getCache("");

        Element e = new Element("key","value");
        cache.put(e);

        Element a = cache.get("key");
        System.out.println(a);

    }
}
