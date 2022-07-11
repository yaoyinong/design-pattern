package com.yyn.外观模式;

/**
 * @author yaoyinong
 * @date 2022/7/11 13:46
 * @description
 */
public class Computer {

    private LOL lol;
    private DNF dnf;
    private WOW wow;

    public Computer() {
        this.lol = new LOL();
        this.dnf = new DNF();
        this.wow = new WOW();
    }

    public void playLOL() {
        lol.play();
    }

    public void playDNF() {
        dnf.play();
    }

    public void playWOW() {
        wow.play();
    }

}
