package com.example.midterms;

import androidx.annotation.NonNull;

public class Pipe {
    String brand;
    double diameter;

    public Pipe(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    @NonNull
    @Override
    public String toString() {
        return brand + "(" + diameter + ")";
    }

    // TODO Milestone 1: Fix spPipe adapter.

}
