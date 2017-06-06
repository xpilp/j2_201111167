package com.address_book.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.address_book.controller.AddressController;
import com.address_book.controller.AddressManager;

public class AddressView extends JFrame implements ActionListener{
	private JPanel panel;
	private JTable table;
	private JButton addBtn,rmvBtn,modBtn;
	private AddressManager manager;
	
	public AddressView(){
		super("주소록");
		super.setPreferredSize(new Dimension(1000,500));
		super.setLocation(500, 400);
		
		manager = new AddressController();
		createComponent();
		
		addComponent();

		addBtn.addActionListener(this);
		rmvBtn.addActionListener(this);
		modBtn.addActionListener(this);
		
		//super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				manager.close();
				System.exit(0);
			}
		});
		super.pack();
		super.setVisible(true);
	}
	
	private void createComponent(){
		table = new JTable();
		loadAddress();
		panel = new JPanel();
		addBtn = new JButton("추가");
		modBtn = new JButton("수정");
		rmvBtn = new JButton("삭제");
	}
	
	private void addComponent(){
		super.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
		panel.add(addBtn);
		panel.add(rmvBtn);
		panel.add(modBtn);
		super.getContentPane().add(panel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		int row = table.getSelectedRow();
		if(e.getActionCommand().equals("추가")){
			ModalView modal = new ModalView(this,e.getActionCommand(), null, manager);
			loadAddress();
		}else if(row!=-1){
			if(e.getActionCommand().equals("수정")){
				
				String name = (String)table.getValueAt(row, 0);
				String email = (String)table.getValueAt(row, 1);
				String phone = (String)table.getValueAt(row, 2);
				String address = (String)table.getValueAt(row, 3);
				String belong = (String)table.getValueAt(row, 4);
				
				AddressBean data = new AddressBean(name, email, phone, belong, address);
				
				ModalView modal = new ModalView(this,e.getActionCommand(), data, manager);
			}else{
				
				String name = (String)table.getValueAt(row, 0);
				String email = (String)table.getValueAt(row, 1);
				String phone = (String)table.getValueAt(row, 2);
				String address = (String)table.getValueAt(row, 3);
				String belong = (String)table.getValueAt(row, 4);
				
				AddressBean bean = new AddressBean(name, email, phone, belong, address);
				manager.deleteAddress(bean);
			}
			loadAddress();
		}
		
		
	}
	
	public void loadAddress(){
		List<AddressBean> addressBook = manager.loadAddress();
		
		Object[][] data = new Object[addressBook.size()][5];
		
		for(int i=0;i<addressBook.size();i++){
			data[i][0] = addressBook.get(i).getName();
			data[i][1] = addressBook.get(i).getEmail();
			data[i][2] = addressBook.get(i).getPhone();
			data[i][3] = addressBook.get(i).getAddress();
			data[i][4] = addressBook.get(i).getBelong();
		}
		
		String[] colNames = {"이름","이메일","전화번호","주소","소속"};
		DefaultTableModel tModel = new DefaultTableModel(colNames, 0);
		
		for(int i=0;i<addressBook.size();i++)
			tModel.addRow(data[i]);
		
		table.setModel(tModel);
	}
	
}