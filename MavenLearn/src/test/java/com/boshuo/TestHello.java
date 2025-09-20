package com.boshuo;

import org.junit.Test;

//测试类要以test开头在执行test命令才会自动找到这个测试类执行
public class TestHello {
    @Test
    public void test() {
        Util util = new Util();
        util.hello();
    }

}
