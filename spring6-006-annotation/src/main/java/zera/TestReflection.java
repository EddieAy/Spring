package zera;

import java.lang.reflect.Field;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("zera.bean.User");
        if(aClass.isAnnotationPresent(MyComponent.class)){
            MyComponent annotation = aClass.getAnnotation(MyComponent.class);
            System.out.println(annotation.value());
        }
        Field name = aClass.getDeclaredField("name");
        Class<?> type = name.getType();
        System.out.println("字段'name'的类型是: " + type.getSimpleName()); // 输出字段的类型

    }
}
