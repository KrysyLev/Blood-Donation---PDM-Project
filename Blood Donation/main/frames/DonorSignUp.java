package main.frames;

import java.awt.event.ActionEvent;

public class DonorSignUp extends SignUpStruct{
    public DonorSignUp(){
        super();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            super.signUpCompleted(true);
        }
    }
}