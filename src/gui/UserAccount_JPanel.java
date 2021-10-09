package gui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.History;
import model.UserAccount;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class UserAccount_JPanel extends JPanel implements ActionListener{
	private JTextField tfAccountNumber,tfAccountName,tfMoney,tfNote;
	private JButton btnAccept,btnCancel;
	private JButton btnTranfer;
	private JPanel mainPanel,panelTranfer,panelHistory,panelWithDraw_Deposit,panel1;
	private CardLayout cardLayout;
	private JMenuItem mnItemProfile,mnItemLogOut,mnItemTranfer,mnItemWithdraw,mnItemDeposit,mnItemHistory;
	private UserAccount u1;
	private JPanel panel_1;
	private JPanel panel_2;
	/**
	 * Create the panel.
	 */
	public UserAccount_JPanel() {
		u1=new UserAccount("Nguyen Van Tuan","Ha Noi","0793173014",50000000,19009999);
		
		//setSize(1200, 750);
		setLayout(new BorderLayout(0, 0));
		
		add(menu(),BorderLayout.NORTH);
		
		panelHistory=new JPanel();
		panelHistory.setPreferredSize(new Dimension(700,740)); 
//		panel.setBorder(new EmptyBorder(50,0,0,0));
		panelHistory.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 79, 79,128));
		add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(300,80));
		panel_1.setBackground(new Color(0, 79, 79,128));
		mainPanel.add(panel_1, BorderLayout.WEST);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(300,80));
		panel_2.setBackground(new Color(0, 79, 79,128));
		mainPanel.add(panel_2, BorderLayout.EAST);
		
		panelTranfer=tranferService();
		//panelHistory=historyService();
		//panelWithDraw_Deposit=withdraw_depositService();
		
		panel1=new JPanel();
		//panel1.setLayout(new BorderLayout(0,0));
		mainPanel.add(panel1,BorderLayout.CENTER);
		
		cardLayout=new CardLayout(0,0);
		panel1.setLayout(cardLayout);
		
		panel1.add("panelTranfer",panelTranfer);
		panel1.add("panelHistory",panelHistory);
		
		
		
		//panel1.add("panelWithDraw_Deposit",panelWithDraw_Deposit);
		
//		mainPanel.add(tranferService());
//		mainPanel.add(withdraw_depositService());
		//panel1.add(historyService());
	
		btnTranfer.addActionListener(this);
		//btnAccept.addActionListener(this);
		btnCancel.addActionListener(this);
		
		mnItemProfile.addActionListener(this);
		mnItemLogOut.addActionListener(this);
		mnItemTranfer.addActionListener(this);
		mnItemWithdraw.addActionListener(this);
		mnItemDeposit.addActionListener(this);
		mnItemHistory.addActionListener(this);
		
	}
	public JPanel tranferService() {
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(100,0,0,0));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 40));
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setPreferredSize(new Dimension(150,30));
		panel.add(lblAccountNumber);
		
		tfAccountNumber = new JTextField();
		panel.add(tfAccountNumber);
		tfAccountNumber.setPreferredSize(new Dimension(250,30));
		
		JLabel lblAccountName = new JLabel("Account Name");
		lblAccountName.setPreferredSize(new Dimension(150, 30));
		panel.add(lblAccountName);
		
		tfAccountName = new JTextField();
		tfAccountName.setPreferredSize(new Dimension(250, 30));
		panel.add(tfAccountName);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setPreferredSize(new Dimension(150, 30));
		panel.add(lblMoney);
		
		tfMoney = new JTextField();
		tfMoney.setPreferredSize(new Dimension(250, 30));
		panel.add(tfMoney);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setPreferredSize(new Dimension(150, 30));
		panel.add(lblNote);
		
		tfNote = new JTextField();
		tfNote.setPreferredSize(new Dimension(250, 30));
		panel.add(tfNote);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setPreferredSize(new Dimension(700, 30));
		panel.add(lblNewLabel);
		
		btnTranfer = new JButton("Tranfer");
		btnTranfer.setPreferredSize(new Dimension(100, 30));
		panel.add(btnTranfer);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setPreferredSize(new Dimension(100, 30));
		panel.add(btnCancel);
		
		return panel;
	}
	public JPanel withdraw_depositService() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(700,720)); 
		panel.setBorder(new EmptyBorder(100,0,0,0));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 40));
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setPreferredSize(new Dimension(150, 30));
		panel.add(lblMoney);
		
		tfMoney = new JTextField();
		tfMoney.setPreferredSize(new Dimension(250, 30));
		panel.add(tfMoney);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setPreferredSize(new Dimension(150, 30));
		panel.add(lblNote);
		
		tfNote = new JTextField();
		tfNote.setPreferredSize(new Dimension(250, 30));
		panel.add(tfNote);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setPreferredSize(new Dimension(700, 30));
		panel.add(lblNewLabel);
		
		btnAccept = new JButton("Accept");
		btnAccept.setPreferredSize(new Dimension(100, 30));
		panel.add(btnAccept);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setPreferredSize(new Dimension(100, 30));
		panel.add(btnCancel);
		
		return panel;
	}
	public JPanel historyService() {
		JPanel panel = new JPanel();
		//panel.setPreferredSize(new Dimension(700,720)); 
//		panel.setBorder(new EmptyBorder(50,0,0,0));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
//		JLabel lblNewLabel_1 = new JLabel("History");
//		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_1.setPreferredSize(new Dimension(700,80));
//		panel.add(lblNewLabel_1);
//		
//		JPanel panelHistory = new JPanel();
//		panelHistory.setPreferredSize(new Dimension(700,160));
//		panelHistory.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
//		panel.add(panelHistory);
//		
//		JLabel lblMoney = new JLabel("Money : ");
//		lblMoney.setPreferredSize(new Dimension(700,30));
//		panelHistory.add(lblMoney);
//		
//		JLabel lblNote = new JLabel("Note : ");
//		lblNote.setPreferredSize(new Dimension(700, 30));
//		panelHistory.add(lblNote);
//		
//		JLabel lblTime = new JLabel("Time : ");
//		lblTime.setPreferredSize(new Dimension(700, 30));
//		panelHistory.add(lblTime);
//		
//		JLabel lblBalance = new JLabel("Balance :");
//		lblBalance.setPreferredSize(new Dimension(700, 30));
//		panelHistory.add(lblBalance);
		
		return panel;
	}
	public JPanel historyService(History h) {
		JPanel panelHistory = new JPanel();
		panelHistory.setPreferredSize(new Dimension(700,160));
		panelHistory.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
		
		JLabel lblMoney = new JLabel();
		lblMoney.setHorizontalAlignment(SwingConstants.LEFT);
		lblMoney.setText("Money : "+h.moneyToString(h.getMoney()));
		lblMoney.setPreferredSize(new Dimension(500,30));
		panelHistory.add(lblMoney);
		
		JLabel lblNote = new JLabel();
		lblNote.setHorizontalAlignment(SwingConstants.LEFT);
		lblNote.setText("Note : "+h.getNote());
		lblNote.setPreferredSize(new Dimension(500, 30));
		panelHistory.add(lblNote);
		
		JLabel lblTime = new JLabel("Time : ");
		lblTime.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime.setText("Time : "+h.dateToString(h.getDate()));
		lblTime.setPreferredSize(new Dimension(500, 30));
		panelHistory.add(lblTime);
		
		JLabel lblBalance = new JLabel("Balance : ");
		lblBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalance.setText("Balance : "+h.moneyToString(h.getBalance()));
		lblBalance.setPreferredSize(new Dimension(500, 30));
		panelHistory.add(lblBalance);
		
		return panelHistory;
	}
	public JMenuBar menu() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(1200,30));
		add(menuBar,BorderLayout.NORTH);
		
		JMenu mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		mnItemProfile = new JMenuItem("Profile");
		mnAccount.add(mnItemProfile);
		
		mnItemLogOut = new JMenuItem("Log Out");
		mnAccount.add(mnItemLogOut);
		
		JMenu mnItemService= new JMenu("Service");
		menuBar.add(mnItemService);
		
		mnItemTranfer = new JMenuItem("Tranfer");
		mnItemService.add(mnItemTranfer);
		
		mnItemWithdraw = new JMenuItem("Withdraw");
		mnItemService.add(mnItemWithdraw);
		
		mnItemDeposit = new JMenuItem("Deposit");
		mnItemService.add(mnItemDeposit);
		
		mnItemHistory = new JMenuItem("History");
		mnItemService.add(mnItemHistory);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mnItem = new JMenuItem("Contact 190000");
		mnHelp.add(mnItem);
		
		return menuBar;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTranfer) {
			System.out.println("btnTranfer");
			//if(mnItemTranfer.isSelected()) {
				UserAccount u2=new UserAccount("Nguyen Dinh Dung","Ha Noi","09999999",9000000,1888888);
				u1.tranfer(u2,Double.parseDouble(tfMoney.getText()) , tfNote.getText());
				//u1.displayHistory();
			//}
//			else if(mnItemDeposit.isSelected()) {
//				u1.deposit(100000,tfNote.getText());
//			}
//			else if(mnItemWithdraw.isSelected()) {
//				u1.withdraw(100000,tfNote.getText());
//			}
		}
		else if(e.getSource()==btnCancel) {
			
		}
		else if(e.getSource()==mnItemProfile) {
			
		}
		else if(e.getSource()==mnItemLogOut) {
			
		}
		else if(e.getSource()==mnItemTranfer) {
			cardLayout.show(panel1, "panelTranfer");
		}
		else if(e.getSource()==mnItemDeposit) {
			cardLayout.show(panel1, "panelWithDraw_Deposit");
		}
		else if(e.getSource()==mnItemWithdraw) {
			cardLayout.show(panel1, "panelWithDraw_Deposit");
		}
		else if(e.getSource()==mnItemHistory) {
			cardLayout.show(panel1, "panelHistory");
			u1.displayHistory();
			System.out.println(u1.getHistoryList().size());
			
			for(int i=0;i<u1.getHistoryList().size();i++) {
				panelHistory.add(historyService(u1.getHistoryList().get(i)));
			}
			
		}
	}

}
