package com.example.testlhf.utils.redis;

import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @author Yeoman
 * @description
 * @create 2020/3/30 下午4:07
 **/
public class RedisHelper {
    private static RedisHelper INSTANCE = new RedisHelper();
    private ApplicationContext applicationContext = null;

    private boolean isRtpApp = true;

    private RedisHelper() {
        try {
            this.isRtpApp = (null != Class.forName("com.rtp.base.monitor.stat.StatMonitorImpl"));
        } catch (ClassNotFoundException e) {
            this.isRtpApp = false;
        }
    }

    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

    public static boolean isRtpApp() {
        return INSTANCE.isRtpApp;
    }

    public <T> T getBean(Class<T> claz) {
        if (this.applicationContext == null) {
            return null;
        }
        return (T) this.applicationContext.getBean(claz);
    }

    public <T> T getBean(String name, Class<T> claz) {
        if (this.applicationContext == null) {
            return null;
        }
        return (T) this.applicationContext.getBean(name, claz);
    }

    public <T> Map<String, T> getBeans(Class<T> claz) {
        if (this.applicationContext == null) {
            return null;
        }
        return this.applicationContext.getBeansOfType(claz);
    }

    public <T> T getBean(String name) {
        if (this.applicationContext == null) {
            return null;
        }
        return (T) this.applicationContext.getBean(name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static RedisHelper getInstance() {
        return INSTANCE;
    }
}
