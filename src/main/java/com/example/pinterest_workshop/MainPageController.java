package com.example.pinterest_workshop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.*;
import java.net.URI;

public class MainPageController {
    @FXML
    Button followBtn;
    public void follow(){
        String followBtnText = followBtn.getText();
        if(followBtnText.equals("Follow")){
            followBtn.setText("Unfollow");
        }else{
            followBtn.setText("Follow");
        }
    }
    @FXML
    Button saveBtn;
    public void save(){
        String saveBtnText = saveBtn.getText();
        if(saveBtnText.equals("Save")){
            saveBtn.setText("Saved!");
        }else{
            saveBtn.setText("Save");
        }
    }
    @FXML
    Hyperlink HPL1;
    public void setHPL1(){
        HPL1.setOnAction(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.pinterest.com/mariasmenu/appetiser-recipes/"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}