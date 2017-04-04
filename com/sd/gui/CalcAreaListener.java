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
        if (cmd.equals("���")) {
            String var = radius.getText();
            float rad = 0.0f;
            if(!var.equals("")){
            	rad = Float.parseFloat(var);
            	String result = rad*rad*Math.PI+"";
                area.setText(result);
                b.setText("����߽��ϴ�.");
            }else
            	radius.setText("���� �Է��ϼ���.");
            
        } else if (cmd.equals("���")) {
            System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
        } else {
            System.out.println("");
        }
    }
}