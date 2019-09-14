package com.company;

import javafx.application.Application;

import java.awt.*;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static void main(String[] args) {
        int[] arr =new int[]{1,1,1,1,1};
        AtomicIntegerArray array = new AtomicIntegerArray(arr);
        AtomicInteger ai = new AtomicInteger();

        for(int i=0;i<1;i++){
//            ThreadGroup tg = new ThreadGroup("myTest");
//            Thread t =new Thread(new GetThread(array),"naem"+i);
//            t.setName("----------------------"+i);
//            t.getThreadGroup();
//            System.out.println(tg.getName()+"11111111111111111");
//            t.start();
//            try{
//                t.sleep(3000);
//                //TimeUnit.SECONDS.sleep(3);
//            }catch (Exception e){
//
//            }

            ExecutorService exe =Executors.newCachedThreadPool();
            System.out.println(array);
            for(int d=0;d<1000;d++){
                exe.execute(new GetThread(array));
                System.out.println(d);
            }
            exe.shutdown();
            System.out.println(array);
        }

    }
    static class GetThread extends Throwable implements Runnable {
        //private int i=100;
        public static AtomicIntegerArray array;
        private AtomicInteger ai = new AtomicInteger();
        public GetThread(AtomicIntegerArray array){
            this.array=array;
            this.ai=ai;
        }
        @Override
        public void run() {
            //System.out.println(Thread.currentThread().getName()+"-"+this.getClass().getName().replace("o","oo"));
//            Node leftChild;
            Date d =new Date(System.currentTimeMillis());
            //System.out.println(d.getTime());
            AtomicInteger in = new AtomicInteger(1000);
            //System.out.println(in);

            in = new AtomicInteger(1000000);
            //in.addAndGet(10000000);
            double ddd= in.doubleValue();
           // System.out.println(in.hashCode());
            //System.out.println(in.getAndSet(33333333));
            //System.out.println(in);
            Base64 b ;
            String s ="dddsdfsfasdfd";
            //System.out.println(s.substring(7));


            for(int i =0;i<5;i++){
                array.addAndGet(i,1);
            }
            //System.out.println(Thread.currentThread().getName());

            System.out.println(ai);

        }
    }
}
