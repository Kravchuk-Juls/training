package com.codespace.workBT33.task2;

public class MySumCount1 extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private long resultSum;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setResultSum(long resultSum) {
        this.resultSum = resultSum;
    }


    @Override
    public void run() {
        if (myArray == null || startIndex < 0 || stopIndex == 0 ||
                stopIndex < startIndex ||
                stopIndex >= myArray.length) {
            System.out.println("Invalid value");
            return;
        }

        for (int i = startIndex; i <= stopIndex; i++) {
            resultSum += myArray[i];
        }
    }
}
