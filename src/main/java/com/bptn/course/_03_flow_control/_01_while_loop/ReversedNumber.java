package com.bptn.course._03_flow_control._01_while_loop;

public class ReversedNumber {
    public static void main(String[] args) {

        int inputNumber = 1200, reversedValue = 0;
// FREEZE CODE END
    
    while (inputNumber > 0) {
        reversedValue= reversedValue * 10 + inputNumber % 10 ;
        inputNumber = inputNumber / 10;
    }

// FREEZE CODE BEGIN
        System.out.println(reversedValue);
    }
}
// FREEZE CODE END
