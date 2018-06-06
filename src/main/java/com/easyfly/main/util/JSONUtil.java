package com.easyfly.main.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang.ArrayUtils;

public class JSONUtil {
    public static final String datetimeFormat = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将对象的指定属性转换为JSON数据
     *
     * @param object     要转换的对象
     * @param properties 要转换属性
     */
    public static String toJSON2(Object object, final String... properties) {
        if (properties.length > 0) {
            PropertyFilter filter = new PropertyFilter() {
                public boolean apply(Object source, String name, Object value) {
                    return ArrayUtils.contains(properties, name);
                }
            };
            return JSON.toJSONString(object, filter, new SerializerFeature[0]);
        } else {
            return JSON.toJSONString(object);
        }
    }

    public static String toJSONString(String param) {
        return JSON.toJSONString(param);
    }

    public static <T> T parseObject(String param, Class<T> clazz) {
        return JSON.parseObject(param, clazz);
    }

    public static JSONObject parseObject(String param) {
        return JSONObject.parseObject(param);
    }
}
