package com.example.phoenixcorp;

import java.util.ArrayList;

public class record {
    private String name;
    private int year, month;
    private double profit;

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int value) {
        if (value >= 1)
            this.year = value;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int value) {
        if (value >= 1 && value <= 12)
            this.month = value;
    }

    public double getProfit() {
        return this.profit;
    }

    public void setProfit(double value) {
        if (value >= 0)
            this.profit = value;
    }

    public record(String name, int year, int month, double profit) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.profit = profit;
    }
    
    public Boolean IsExist(ArrayList<record> records) {
        for (int i = 0; i < records.size(); i++) {
            record rec = records.get(i);
            if (rec.name == this.name && rec.year == this.year && rec.month == this.month)
                return true;
        }
        return false;
    }
}
