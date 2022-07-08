package com.yyn.适配器模式;

/**
 * @author yaoyinong
 * @date 2022/7/8 15:54
 * @description
 */
public class VideoPlayer implements Mp4 {
    @Override
    public void playMp4() {
        System.out.println("播放MP4视频");
    }
}
