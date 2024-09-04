package com.java.test;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.java.pojo.Dog;
import com.java.pojo.Person;
import org.junit.Test;

public class TestJson {
    @Test
    public void testWriteJson() throws Exception{
        // 实例化对象
        Dog dog = new Dog("小黄");
        Person wayneMing = new Person("WayneMing", 555, dog);

        // 将Person对象转换成一个字符串
        String jsonString = JSON.toJSONString(wayneMing);
        System.out.println(jsonString);
    }

    @Test
    public void testReadJson() throws Exception{
        String personString = "{\"age\":555,\"dog\":{\"name\":\"小黄\"},\"name\":\"WayneMing\"}\n";
        Person wayneMing = JSON.parseObject(personString, Person.class);
        System.out.println(wayneMing);
    }
}
