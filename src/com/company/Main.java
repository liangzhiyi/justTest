package com.company;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //arrayDemo();//数组操作
        //test();//随机数操作
        //testChar();//字符串和char操作
        threadTest();//多线程操作


    }




    public static void test(){
        while(true){
            Random ra =new Random();
            int ii = ra.nextInt(10);
            int s =ii;
            int iii =ii--;
            float f=12.356454f;
            System.out.println("1---------------------------"+Math.random()*100 + "0000000000"+Math.sin(60));
            System.out.println("1---------------------------"+s);
            System.out.println("2---------------------------"+Math.pow(s,2));
            //Scanner sc = new Scanner(System.in);
            //String s =sc.nextLine();
            int i=0;
            Date d=new Date();
            Date dd=new Date();
            System.out.println("3"+dd);
            System.out.println("3"+new Date(d.getTime()+600000));
            for(double o=0;o<1000000000;o++){
                s=i++;
                boolean b =isAdd(s);
                //System.out.println(b);
                //System.out.println(s);
                if(s>9) {
                    d = new Date();
                    System.out.println(d.getTime() - dd.getTime()+"..................4");
                    System.out.println(d.getTime() - dd.getTime());
                    break;
                }
            }
            System.out.println("---------------取余前："+ii);
            System.out.println("---------------取余得："+ii%10);
            System.out.println("---------------取余得："+iii);
            if(ii==5) {
                break;
            }
        }
    }
    public static boolean isAdd( int i){
        if (i % 2 == 1) return true;
        return false;
    }
    public static void arrayDemo(){
        //此时的数组并不是一个等列数组
        int data[][] = new int[][] {
                {1, 2, 3}, {4, 5}, {6, 7, 8, 9,30,30,2,5,6,89,4,4},{6, 7, 8, 9,30,30,2,5,6,89,4,4}};
        //如果在进行输出的时候一定要使用双重循环，
        //外部的循环控制输出的行数，而内部的循环控制输出列数
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print("data[" + i + "][" + j + "]=" + data[i][j] + "、");
            }
            System.out.println();
        }
    }
    public static void testChar(){
        String ssss ="dfsdfasdfafewfesfsefjukujtdsiulkdjdsawser";
        String s =ssss.replace('f','a');
        String[] ss=s.split("s");

        System.out.println(ss[0]);
        for(Object sss :ss){
            //System.out.println(sss);
        }
        char[] cha = s.toCharArray();
        for(Object cc : cha){
            System.out.println(cc);
        }
        char ch ='a';
        char c ='a';
        System.out.println(ch==c);
    }

    /**
     * 多线程实例
     */
    private static void threadTest() {
//        System.out.println(Thread.currentThread().getName());
//        for(int i=0; i<10; i++){
//            new Thread("" + i){
//                public void run(){
//                    System.out.println("Thread: " + getName() + "running");
//                }
//            }.start();
//        }
        Thread[] th = new Thread[20];
        for(int i =0;i<=20;i++){
            Thread tth=new Thread(new getThread());
            tth.start();
            try{
                tth.sleep(300);
            }catch (Exception e){
                System.out.println("");
            }
            tth.setPriority(10);
            System.out.println(Thread.currentThread().getName()+"当前线程");
        }
        ThreadMXBean tm = ManagementFactory.getThreadMXBean();
        ThreadInfo[] ti = tm.dumpAllThreads(false,false);
        for(ThreadInfo tii : ti){
            System.out.println("{"+tii.getThreadId()  +"]"+"["+tii.getThreadName());
        }
    }

    public static class getThread implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+"接口实现");
        }
    }
    public static class getT extends Thread{
        public void run(){
            System.out.println(Thread.currentThread().getName()+"继承实现");
        }
    }
}
