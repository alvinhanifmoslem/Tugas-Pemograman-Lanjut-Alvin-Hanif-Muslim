import javax.swing.*;
import java.awt.event.KeyEvent;

public class AplikasiInventoryBarang {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JButton tambahButton;
    private JButton bersihButton;
    private JButton cancelButton;
    private JTextArea textArea1;
    private JButton ubahButton;
    private JButton hapusButton;
    private JLabel txtNamaKategori;
    private JLabel txtKodeKategori;
    private KeyEvent evt;

    private void createUIComponents() {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtNamaKategori.requestFocus();
    }
    }


    private void txtKodeKategoriKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNamaKategori.requestFocus();
        }
    }
}
