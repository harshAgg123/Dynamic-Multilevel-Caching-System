package MULTI_LEVEL_CACHE;
public class Main{
    public static void main(String[] args) {
       
        CacheManager cacheManager = new CacheManager();
        
        cacheManager.addCache(3);
        cacheManager.addCache(2);
        cacheManager.addCache(3);
        cacheManager.addCache(2);
        
        cacheManager.put("A", 100);
        cacheManager.put("B", 200);
        cacheManager.put("C", 300);
        cacheManager.put("D", 400);
        cacheManager.put("E", 500);
        cacheManager.put("F", 600);
        cacheManager.put("G", 700);
        cacheManager.put("H", 800);
        cacheManager.put("I", 900);
        cacheManager.put("J", 1000);

        cacheManager.getValue("I");
        cacheManager.display();
        cacheManager.getValue("A");
         cacheManager.put("K", 1100);
         cacheManager.removeCache(2);
         System.out.println();
        cacheManager.update("F", 1200);
        cacheManager.getValue("B");
        cacheManager.display();
    }
}
