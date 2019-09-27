package learn.spring.environment;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MutablePropertySourcesTest {


    public static void main(String[] args) {
        MutablePropertySources mutablePropertySources = new MutablePropertySources();

        Map<String, Object> map = new HashMap<>(8);
        map.put("name", "throwable");
        map.put("age", 25);
        MapPropertySource mapPropertySource = new MapPropertySource("map", map);

        mutablePropertySources.addLast(mapPropertySource);

        Properties properties = new Properties();
        PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("prop", properties);
        properties.put("name", "doge");
        properties.put("gourp", "group-a");
        mutablePropertySources.addBefore("map", propertiesPropertySource);
        System.out.println(mutablePropertySources);


        //mutablePropertySources
        //PropertySource这个接口  添加2种  MapPropertySource  PropertiesPropertySource
        //MapPropertySource 添加map
        //PropertiesPropertySource 添加Properties Properties是tableMap

    }


}
