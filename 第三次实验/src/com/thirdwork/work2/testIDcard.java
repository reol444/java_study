package com.thirdwork.work2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testIDcard {
    public boolean regexCheck(String ID) {
        if(null == ID)
            return false;
        ID = ID.trim();
        if (15 == ID.length()||18 == ID.length()){
            Pattern pattern = Pattern.compile("^(\\d{6}(18|19|20)\\d{2}(0[1-9]|1[12])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|X|x))|(\\d{8}(0[1-9]|1[12])(0[1-9]|[12]\\d|3[01])\\d{3})$");
            Matcher m = pattern.matcher(ID);
            return (m.matches())?true:false;
        }
        else{
            return false;
        }
    }
    public void check(String ID){
        if(regexCheck(ID)){
            System.out.println("身份证号"+ID+"正确");
        }
        else{
            System.out.println("身份证号"+ID+"错误");
        }
    }
}

/*		15位旧居民身份证：
 * 	    "\\d{8}"                  1~6位分别代表省市县，这里不取字典表校验，只校验是否数字。
 * 								  7~8位代表年份后两位数字
 * 		"(0[1-9]|1[12])"          8~10位代表月份，01~12月
 * 		"(0[1-9]|[12]\\d|3[01])"  10~12位代表日期，1~31日
 * 		"\\d{3}"                  12~15位为三位顺序号
 *
 *     	18位新居民身份证：
 * 	    "\\d{6}"                  1~6位分别代表省市县，这里不取字典表校验，只校验是否数字。
 * 		"(18|19|20)\\d{2}"        7~10位代表年份，前两位18、19、20即19世纪、20世纪、21世纪，后两位数字。
 * 		中国寿星之首：阿丽米罕·色依提，女，1886年6月25日出生于新疆疏勒县，现年134岁，身份证起始日期在19世纪
 * 		"(0[1-9]|1[12])"          11~12位代表月份，01~12月
 * 		"(0[1-9]|[12]\\d|3[01])"  13~14位代表日期，1~31日
 * 		"\\d{3}"                  15~17位为三位顺序号
 * 		"(\\d|X|x)"               18位为校验位数字，允许字母x和X
 *
 * 		正则表达式合并为：
 * 		^(\\d{6}(18|19|20)\\d{2}(0[1-9]|1[12])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|X|x))|(\\d{8}(0[1-9]|1[12])(0[1-9]|[12]\\d|3[01])\\d{3})$
 * */
