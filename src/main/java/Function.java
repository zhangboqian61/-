import org.apache.commons.math3.stat.StatUtils;

public class Function {
    public double calculateMean(double[] value){
        double mean;
        mean = StatUtils.mean(value);
        return mean;
    }
    public double requireMin(double[] value){
        double min;
        min = StatUtils.min(value);
        return min;
    }
    public double requireMax(double[] value){
        double max;
        max = StatUtils.max(value);
        return 0;
    }
    public double calculateVariance(double[] value){
        double variance;
        variance = StatUtils.populationVariance(value);
        return variance;
    }
    public boolean isSuccess(double variance){
        if(variance<10000000)
            return false; //注入错误，本来应该返回true
        return  false;
    }
}
