package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldSifra = new JTextField();
		textFieldSifra.setEditable(false);
		textFieldSifra.setBounds(10, 36, 189, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);

		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(10, 11, 189, 14);
		contentPane.add(lblSifra);

		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(209, 11, 189, 14);
		contentPane.add(lblNaziv);

		textFieldNaziv = new JTextField();
		textFieldNaziv.setEditable(false);
		textFieldNaziv.setBounds(209, 36, 189, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);

		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(10, 81, 189, 14);
		contentPane.add(lblProdajniKurs);

		textFieldProdajni = new JTextField();
		textFieldProdajni.setEditable(false);
		textFieldProdajni.setBounds(10, 106, 189, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);

		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(209, 81, 189, 14);
		contentPane.add(lblKupovniKurs);

		textFieldKupovni = new JTextField();
		textFieldKupovni.setEditable(false);
		textFieldKupovni.setBounds(209, 106, 189, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);

		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(10, 158, 189, 14);
		contentPane.add(lblSrednjiKurs);

		textFieldSrednji = new JTextField();
		textFieldSrednji.setEditable(false);
		textFieldSrednji.setBounds(10, 183, 189, 20);
		contentPane.add(textFieldSrednji);
		textFieldSrednji.setColumns(10);

		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(209, 158, 189, 14);
		contentPane.add(lblSkraceniNaziv);

		textFieldSkraceni = new JTextField();
		textFieldSkraceni.setEditable(false);
		textFieldSkraceni.setBounds(209, 183, 189, 20);
		contentPane.add(textFieldSkraceni);
		textFieldSkraceni.setColumns(10);

		JCheckBox chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
		

		chckbxZaistaObrisiKurs.setBounds(10, 232, 189, 23);
		contentPane.add(chckbxZaistaObrisiKurs);

		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = "Sifra: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText()
						+ " Kupovni kurs: " + textFieldKupovni.getText() + " Srednji kurs: "
						+ textFieldSrednji.getText() + " Prodajni kurs: " + textFieldProdajni.getText()
						+ " Skracenica: " + textFieldSkraceni.getText();
				MenjacnicaGUI.textArea.append(txt + "\n");
			}
		});
		btnObrisi.setEnabled(false);
		btnObrisi.setBounds(10, 284, 189, 23);
		contentPane.add(btnObrisi);

		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(209, 284, 189, 23);
		contentPane.add(btnOdustani);
		chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxZaistaObrisiKurs.isSelected()) {
					btnObrisi.setEnabled(true);
				}else{
					btnObrisi.setEnabled(false);
				}
			}
		});
	}
}
