package com.appsomniac.resizablerectanglecanvas.customviews;

import java.util.ArrayList;

/**
 * Created by absolutelysaurabh on 29/12/17.
 */

public class BallManager {

    private int ball_number;
    private int ball_x_corr;
    private int ball_y_corr;

    public BallManager(){

    }

    public BallManager(int ball_number, int ball_x_corr, int ball_y_corr){

        this.ball_number = ball_number;
        this.ball_x_corr = ball_x_corr;
        this.ball_y_corr = ball_y_corr;
    }

    public int getBall_number(){
        return ball_number;
    }
    public int getBall_x_corr(){
        return ball_x_corr;
    }
    public int getBall_y_corr(){
        return ball_y_corr;
    }

    public void setBall_number(int ball_number){
        this.ball_number = ball_number;
    }
    public void setBall_x_corr(int ball_x_corr){
        this.ball_x_corr = ball_x_corr;
    }
    public void setBall_y_corr(int ball_y_corr){
        this.ball_y_corr = ball_y_corr;
    }
}
