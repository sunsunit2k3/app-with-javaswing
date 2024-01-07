package mobilestore;


public class MobileStore {

    public static void main(String[] args) {
        LoadScreen lc = new LoadScreen();
        lc.setLocationRelativeTo(null);
        lc.setVisible(true);
        lc.runSplash(lc);
    }
    
    
}
