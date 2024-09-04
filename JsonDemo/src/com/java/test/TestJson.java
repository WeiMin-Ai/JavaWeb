package com.java.test;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.java.pojo.Dog;
import com.java.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

    @Test
    public void testMapJson() throws Exception{
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("age", "555");
        hashMap.put("name", "WayneMing");
        String jsonString = JSON.toJSONString(hashMap);
        System.out.println(jsonString);
    }

    @Test
    public void testListJson() throws Exception{
        Dog dog = new Dog("小黄");
        Person wayneMing = new Person("WayneMing", 555, dog);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(wayneMing);

        String jsonString = JSON.toJSONString(arrayList);
        System.out.println(jsonString);
    }
}
