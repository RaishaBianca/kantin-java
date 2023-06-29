public class kantinVeteran {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new panelWelcome().setVisible(true);
            }
        });
    }
}
