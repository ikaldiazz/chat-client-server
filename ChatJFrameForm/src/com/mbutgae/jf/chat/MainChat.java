/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbutgae.jf.chat;

/**
 *
 * @author ALPABETAPINTAR
 */
public class MainChat {
    public static void main(String[] args) {
           new GUIServer().setVisible(true);
           new GUIClient("localhost", 1000).setVisible(true);
    }
}
