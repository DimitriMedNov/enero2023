package com.mayab.desarrollo.main;

import com.mayab.desarrollo.vistas.LoginForm;

import javax.swing.*;

public class TestForm {
    public static void main(String[] args) {
        try{
            LoginForm form = new LoginForm();
            form.setSize(500,200);
            form.setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid username and password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

