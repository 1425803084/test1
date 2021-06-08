import redis.clients.jedis.Jedis;

public class Redis {
    Jedis jedis;
    public void redisLogin(){
        System.out.println("start connect Redis");
        this.jedis = new Jedis("127.0.0.1",6379);
        System.out.println("Redis 正在运行: "+jedis.ping());
    }

    public String get(String key){
        return this.jedis.get(key);
    }

    public void set (String key, String value){
        this.jedis.set(key, value);
    }

    //1表示删除成功，0表示失败
    public long del (String key){
        return this.jedis.del(key);
    }
}
