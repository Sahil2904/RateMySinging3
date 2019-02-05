package com.example.ratemysinging3;

public class member
{


   private String Name;
     private String Age;
     private String id;

    public member()
    {

    }

    public member(String id, String Name, String Age) {
        this.id = id;
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

}



