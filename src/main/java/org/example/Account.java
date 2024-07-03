package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(Account account) {

        if ((name.length()>=3 && name.length()<=19) && name.equals(name.trim()) && name.contains(" ")){
            return true;
        }else {
            return false;
        }
    }

}
