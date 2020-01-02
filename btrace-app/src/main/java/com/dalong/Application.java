package com.dalong;

import java.io.IOException;
import java.util.Random;

public class Application {
    private String name;

    public Application(String name) {
        super();
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public int add(int a, int b) {
        Test test = new Test();
        int result = 0;
        try {
            result = test.add(a, b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    class Test {
        public int add(int a, int b) throws IOException {
            if (a > 50 && a < 80) throw new IOException("this is a exception!");
            return a + b;
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        Application demo = new Application("this is a Demo1 instace");
        while (true) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int c = demo.add(a, b);
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            System.out.println("a+b:" + c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




