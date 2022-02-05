package SystemDesign.RateLimiter.LeakyBucket;

public interface RateLimiter {
    boolean grantAccess();
}
