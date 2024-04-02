package com.example;

 // propriedades/atributos publicos
public class Users {
    public String name;
    public String lastName;
    public int age;

    private  long id = 2064546L;

// comportamentos
// methodos/funçõess publicas
    public String PrintFullName(){
        return name + lastName;
    }

    public int PrintAge(){
        return this.age;
    }

    public  long printId(){
        return  id;
    }

}
