package com.example.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

//阻塞队列
public class BlockingQueueDEmo {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Object> queue = new ArrayBlockingQueue<Object>(3);
  /*     第一种抛异常
       queue.add("a");
        queue.add("b");
        queue.add("c");
        // queue.add("d");
        //java.lang.IllegalStateException: Queue full
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();
        //java.lang.NoSuchElementException
        System.out.println("******888888");*/

  //第二种特殊值
       /* queue.offer("a");
        queue.offer("b");
        System.out.println(queue.offer("c"));//返回值true
        System.out.println(queue.offer("d"));//返回值false

        queue.poll();
        queue.poll();
        System.out.println(queue.poll());
        //System.out.println(queue.poll());//返回null
        System.out.println(queue.peek()); //返回队列中存在的优先加进来的数据，如果队列中没有值的话，返回值null，
       queue.element();  //返回队列中存在的优先加进来的数据，如果队列中没有值的话报异常Java.util.NoSuchElementException
        System.out.println("**********");//不管返回值是true还是false,这句话都能打印出来*/

       //第三种无限等待，出现阻塞
      /*  queue.put("a");
        queue.put("a");
        queue.put("a");
        System.out.println("**********"); //在这个位置此句话会打印
        queue.put("a");  //但是这句话会出现阻塞，无限等待，take()一样*/

      //第四种一定时间内等待，过时不侯
        queue.offer("a",2,TimeUnit.SECONDS);
        queue.offer("b",2,TimeUnit.SECONDS);
        queue.offer("c",2,TimeUnit.SECONDS);
        queue.offer("d",2,TimeUnit.SECONDS);
        System.out.println("***********");
        queue.poll(2,TimeUnit.SECONDS);
        queue.poll(2,TimeUnit.SECONDS);
        System.out.println(queue.poll(2, TimeUnit.SECONDS));
        System.out.println(queue.poll(2, TimeUnit.SECONDS));


    }
}
