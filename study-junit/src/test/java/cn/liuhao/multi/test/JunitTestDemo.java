package cn.liuhao.multi.test;

import org.junit.jupiter.api.*;

public class JunitTestDemo {

    @BeforeAll
    public static void beforeWork() {
        System.out.println("在本类中所有的用例执行之前执行一次");
    }

    @AfterAll
    public static void afterWork() {
        System.out.println("在本类中所有的用例执行之后执行一次");
    }


    @BeforeEach
    public void beforeEachOne() {
        System.out.println("在每个用例方法执行之前执行");
    }

    @AfterEach
    public void afterEachOne() {
        System.out.println("在每个用例方法执行之后执行");
    }

    @Test
    public void test1() {
        System.out.println("测试junit1");
    }

    @Test
    public void test2() {
        System.out.println("测试junit2");
    }

    @Disabled
    public void test3() {
        // 因为加上了disabled的注解所以，这个测试方法，在类执行时并不会被执行
        System.out.println("测试junit3");
    }
}
