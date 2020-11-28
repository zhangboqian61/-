
import org.apache.commons.math3.stat.StatUtils;
import  org.junit.*;


public class FunctionTest {
    Function function = new Function();
    double[] values = new double[] { 1.1,10.2,0.1,0.2,2.5,3.0,0.3,0.4,0.5,0.6};
    @Test
    public  void minTest(){
        System.out.println("最小数:"+ StatUtils.min(values));
    }
    @Test
    public  void maxTest(){
        System.out.println("最大数:"+ StatUtils.max(values));
    }
    @Test
    public  void varianceTest(){
        System.out.println("最小数:"+ StatUtils.variance(values));
    }

}
