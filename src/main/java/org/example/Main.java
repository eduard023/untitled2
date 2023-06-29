package org.example;

public class Main {
    public static void main(String[] args) {

        try{
            throw new MyException("Ошибка");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

    }

}