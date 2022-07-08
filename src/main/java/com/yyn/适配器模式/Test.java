package com.yyn.适配器模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 16:02
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Mp4 mp4 = new VideoPlayer();
        mp4.playMp4();
        Avi avi = new FormatFactory(mp4);
        avi.playAvi();
    }

}
