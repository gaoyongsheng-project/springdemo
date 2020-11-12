package com.example.binarysearch;

import javax.jws.soap.SOAPBinding;

public class Test {


    public String fun1() throws Exception{
        try {
            int a=1;
            int b=2;
            int c=a+b;
            if(c==3){
                return "ok";
            }
        }finally {
            System.out.println("finally2");
        }
return "最后结果";
    }


    public void result(){
        Integer a=300;
        Integer b=300;
        System.out.println(a==b);
    }

    public static void main(String[] args)throws Exception{
        Test test=new Test();
        //System.out.println(test.fun1());
        test.result();
    }

}
