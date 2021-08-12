package sample;

import javafx.scene.control.TextField;

public class NumberTextField extends TextField {
    public NumberTextField(){
        this.setPromptText("Enter Amount");
    }

    public void replaceText(int i, int i1, String string){
        //25.66
        if (string.matches("^([+]?[0-9]+)?([.|,]([0-9]{1,})?)?$") || string.isEmpty()){
            super.replaceText(i, i1, string);
        }
    }

    /*public void replaceSelection(String string){
        super.replaceSelection(string);
    }*/
}
