/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteioacamps;

/**
 *
 * @author lucassouza
 */
public class NumberRecord {
    private int number;
    private boolean task;
    private boolean gift;
    private boolean other;

    // Constructor
    public NumberRecord(int number, boolean task, boolean gift, boolean other) {
        this.number = number;
        this.task = task;
        this.gift = gift;
        this.other = other;
    }

    // Getter methods
    public int getNumber() {
        return number;
    }

    public boolean isTask() {
        return task;
    }

    public boolean isGift() {
        return gift;
    }

    public boolean isOther() {
        return other;
    }

    // Setter methods
    public void setNumber(int number) {
        this.number = number;
    }

    public void setTask(boolean task) {
        this.task = task;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    @Override
    public String toString() {
        String record = "";
        record += number+";"+task+";"+gift+";"+other+"\n";
        return record;
    }
}

   
