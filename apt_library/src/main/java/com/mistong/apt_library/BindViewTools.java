package com.mistong.apt_library;

import android.app.Activity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liuxiaoshuai
 * @date 2019-06-27
 * @desc
 * @email liulingfeng@mistong.com
 */
public class BindViewTools {
    public static void bind(Activity activity) {
        Class clazz = activity.getClass();
        try {
            Class<?> bindClass = Class.forName(clazz.getName() + "_ViewBinding");
            //第二个是参数类型
            //getMethod 返回所有公用方法
            //getDeclaredMethod 包含所有方法，包括私有方法
            Method method = bindClass.getDeclaredMethod("bind", activity.getClass());
            method.setAccessible(true);
            method.invoke(bindClass.newInstance(), activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
