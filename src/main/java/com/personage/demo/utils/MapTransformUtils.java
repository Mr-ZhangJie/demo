package com.personage.demo.utils;
 
import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
 
/**
 * MapTransformUtils
 * @author  Zhang Shi Jie
 * @date 2019/04/18
 * @update 2019/04/18
 */
public class MapTransformUtils {
 
    public static <T> T mapToObject(Map<String, Object> map, Class<T> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
 
        T obj = beanClass.newInstance();
 
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }
 
            field.setAccessible(true);
            field.set(obj, map.get(field.getName()));
        }
 
        return obj;
    }
 
    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
 
 
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        Map<String, Object> map = new HashMap<String, Object>(declaredFields.length);
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }
 
        return map;
    }
    
    public static Update objToBean(Object obj) throws Exception {
		Update update = new Update();
		Map<String, Object> objectToMap = MapTransformUtils.objectToMap(obj);
		for (Object key :objectToMap.keySet()) {
			Object object = objectToMap.get(key);
			if (object != null ) {
				update.set(key+"", object);
			}
		}
		return update;
	}
}
