package com.hqx.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/*
快捷键的使用:1 执行(run)alt+r
提示补全(class Name completion)alt+/
单行注释ctrL +l
多行注释ctrl + shift +l
向下复制一行(Duplicate Lines)ctrl+alt+down
删除一行或选中行(delete line)ctrL+d
向下移动行(move statement down )alt+down
向上移动行(move statement up)alt+up
向下开始新的一行(start new line)shift+enter
向上开始新的一行(start New line before current)  ctrl+shift+enter.
如何查看源码(class)ctrl +选中指定的结构或ctrL + shift + t
万能解错/生成返回值变量alt + enter
退回到前一个编辑的页面( back )alt + left
进入到下一个编辑的页面(针对于上条)(forward)alt + right
查看继承关系(type hierarchy )F4

格式化代码( reformat code)ctrl+shift+F
显示方法参教类型(Parameter info)ctrL+alt+/
复制代码ctrl + c
撤销ctrl + z
反撒销ctrl + y
剪切ctrl + x
粘贴ctrl + v
保存ctrl + s
全选ctrl + a
选中数行，整体往后移动tab
选中数行，整体往前移动shift + tab
查看类的结构;类似于eclipse的outline ctrL+o
重构修改变量名与方法名(rename)alt+shift+r
大写转小写/小写转大写(toggle case)ctrL+shift+y
生成构造/get/set/toString  alt +shift + s

查看文档说明(quick documentation) F2
收起所有的方法( colLapse alL)  alt + Shift + c
打开所有方法(expand all)  alt + shift + x
打开代码所在硬盘文件夹(show in explorer)   ctrl + shift + x
生成try-catch等( surround with)    alt + shift + z
局部变量抽取为成员变量(introduce field)    alt + shift + f
查找/替换(当前)   ctrl + f
查找(全局)  ctrl + h
查找文件    double shift
查看类的继承结构图(Show uML Diagram) ctrl + shift + u
查看方法的多层重写结构(method hierarchy)   ctrL + alt + h
添加到收藏(add to favorites) ctrl + alt + f
抽取方法(Extract Method)alt+shift+m
打开最近修改的文件(Recently Files)   ctrL+E
关闭当前打开的代码栏(close)   ctrL + w

关闭打开的所有代码栏(close all)   ctrl + shift + w
快速搜索类中的错误(next highlighted error)ctrl + shift + q
选择要粘贴的内容(show in Explorer)ctrL+shift+v
查找方法在哪里被调用(call Hierarchy)ctrl+shift+h


 */

public class HelloWorld {

    private static int num;

    public static void main(String[] args){
        //region Description
        System.out.println("Hello World!");
        //shift + enter 向下开始新的一行
        //ctrl + shift + enter 向上开始新的一行（右侧的按键）
        System.out.println("Hello World!");//ctrl + alt + ↓ 复制一行
        //endregion

        ArrayList list = new ArrayList();//ctrl + d删除选中的行

        ArrayList list1 = null;

        //alt + ↑（↓）    上下移动该行代码



//        synchronized ();//alt + /显示提示 ctrl + / 选中的单行或者多行注释

        /*//a
        //b
        //c*/   //ctrl + shift + /  多行注释

        Date date = new Date();

        //list.add()    ctrl + shift + /
        list1.add(0,123);

//        method();

        System.out.println(list1);
    }

    public static void method(){

        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
