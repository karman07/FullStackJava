package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
        MyEmployee Karman = new MyEmployee();
        Karman.setName("Karman");
        System.out.println(Karman.getName());
        Karman.setId(234);
        System.out.println(Karman.getId());
    }
}
