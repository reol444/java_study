package com.secondwork.work1;

public class AppConfig{
    //创建 SingleObject 的一个对象
    private static AppConfig instance = null;
    //让构造函数为 private，这样该类就不会被实例化
    private AppConfig(){}
    //获取唯一可用的对象
    public static AppConfig getInstance(){
        if(instance==null){
            instance=new AppConfig();
        }
        return instance;
    }
}
