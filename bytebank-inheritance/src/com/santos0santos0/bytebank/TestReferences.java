package com.santos0santos0.bytebank;

public class TestReferences {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("John");
        manager.setWage(5000.0);

        //
        VideoEditor videoEditor = new VideoEditor();
        videoEditor.setWage(2500.0);

        //
        Designer designer = new Designer();
        designer.setWage(2000.0);

        //
        BonusControl bonusControl = new BonusControl();
        bonusControl.register(manager);
        bonusControl.register(videoEditor);
        bonusControl.register(designer);

        System.out.println(bonusControl.getSum());
    }

}
