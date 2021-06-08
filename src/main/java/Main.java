
public class Main {
    public static void main (String[] args){
        Redis redis = new Redis();
        redis.redisLogin();
        redis.set("key1","123");
        System.out.println(redis.get("key1"));
        System.out.println(redis.del("key1"));
    }
}
