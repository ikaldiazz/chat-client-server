/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbutgae.misc;

/**
 *
 * @author ALPABETAPINTAR
 */
import java.util.Calendar;
import javax.swing.JLabel;

public class Clock implements Runnable {

    JLabel jb;

//Constructor takes the clock JLabel
    public Clock(JLabel jb) {
        this.jb = jb;
    }

    public void run() {
        while (true) {
            try {
                //Thread sleeps & updates ever 1 second, so the clock changes every 1 second.
                jb.setText(timeNow());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

//Gets the current time.
    public String timeNow() {
        Calendar now = Calendar.getInstance();
        int hrs = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        
        int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekStr = String.valueOf(dayOfWeek);
        
        int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        String dayOfMonthStr = String.valueOf(dayOfMonth);
        
        int month = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);
        
        
        
        String time = dayOfMonthStr +"-"+month+"-"+year+ " | "+zero(hrs) + ":" + zero(min) + ":" + zero(sec);
        return time;
    }

    //Sets the zeroes needed within our hh/mm/ss clock.
    public String zero(int num) {
        String number = (num < 10) ? ("0" + num) : ("" + num);
        return number;
    }

    public void clock(JLabel jb) {
        Clock c1 = new Clock(jb);
        Thread t1 = new Thread(c1);
        t1.start();
    }
}
