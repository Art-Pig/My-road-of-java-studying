package project210;

public class Test1 {
    public static void main(String[] args){
        // 创建Person类对象
        Person210 person = new Person210();  // 【练习1b】修正错误，使程序能正常运行
        // 调用类成员方法显示个人信息
        person.showInfo();

        //【练习2a】调用类成员变量进行对象个人信息的赋值
        // ...

        person.name = "王泽万";

        person.age = 20;

        person.sex = true;

        person.className = "22电子1班";

        person.studentID = 22180210;

        //【练习2b】调用类成员方法显示个人信息
        // ...
        person.showInfo();

        // 【练习4】创建StudentXXX类对象student，并调用showInfo()方法
        // ...

        String sex;

        if(person.sex==true){

            sex = "男";

        }
        else{

            sex = "女";

        }

        person.showCh(sex);

        person.showStuInfo();


    }
}

