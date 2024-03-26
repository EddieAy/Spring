package zera;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComponentScan {
    public static void main(String[] args) throws Exception {
        Map<String,Object> beanMap = new HashMap<>();
        String packageName = "zera.bean";
        String packagePath = packageName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path = url.getPath();
        System.out.println(path);
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f:files){
            System.out.println(f.getName().split("\\.")[0]);
            String className = packageName +"."+f.getName().split("\\.")[0];
            Class<?> aClass = Class.forName(className);
            if(aClass.isAnnotationPresent(MyComponent.class)){
                MyComponent annotation = aClass.getAnnotation(MyComponent.class);
                String id = annotation.value();
                Object object = aClass.newInstance();
                beanMap.put(id,object);
            }
        }

        System.out.println(beanMap);
    }
}
