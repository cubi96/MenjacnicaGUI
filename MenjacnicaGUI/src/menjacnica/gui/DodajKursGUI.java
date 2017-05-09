package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkracenica;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(10, 27, 193, 14);
		contentPane.add(lblSifra);

		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(10, 45, 193, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);

		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(215, 27, 193, 14);
		contentPane.add(lblNaziv);

		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(215, 45, 193, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);

		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(10, 115, 193, 14);
		contentPane.add(lblProdajniKurs);

		textFieldProdajni = new JTextField();
		textFieldProdajni.setBounds(10, 140, 193, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);

		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(215, 115, 193, 14);
		contentPane.add(lblKupovniKurs);

		textFieldKupovni = new JTextField();
		textFieldKupovni.setBounds(215, 140, 193, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);

		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(10, 203, 193, 14);
		contentPane.add(lblSrednjiKurs);

		textFieldSrednji = new JTextField();
		textFieldSrednji.setBounds(10, 228, 193, 20);
		contentPane.add(textFieldSrednji);
		textFieldSrednji.setColumns(10);

		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(215, 203, 193, 14);
		contentPane.add(lblSkraceniNaziv);

		textFieldSkracenica = new JTextField();
		textFieldSkracenica.setBounds(215, 228, 193, 20);
		contentPane.add(textFieldSkracenica);
		textFieldSkracenica.setColumns(10);

		btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = "Sifra: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText()
						+ " Kupovni kurs: " + textFieldKupovni.getText() + " Srednji kurs: "
						+ textFieldSrednji.getText() + " Prodajni kurs: " + textFieldProdajni.getText()
						+ " Skracenica: " + textFieldSkracenica.getText();
				MenjacnicaGUI.textArea.setText(MenjacnicaGUI.textArea.getText() + txt + "\n");
			}
		});
		btnDodaj.setBounds(10, 277, 193, 23);
		contentPane.add(btnDodaj);

		btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();// sluzi da zatvori prozor ali da app nastavi sa radom
			}
		});
		btnOdustani.setBounds(215, 277, 193, 23);
		contentPane.add(btnOdustani);
	}
}
