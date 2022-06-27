public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello, World!");
        ID_PW id_pw = new ID_PW();
        new ATM_panel(id_pw.getLoginInfo());
    }
}
