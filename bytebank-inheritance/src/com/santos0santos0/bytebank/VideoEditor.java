package com.santos0santos0.bytebank;

public class VideoEditor extends Employee {

    @Override
    public double getBonus() {
        System.out.println("Editor de vídeo");
        return 150;
    }

}
