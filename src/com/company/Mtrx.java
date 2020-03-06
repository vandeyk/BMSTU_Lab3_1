package com.company;

public class Mtrx { //матрИца
    private int [][] nums;
    public Mtrx(int [][] n){ //Конструктор с передачей массива
        this.nums = n;
    }
    public Mtrx(int n, int m, int mn, int mx){ //Конструктор с рандомной генерацией
        nums = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                this.nums[i][j] = mn + (int) (Math.random() * mx);
            }
        }
    }
    public void setNums(int [][] n){
        this.nums = n;
    }
    public void Jingle(int k){ //Переставляем строки с макс и мин в столбце k
        int pos_x = 0;
        int pos_n = 0;
        int buf_x = this.nums[0][k];
        int buf_n = this.nums[0][k];
        for (int i = 0; i < this.nums.length; i++){
            if (this.nums[i][k] > buf_x){
                buf_x = this.nums[i][k];
                pos_x = i;
            }
            if (this.nums[i][k] < buf_n){
                buf_n = this.nums[i][k];
                pos_n = i;
            }
        }
        int [] buf_ar = this.nums[pos_x];
        this.nums[pos_x] = this.nums[pos_n];
        this.nums[pos_n] = buf_ar;
    }
    public void Show(){
        for (int i = 0; i < this.nums.length; i++){
            for (int j = 0; j < this.nums[i].length; j++){
                System.out.print(this.nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
