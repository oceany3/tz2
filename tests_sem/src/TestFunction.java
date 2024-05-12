import static org.junit.Assert.*;
import org.junit.Test;
public class TestFunction {
    @Test
    public void testSum_wholepositivenums() {
        assertEquals(5, Main._sum(new double[]{2, 3}), 0.0001);
        assertEquals(125, Main._sum(new double[]{2, 3, 5, 45, 62, 8}), 0.0001);
        assertEquals(392943787, Main._sum(new double[]{702, 3982, 78, 905678, 15, 46345678, 345687654}), 0.0001);
    }
    @Test
    public void testSum_doublenums() {
        assertEquals(11.3221, Main._sum(new double[]{2.1, 3.4567, 5.7654}), 0.0001);
        assertEquals(7.3701536894081E7, Main._sum(new double[]{2.103, 7976543.283587, 5.7654, 65724985.742094}), 0.0001);
        assertEquals(5.712320576471592E8, Main._sum(new double[]{2.272941, 3.4567937, 567890925.76629716384, 593092.2747382, 2748033.8763892}), 0.0001);
    }

    @Test
    public void testSum_negativenums() {
        assertEquals(-247211409, Main._sum(new double[]{-234, -246256746, -4, -944839, -9586}), 0.0001);
        assertEquals(-510, Main._sum(new double[]{-2, -75, -4, -345, -84}), 0.0001);
        assertEquals(-466917281, Main._sum(new double[]{-234, -944, -109875678, -356944839, -95586}), 0.0001);
    }

    @Test
    public void testSum_negativedoublenums() {
        assertEquals(-11.3221, Main._sum(new double[]{-2.1, -3.4567, -5.7654}), 0.0001);
        assertEquals(-7.3701536894081E7, Main._sum(new double[]{-2.103, -7976543.283587, -5.7654, -65724985.742094}), 0.0001);
        assertEquals(-5.712320576471592E8, Main._sum(new double[]{-2.272941, -3.4567937, -567890925.76629716384, -593092.2747382, -2748033.8763892}), 0.0001);
    }

    @Test
    public void testSum_allcombs() {
        assertEquals(-6.3567, Main._sum(new double[]{2.1, -3.4567, -5}), 0.0001);
        assertEquals(7.3701519180587E7, Main._sum(new double[]{-2.103, 7976543.283587, -7, 65724985}), 0.0001);
        assertEquals(-5.645498000299145E8, Main._sum(new double[]{2.272941, -3.4567937, -567890925, 593092.2747382, 2748033.8792}), 0.0001);
    }

    @Test
    public void testMult_wholepositivenums() {
        assertEquals(6, Main._mult(new double[]{2, 3}), 0.0001);
        assertEquals(669600, Main._mult(new double[]{2, 3, 5, 45, 62, 8}), 0.0001);
        assertEquals(1872351936, Main._mult(new double[]{702, 784, 567, 6}), 0.0001);
    }

    @Test
    public void testMult_doublenums() {
        assertEquals(41.851442178, Main._mult(new double[]{2.1, 3.4567, 5.7654}), 0.0001);
        assertEquals(6.3135969450236596E7, Main._mult(new double[]{2.103, 0.45678, 65724985.742094}), 0.0001);
        assertEquals(6.304208499030886, Main._mult(new double[]{2.272941, 3.4567937, 0.0000567384, 592.2747382, 23.8763892}), 0.0001);
    }

    @Test
    public void testMult_negativenums(){
        assertEquals(8.46473472E8, Main._mult(new double[] {-234, -4, -944, -958}), 0.0001);
        assertEquals(-1.7388E7, Main._mult(new double[] {-2, -75, -4, -345, -84}), 0.0001);
        assertEquals(845824, Main._mult(new double[] {-2, -944, -56, -8}), 0.0001);
    }
    @Test
    public void testMult_negativedoublenums(){
        assertEquals(-41.851442178, Main._mult(new double[] {-2.1, -3.4567, -5.7654}), 0.0001);
        assertEquals(6.356439872086709E15, Main._mult(new double[] {-2.103, -7976543.283587, -5.7654, -65724985.742094}), 0.0001);
        assertEquals(-7.272285210503318E21, Main._mult(new double[] {-2.272941, -3.4567937, -567890925.76629716384, -593092.2747382, -2748033.8763892}), 0.0001);
    }
    @Test
    public void testMult_allcombs(){
        assertEquals(36.29535, Main._mult(new double[] {2.1, -3.4567, -5}), 0.0001);
        assertEquals(690.3820208599547, Main._mult(new double[] {-2.103, 43.283587, -0.0077, 985}), 0.0001);
        assertEquals(-60.18121901278407, Main._mult(new double[] {2.272941, -3.4567937, 0.2747382, 27.8792}), 0.0001);
    }

    @Test
    public void testMin_wholepositivenums() {
        assertEquals(2, Main._min(new double[]{2, 3}), 0.0001);
        assertEquals(2, Main._min(new double[]{2, 3, 5, 45, 62, 8}), 0.0001);
        assertEquals(6, Main._min(new double[]{702, 784, 567, 6}), 0.0001);
    }

    @Test
    public void testMin_doublenums() {
        assertEquals(2.1, Main._min(new double[]{2.1, 3.4567, 5.7654}), 0.0001);
        assertEquals(0.45678, Main._min(new double[]{2.103, 0.45678, 65724985.742094}), 0.0001);
        assertEquals(0.0000567384, Main._min(new double[]{2.272941, 3.4567937, 0.0000567384, 592.2747382, 23.8763892}), 0.0001);
    }

    @Test
    public void testMin_negativenums(){
        assertEquals(-958, Main._min(new double[] {-234, -4, -944, -958}), 0.0001);
        assertEquals(-345, Main._min(new double[] {-2, -75, -4, -345, -84}), 0.0001);
        assertEquals(-9409874, Main._min(new double[] {-2, -9409874, -56, -8}), 0.0001);
    }
    @Test
    public void testMin_negativedoublenums(){
        assertEquals(-5.7654, Main._min(new double[] {-2.1, -3.4567, -5.7654}), 0.0001);
        assertEquals(-65724985.742094, Main._min(new double[] {-2.103, -7976543.283587, -5.7654, -65724985.742094}), 0.0001);
        assertEquals(-567890925.76629716384, Main._min(new double[] {-2.272941, -3.4567937, -567890925.76629716384, -593092.2747382, -2748033.8763892}), 0.0001);
    }
    @Test
    public void testMin_allcombs(){
        assertEquals(-5, Main._min(new double[] {2.1, -3.4567, -5}), 0.0001);
        assertEquals(-2.103, Main._min(new double[] {-2.103, 43.283587, -0.0077, 985}), 0.0001);
        assertEquals(-3.4567937, Main._min(new double[] {2.272941, -3.4567937, 0.2747382, 27.8792}), 0.0001);
    }

    @Test
    public void testMax_wholepositivenums() {
        assertEquals(3, Main._max(new double[]{2, 3}), 0.0001);
        assertEquals(62, Main._max(new double[]{2, 3, 5, 45, 62, 8}), 0.0001);
        assertEquals(784, Main._max(new double[]{702, 784, 567, 6}), 0.0001);
    }

    @Test
    public void testMax_doublenums() {
        assertEquals(5.7654, Main._max(new double[]{2.1, 3.4567, 5.7654}), 0.0001);
        assertEquals(65724985.742094, Main._max(new double[]{2.103, 0.45678, 65724985.742094}), 0.0001);
        assertEquals(592.2747382, Main._max(new double[]{2.272941, 3.4567937, 0.0000567384, 592.2747382, 23.8763892}), 0.0001);
    }

    @Test
    public void testMax_negativenums(){
        assertEquals(-4, Main._max(new double[] {-234, -4, -944, -958}), 0.0001);
        assertEquals(-2, Main._max(new double[] {-2, -75, -4, -345, -84}), 0.0001);
        assertEquals(-2, Main._max(new double[] {-2, -9409874, -56, -8}), 0.0001);
    }
    @Test
    public void testMax_negativedoublenums(){
        assertEquals(-2.1, Main._max(new double[] {-2.1, -3.4567, -5.7654}), 0.0001);
        assertEquals(-2.103, Main._max(new double[] {-2.103, -7976543.283587, -5.7654, -65724985.742094}), 0.0001);
        assertEquals(-2.272941, Main._max(new double[] {-2.272941, -3.4567937, -567890925.76629716384, -593092.2747382, -2748033.8763892}), 0.0001);
    }
    @Test
    public void testMax_allcombs(){
        assertEquals(2.1, Main._max(new double[] {2.1, -3.4567, -5}), 0.0001);
        assertEquals(985, Main._max(new double[] {-2.103, 43.283587, -0.0077, 985}), 0.0001);
        assertEquals(27.8792, Main._max(new double[] {2.272941, -3.4567937, 0.2747382, 27.8792}), 0.0001);
    }
}
//5-7 тестов для каждого метода
//отрицатльные, выход за границы инта и тд
//можно попробовать там про другие типы чето написать, но это заебно
