package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

class CalcAreaListener implements ActionListener {
	private JTextField radius;
	private JTextField area;
	public CalcAreaListener(){}
	
	public CalcAreaListener(JTextField radius, JTextField area){
		this.radius = radius;
		this.area = area;
	}
	
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        String cmd=e.getActionCommand();
        if (cmd.equals("계산")) {
            String var = radius.getText();
            float rad = 0.0f;
            if(!var.equals("")){
            	rad = Float.parseFloat(var);
            	String result = rad*rad*Math.PI+"";
                area.setText(result);
                b.setText("계산했습니다.");
            }else
            	radius.setText("값을 입력하세요.");
            
        } else if (cmd.equals("취소")) {
            System.out.println("취소 버튼");
            b.setText("취소했습니다");
        } else {
            System.out.println("");
        }
    }
}