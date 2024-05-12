import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static double _sum(double[] a){
        double res = 0;
        for(int i = 0; i < a.length; i ++){
            res += a[i];
        }
        return res;
    }
    public static double _mult(double[] a){
        double res = 1;
        for(int i = 0; i < a.length; i ++){
            res *= a[i];
        }
        return res;
    }
    public static double _min(double[] a){
        double res = a[0];
        for(int i = 0; i < a.length; i ++){
            if(a[i] < res){
                res = a[i];
            }
        }
        return res;
    }
    public static double _max(double[] a){
        double res = a[0];
        for(int i = 0; i < a.length; i ++){
            if(a[i] > res){
                res = a[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            String file = sc.next();
            sc = new Scanner(new File(file));

            String line = sc.nextLine();
            String[] st = line.split(" ");

            double[] a = new double[st.length];
            for (int i = 0; i < st.length; i++) {
                a[i] = Double.parseDouble(st[i]);
            }

            long start = System.nanoTime();
            System.out.println("Сумма: " + _sum(a));
            long end = System.nanoTime();
            System.out.println("Время работы функции суммы: " + (end - start));

            start = System.nanoTime();
            System.out.println("Произведение: " + _mult(a));
            end = System.nanoTime();
            System.out.println("Время работы функции произведения: " + (end - start));

            start = System.nanoTime();
            System.out.println("Минимальный элемент: " + _min(a));
            end = System.nanoTime();
            System.out.println("Время работы функции поиска минимума: " + (end - start));

            start = System.nanoTime();
            System.out.println("Максимальный элемент: " + _max(a));
            end = System.nanoTime();
            System.out.println("Время работы функции поиска максимума: " + (end - start));


        } catch (FileNotFoundException e) {
            System.out.println("Нет файла с таким названием");
        }
        org.junit.runner.JUnitCore.main("TestFunction");
        org.junit.runner.JUnitCore.main("TestLoadFunction");
    }
}