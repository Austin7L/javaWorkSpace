import javax.swing.*; 

public class UserInfo {
	public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException{
		JFrame jFrame = new JFrame("User Infromation");
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //重新整理jf容器及其內部元件的外觀
        SwingUtilities.updateComponentTreeUI(jFrame);
        jFrame.setSize(1024,400);
        
        
        JPanel panel = new JPanel();
        jFrame.add(panel);
        
        initComponents(panel);
        
        jFrame.setVisible(true);  
	}
	private static void initComponents(JPanel panel) {
		/* 佈局部份我們這邊不多做介紹
         * 這邊設置佈局為 null
         */
        panel.setLayout(null);

        //創建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 這個方法定義了組件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * 創建文本域用于用戶輸入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        //輸入密碼文本域 
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /* 
         * 這個類似用于輸入的文本域
         * 但是輸入的信息會以點號代替，用于包含密碼的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        //創建登錄按鈕
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
	}

}
