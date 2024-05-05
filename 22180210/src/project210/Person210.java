package project210;

/** 用于描述人的类
 *
 */
public class Person210 {  // 【练习1a】修改类名为PersonXXX
    //------定义成员变量------
    String name;  // 姓名
    int age;  // 年龄
    boolean sex;  // 性别，true表示女性，false表示男性
    String className;
    int studentID;
    //------定义成员方法------
    /** 显示个人信息
     *
     */
    void showInfo(){
        System.out.printf("我叫%s，今年%d岁，性别%b\n", name, age, sex);


    }

    void showCh(String sex){

        System.out.printf("我叫%s，今年%d岁，性别%s\n", name, age, sex);
    }

    void showStuInfo(){

        System.out.printf("我是%s的学生,学号是%d。\n",className,studentID);
    }

}

