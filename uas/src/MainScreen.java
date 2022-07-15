import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MainScreen extends JFrame{
    private JPanel mainPanel;
    private JList listMhs;
    private JTextField tfNim;
    private JTextField tfNama;
    private JTextField tfIpk;
    private JLabel nim;
    private JLabel nama;
    private JLabel ipk;
    private JButton insertButton;
    private JButton clearButton;
    private DefaultListModel defaultListModel = new DefaultListModel();
    private List<String> arrayListMahasiswa = new ArrayList<>();
    private LinkedList<Mahasiswa> listMahasiswa = new LinkedList<>();

    class Mahasiswa {
        private String nim;
        private String nama;
        private String ipk;

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getIpk() {
            return ipk;
        }

        public void setIpk(String ipk) {
            this.ipk = ipk;
        }
    }

    public MainScreen(){
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = tfNim.getText();
                String nama = tfNama.getText();
                String ipk = tfIpk.getText();
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(nim);
                mahasiswa.setNama(nama);
                mahasiswa.setIpk(ipk);

                insertFirst(mahasiswa);
                clearForm();
                refreshDataModel();
            }
        });
    listMhs.addMouseListener(new MouseAdapter() { } );
        listMhs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = listMhs.getSelectedIndex();

                Mahasiswa hasilSearch = search(arrayListMahasiswa.get(index));

                if (hasilSearch != null) {
                    tfNim.setText(hasilSearch.getNim());
                    tfNama.setText(hasilSearch.getNama());
                    tfIpk.setText(hasilSearch.getIpk());
                }
            }
        });
    }

    private Mahasiswa search(String nama) {
        for (Mahasiswa mahasiswa : listMahasiswa) {
            if (mahasiswa == null)
                break;

            if (mahasiswa.getNama().equals(nama))
                return mahasiswa;
        }

        return null;
    }

    private void insertFirst(Mahasiswa mahasiswa) {
        listMahasiswa.InsertFirst(mahasiswa);
    }

    private void refreshDataModel() {
        arrayListMahasiswa.clear();

        for (Mahasiswa mahasiswa : listMahasiswa) {
            if (mahasiswa == null)
                break;

            arrayListMahasiswa.add(mahasiswa.getNama());
        }
        defaultListModel.clear();
        defaultListModel.addAll(arrayListMahasiswa);
        listMhs.setModel(defaultListModel);
    }

    private void clearForm(){
        tfNim.setText("");
        tfNama.setText("");
        tfIpk.setText("");
    }

    public static void main(String [] args){
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }

}
