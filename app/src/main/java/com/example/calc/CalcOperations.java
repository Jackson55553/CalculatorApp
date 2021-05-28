package com.example.calc;

import java.util.ArrayList;

public class CalcOperations {

    public ArrayList<String> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<String> operations) {
        this.operations = operations;
    }

    ArrayList<String> operations = new ArrayList<>();

    public void add(String a){
        operations.add(a);
    }
}
