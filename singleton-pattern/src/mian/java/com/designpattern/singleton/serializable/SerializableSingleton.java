package com.designpattern.singleton.serializable;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.register.ContainerSingleton;

import java.io.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 序列化单例
 */
public class SerializableSingleton implements Serializable {
    public  final static SerializableSingleton INSTANCE = new SerializableSingleton();
    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    // 加入该方法反序列化就不会创建新的对象，   反序列化ObjectInputStream.readObject() 有对实体类是否有该方法的的校验及使用
    private Object readResolve(){ return INSTANCE;}

//    public static void main(String[] args) {
//        ReflectTest.reflectDestroySingletonTest(SerializableSingleton.class);
//    }

    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
