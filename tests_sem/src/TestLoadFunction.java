import org.junit.Test;

public class TestLoadFunction {
    @Test
    public void loadSum(){
        for(int i = 0; i < 1000000000; i ++){
            Main._sum(new double[]{2, 3});
        }
    }
    @Test(timeout = 10000)
    public void loadMult(){
        for(int i = 0; i < 100000; i ++){
            Main._mult(new double[]{2, 3});
        }
    }
    @Test(timeout = 10000)
    public void loadMin(){
        for(int i = 0; i < 10000000; i ++){
            Main._min(new double[]{2, 3});
        }
    }
    @Test(timeout = 10000)
    public void loadMax(){
        for(int i = 0; i < 10; i ++){
            Main._max(new double[]{2, 3});
        }
    }
}

