package com.yyn.适配器模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 16:01
 * @description
 */
public class FormatFactory implements Avi{

    private Mp4 mp4;

    public FormatFactory(Mp4 mp4) {
        this.mp4 = mp4;
    }

    @Override
    public void playAvi() {
        System.out.println("avi视频转换为mp4");
        mp4.playMp4();
    }

}
