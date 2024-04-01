package com.example;

 // propriedades/atributos publicos
public class Users {
    public String name;
    public String lastName;
    public int age;

// comportamentos
// methodos/funçõess publicas
    public String PrintFullName(){
        return name + lastName;
    }

    public int PrintAge(){
        return this.age;
    }
}
