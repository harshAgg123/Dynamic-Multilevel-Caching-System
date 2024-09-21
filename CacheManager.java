package MULTI_LEVEL_CACHE;
import java.util.*;
//This will manage all levels of cache
public class CacheManager {
    List<Cache> caches;

    //Constructor
   public CacheManager() {
       this.caches = new ArrayList<>();
   }

   //Method for adding a level in cache
    //Time Complexity: O(1)
   public void addCache(int capacity) {
       Cache cache = new Cache(capacity);
       this.caches.add(cache);
   }

   //Method for adding nodes in cache
    //Time Complexity: O(l)
    //l: No. of levels in cache
    public void put(String key, int value) {
       Node removedNode=this.caches.get(0).add(key, value);
       int i=1;
       while(removedNode != null && i<this.caches.size()){
           Cache nextCacheLayer = this.caches.get(i);
           removedNode=nextCacheLayer.add(removedNode.key, removedNode.value);
           i++;
       }
    }

    //Method for removing level from cache
    //Time Complexity: O(1)
    public void removeCache(int level){
       this.caches.remove(level-1);
    }

    //Method for reading value by providing key in cache
    //Time Complexity: O(l)
    //l: No. of levels in cache
   public void getValue(String key){
       boolean f=false;
       for(int i=0;i<this.caches.size();i++){
           Cache cache=this.caches.get(i);
           if(cache.map.containsKey(key)) {
               Node node = cache.map.get(key);
               System.out.println(node.key +":"+ node.value);
               f=true;
               update(node.key, node.value);
               break;
           }
       }
       if(f==false) {
           System.out.println(key +":"+ -1);
       }
   }

    //Method for updating value of key in cache
    //Time Complexity: O(l)
    //l: No. of levels in cache
   public void update(String key,int value){
       for(int i=0;i<this.caches.size();i++){
           Cache cache=this.caches.get(i);
           if(cache.map.containsKey(key)){
               cache.remove(key);
           }
       }
       put(key, value);
   }

    //Method for displaying all levels of cache
    //Time Complexity: O(l)
    //l: No. of levels in cache
   public void display(){
       for(int i=0;i<this.caches.size();i++){
           System.out.print("L"+(i+1)+"-->");
           Cache cache=this.caches.get(i);
           cache.print();
           System.out.println();
       }
   }
}
