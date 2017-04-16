package com.address_book.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddressView extends JFrame implements ActionListener{
	private JPanel panel;
	private JTable table;
	private JButton addBtn,rmvBtn,modBtn;
	
	public AddressView(){
		super("�ּҷ�");
		super.setPreferredSize(new Dimension(1000,500));
		super.setLocation(500, 400);
		
		createComponent();
		
		addComponent();
		
		addBtn.addActionListener(this);
		modBtn.addActionListener(this);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.pack();
		super.setVisible(true);
	}
	
	private void createComponent(){
		String[] colNames = {"�̸�","�̸���","��ȭ��ȣ","�ּ�","�Ҽ�"};
		DefaultTableModel tModel = new DefaultTableModel(colNames, 0);
		table = new JTable(tModel);
		panel = new JPanel();
		addBtn = new JButton("�߰�");
		rmvBtn = new JButton("����");
		modBtn = new JButton("����");
	}
	
	private void addComponent(){
		super.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
		panel.add(addBtn);
		panel.add(rmvBtn);
		panel.add(modBtn);
		super.getContentPane().add(panel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		AddressView address = new AddressView();
	}

	public void actionPerformed(ActionEvent e) {
		ModalView modal = new ModalView(this, "�׽�Ʈ", null);
	}
}
