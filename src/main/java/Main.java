import java.util.ArrayList;
import org.apache.commons.math3.stat.StatUtils;

public class Main {
    public static void main(String[] args){

        double[] values = new double[] { 1.1,10.2,0.1,0.2,2.5,3.0,0.3,0.4,0.5,0.6};

        double mean;//求平均数
        double min;
        double max;
        double variance;//求方差，在这里注入错误
        Function function = new Function();

        mean=function.calculateMean(values);
        System.out.println("平均数：" + mean);

        min = function.requireMin(values);
        System.out.println("最小数:"+min);

        max = function.requireMax(values);
        System.out.println("最大数:"+max);

        variance = function.calculateVariance(values);
        System.out.println("方差:"+variance);

        boolean mustSuccess;
        mustSuccess = function.isSuccess(variance);
    }

}
