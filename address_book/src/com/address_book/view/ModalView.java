package com.address_book.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.address_book.controller.AddressController;
import com.address_book.controller.AddressManager;

public class ModalView extends JDialog implements ActionListener{
	private JPanel panel1,panel2;
	private JTextField name,email,phone,belong,address;
	private JButton okBtn,cancelBtn;
	private String type;
	private AddressManager manager;
	private AddressBean origin;
	
	public ModalView(JFrame frame, String title, AddressBean info, AddressManager manager){
		super(frame, title, true);
		super.setSize(400, 200);
		super.setLocation(500,400);
		
		this.manager = manager;
		origin = info;
		createComponent();
		addComponent();

		okBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		type = title;
		
		if(type.equals("수정"))
			setTextFields();		
		
		super.setResizable(false);
		super.setVisible(true);
	}
	
	private void createComponent(){
		panel1 = new JPanel();
		panel2 = new JPanel();
		name = new JTextField(20);
		email = new JTextField(20);
		phone = new JTextField(20);
		belong = new JTextField(20);
		address = new JTextField(20);
		
		okBtn = new JButton("확인");
		cancelBtn = new JButton("취소");
	}
	
	private void addComponent(){
		super.getContentPane().add(panel1,BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(5, 2));
		panel1.add(new JLabel("이름"));
		panel1.add(name,BorderLayout.CENTER);
		panel1.add(new JLabel("이메일"));
		panel1.add(email,BorderLayout.CENTER);
		panel1.add(new JLabel("전화번호"));
		panel1.add(phone,BorderLayout.CENTER);
		panel1.add(new JLabel("주소"));
		panel1.add(address,BorderLayout.CENTER);
		panel1.add(new JLabel("소속"));
		panel1.add(belong,BorderLayout.CENTER);
		
		panel2.add(okBtn);
		panel2.add(cancelBtn);
		super.getContentPane().add(panel2, BorderLayout.SOUTH);
		
	}
	
	private void setTextFields(){
		name.setText(origin.getName());
		email.setText(origin.getEmail());
		phone.setText(origin.getPhone());
		address.setText(origin.getAddress());
		belong.setText(origin.getBelong());
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		if(btn.getActionCommand().equals("확인")){
			
			String name = this.name.getText();
			String email = this.email.getText();
			String phone = this.phone.getText();
			String belong = this.belong.getText();
			String address = this.address.getText();
			AddressBean bean = new AddressBean(name, email, phone, belong, address);
			
			if(!(name.equals("")||email.equals("")||phone.equals(""))){
				if(type.equals("수정"))
					manager.updateAddress(origin,bean);
				else
					manager.addAddress(bean);
				this.dispose();
			}
				
		}else
			this.dispose();
	}
}
