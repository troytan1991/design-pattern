package com.troytan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StreamTest {

    /**
     * stream group分组测试
     *
     * @author troytan
     * @date 2018年4月12日
     */
    @Test
    public void test() {
        List<OuterObject> list = generateObjects();
        // 以compoKey为键值，判断是否相等，先比较对象的hashCode，若相等再比较equals方法。
        Map<String, List<OuterObject>> resultMap = list.stream().collect(Collectors.groupingBy(o -> o.getCompo_key1()
                                                                                                    + o.getCompo_key2()));

        System.out.println(resultMap);

    }

    private List<OuterObject> generateObjects() {
        List<OuterObject> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            OuterObject object = new OuterObject();
            object.setCol1(i);
            object.setCol2("col2 " + i);
            object.setCol3((double) i);

            object.setCompo_key1("compoKey1");
            object.setCompo_key2(5);
            list.add(object);
        }

        for (int i = 0; i < 2; i++) {
            OuterObject object = new OuterObject();
            object.setCol1(i);
            object.setCol2("col2 " + i);
            object.setCol3((double) i);

            object.setCompo_key1("compoKey2");
            object.setCompo_key2(10);
            list.add(object);
        }

        return list;
    }
}
