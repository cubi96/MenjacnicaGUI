package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textFieldIznos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(288, 11, 105, 14);
		contentPane.add(lblProdajniKurs);

		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(10, 11, 105, 14);
		contentPane.add(lblKupovniKurs);

		textFieldKupovni = new JTextField();
		textFieldKupovni.setEnabled(false);
		textFieldKupovni.setBounds(10, 36, 132, 20);
		contentPane.add(textFieldKupovni);
		textFieldKupovni.setColumns(10);

		textFieldProdajni = new JTextField();
		textFieldProdajni.setEnabled(false);
		textFieldProdajni.setBounds(288, 36, 132, 20);
		contentPane.add(textFieldProdajni);
		textFieldProdajni.setColumns(10);

		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(164, 11, 46, 14);
		contentPane.add(lblValuta);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
		comboBox.setBounds(164, 36, 105, 20);
		contentPane.add(comboBox);

		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setBounds(10, 85, 46, 14);
		contentPane.add(lblIznos);

		textFieldIznos = new JTextField();
		textFieldIznos.setBounds(10, 110, 86, 20);
		contentPane.add(textFieldIznos);
		textFieldIznos.setColumns(10);

		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(254, 85, 105, 14);
		contentPane.add(lblVrstaTransakcije);

		JRadioButton rdbtnKupovina = new JRadioButton("Kupovina");
		rdbtnKupovina.setSelected(true);
		buttonGroup.add(rdbtnKupovina);
		rdbtnKupovina.setBounds(250, 109, 109, 23);
		contentPane.add(rdbtnKupovina);

		JRadioButton rdbtnProdaja = new JRadioButton("Prodaja");
		buttonGroup.add(rdbtnProdaja);
		rdbtnProdaja.setBounds(250, 135, 109, 23);
		contentPane.add(rdbtnProdaja);

		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textFieldIznos.setText(slider.getValue() + "");

			}
		});
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setBounds(10, 165, 410, 48);
		contentPane.add(slider);

		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kurs = (String) comboBox.getSelectedItem();
				String vrednost = textFieldIznos.getText();
				String rdbt = "";
				if (rdbtnKupovina.isSelected()) {
					rdbt = "Kupovina";
				} else {
					rdbt = "Prodaja";
				}
				MenjacnicaGUI.textArea.setText(MenjacnicaGUI.textArea.getText() + "Naziv valute: " + kurs + " Iznos: "
						+ vrednost + " Vrsta transakcije: " + rdbt + "\n");
			}
		});
		btnIzvrsiZamenu.setBounds(10, 237, 144, 23);
		contentPane.add(btnIzvrsiZamenu);

		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(276, 237, 144, 23);
		contentPane.add(btnOdustani);
	}
}
