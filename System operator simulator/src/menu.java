// glavni dio aplikacije (main i pokretaè)

import java.awt.EventQueue;
import java.awt.*; 
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class menu {

	private JFrame frmModeliranjeProcesnihInformacijskih;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frmModeliranjeProcesnihInformacijskih.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//inicijalizacija uredjaja
	
	/*
	 * kreiranje i postavljanje poèetnih vrijednosti ureðaja
	 */
	
	prekidac prekidacD = new prekidac();
	prekidac prekidacS = new prekidac();
	ri riD = new ri();
	rs1 rs1D = new rs1();
	rs1 rs1S = new rs1();
	rs2 rs2D = new rs2();
	rs2 rs2S = new rs2();
	ru ruD = new ru();
	disZas disZasD = new disZas();
	apu apuD = new apu();
	nadZas nadZasD = new nadZas();
	
	/*
	 * kreiranje lista
	 */
	listaSviDalekovodno listaSviD = new listaSviDalekovodno();
	listaPrekDal listaPD = new listaPrekDal();
	listaRasi listaRI = new listaRasi();
	listaRaS1 listaS1 = new listaRaS1();
	listaRaS2 listaS2 = new listaRaS2();
	listaRaUz listaRU = new listaRaUz();
	listaDisZas listaDZ = new listaDisZas();
	listaApu listaA = new listaApu();
	listaNadZas listaNZ = new listaNadZas();
	
	listaSviSpojno listaSviS = new listaSviSpojno();
	listaPrekSP listaPS = new listaPrekSP();
	listaRaS1SP listaS1S = new listaRaS1SP();
	listaRaS2SP listaS2S = new listaRaS2SP();
	
	// stvaranje varijabli sa samo ukljuèenje/iskljuèenje polja
	boolean poljeD = true;
	boolean poljeS = false;
	
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	
	private void initialize() {
		//postavljanje varijabli spojnog polja
		prekidacS.komanda = false;
		prekidacS.stanje = 0;
		rs1S.komanda = false;
		rs1S.stanje = 0;
		rs2S.komanda = false;
		rs2S.stanje = 0;
		
		/*
		 * INICIJALIZACIJA SUÈELJA
		 */
		frmModeliranjeProcesnihInformacijskih = new JFrame();
		frmModeliranjeProcesnihInformacijskih.getContentPane().setBackground(new Color(204, 204, 255));
		frmModeliranjeProcesnihInformacijskih.setForeground(new Color(0, 0, 0));
		frmModeliranjeProcesnihInformacijskih.setBackground(Color.WHITE);
		frmModeliranjeProcesnihInformacijskih.setFont(new Font("Arial", Font.PLAIN, 17));
		frmModeliranjeProcesnihInformacijskih.setTitle("Modeliranje procesnih informacijskih sustava - aplikacija");
		frmModeliranjeProcesnihInformacijskih.setBounds(100, 100, (int)width - 100, (int)height - 75);
		frmModeliranjeProcesnihInformacijskih.getContentPane().setLayout(null);
		
		/*
		 * LABELE
		 */
		Label labelSP = new Label("Spojno polje");
		labelSP.setFont(new Font("Arial Black", Font.BOLD, 22));
		labelSP.setAlignment(Label.CENTER);
		labelSP.setBounds(1164, 10, 269, 87);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelSP);
		
		Label labelDP = new Label("Dalekovodno polje");
		labelDP.setFont(new Font("Arial Black", Font.BOLD, 22));
		labelDP.setAlignment(Label.CENTER);
		labelDP.setBounds(70, 0, 269, 60);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelDP);
		
		Label labelLSSD = new Label("Liste svih signala");
		labelLSSD.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelLSSD.setAlignment(Label.CENTER);
		labelLSSD.setBounds(10, 445, 173, 41);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelLSSD);
		
		Label labelTLD = new Label("Liste trenutnih signala");
		labelTLD.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelTLD.setAlignment(Label.CENTER);
		labelTLD.setBounds(189, 445, 173, 41);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelTLD);
		
		Label labelLSSS = new Label("Liste svih signala");
		labelLSSS.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelLSSS.setAlignment(Label.CENTER);
		labelLSSS.setBounds(1128, 445, 173, 41);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelLSSS);
		
		Label labelTLS = new Label("Liste trenutnih signala");
		labelTLS.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelTLS.setAlignment(Label.CENTER);
		labelTLS.setBounds(1301, 445, 173, 41);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(labelTLS);
		
		//prikaz sheme
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\2.jpg"));
		lblNewLabel.setBounds(400, 10, 692, 339);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(lblNewLabel);
		
		/*
		 * TEKSTUALNI TERMINAL
		 */
		TextArea textArea = new TextArea();
		textArea.setBounds(382, 451, 735, 311);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(textArea);
		
		/*
		 * PRIKAZ UKLJUÈENIH/ISKLJUÈENIH UREÐAJA
		 */
		
		Checkbox checkboxPreDP = new Checkbox("Prekida\u010D");
		checkboxPreDP.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxPreDP.setForeground(Color.BLACK);
		checkboxPreDP.setState(true);
		checkboxPreDP.setEnabled(false);
		checkboxPreDP.setBounds(31, 316, 95, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxPreDP);
		
		Checkbox checkboxRasIzl = new Checkbox("Rastavlja\u010D izlazni");
		checkboxRasIzl.setEnabled(false);
		checkboxRasIzl.setState(true);
		checkboxRasIzl.setBounds(31, 344, 122, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasIzl);
		
		Checkbox checkboxRasS1DP = new Checkbox("Rastavlja\u010D sabirni\u010Dki - S1");
		checkboxRasS1DP.setEnabled(false);
		checkboxRasS1DP.setBounds(31, 372, 154, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasS1DP);
		
		Checkbox checkboxRasS2DP = new Checkbox("Rastavlja\u010D sabirni\u010Dki - S2");
		checkboxRasS2DP.setState(true);
		checkboxRasS2DP.setEnabled(false);
		checkboxRasS2DP.setBounds(31, 400, 154, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasS2DP);
				
		Checkbox checkboxRasUz = new Checkbox("Rastavlja\u010D uzemljenja");
		checkboxRasUz.setEnabled(false);
		checkboxRasUz.setBounds(31, 428, 139, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasUz);
		
		/*
		 * PRIZAK ON/OFF UREÐAJA ZA SPOJNO POLJE
		 */
		Checkbox checkboxPreSP = new Checkbox("Prekida\u010D");
		checkboxPreSP.setEnabled(false);
		checkboxPreSP.setBounds(1133, 333, 95, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxPreSP);
		
		Checkbox checkboxRasS1SP = new Checkbox("Rastavlja\u010D sabirni\u010Dki - S1");
		checkboxRasS1SP.setEnabled(false);
		checkboxRasS1SP.setBounds(1133, 361, 154, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasS1SP);
		
		Checkbox checkboxRasS2SP = new Checkbox("Rastavlja\u010D sabirni\u010Dki - S2");
		checkboxRasS2SP.setEnabled(false);
		checkboxRasS2SP.setBounds(1133, 389, 154, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxRasS2SP);
		
		Checkbox checkboxDisZas = new Checkbox("Distantna za\u0161tita");
		checkboxDisZas.setForeground(Color.BLACK);
		checkboxDisZas.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxDisZas.setEnabled(false);
		checkboxDisZas.setBounds(222, 344, 117, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxDisZas);
		
		Checkbox checkboxApu = new Checkbox("APU");
		checkboxApu.setForeground(Color.BLACK);
		checkboxApu.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxApu.setEnabled(false);
		checkboxApu.setBounds(222, 372, 95, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxApu);
		
		Checkbox checkboxNadZas = new Checkbox("Nadstrujna za\u0161tita");
		checkboxNadZas.setForeground(Color.BLACK);
		checkboxNadZas.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxNadZas.setEnabled(false);
		checkboxNadZas.setBounds(222, 400, 127, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxNadZas);
		
		
		/*
		 * GUMBI ZA LISTE SIGNALA DALEKOVODNOG POLJA
		 */
		
		Button sviSignali = new Button("Svi signali");
		sviSignali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaSviD.lista);
			}
		});
		sviSignali.setBackground(new Color(255, 255, 153));
		sviSignali.setFont(new Font("Dialog", Font.BOLD, 15));
		sviSignali.setBounds(10, 489, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(sviSignali);
		
		Button prekidac = new Button("Prekida\u010D");
		prekidac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaPD.lista);
			}
		});
		prekidac.setBackground(new Color(255, 255, 153));
		prekidac.setFont(new Font("Dialog", Font.BOLD, 15));
		prekidac.setBounds(10, 520, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(prekidac);
		
		Button rastavljacIzlazni = new Button("Rastavlja\u010D izlazni");
		rastavljacIzlazni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaRI.lista);
			}
		});
		rastavljacIzlazni.setBackground(new Color(255, 255, 153));
		rastavljacIzlazni.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacIzlazni.setBounds(10, 551, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacIzlazni);
		
		Button rastavljacSabirnickiS1 = new Button("Rastavlja\u010D sabirni\u010Dki-S1");
		rastavljacSabirnickiS1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaS1.lista);
			}
		});
		rastavljacSabirnickiS1.setBackground(new Color(255, 255, 153));
		rastavljacSabirnickiS1.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacSabirnickiS1.setBounds(10, 582, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacSabirnickiS1);
		
		Button rastavljacSabirnickiS2 = new Button("Rastavlja\u010D sabirni\u010Dki-S2");
		rastavljacSabirnickiS2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaS2.lista);
			}
		});
		rastavljacSabirnickiS2.setBackground(new Color(255, 255, 153));
		rastavljacSabirnickiS2.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacSabirnickiS2.setBounds(10, 613, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacSabirnickiS2);
		
		Button rastavljacUzemljenja = new Button("Rastavlja\u010D uzemljenja");
		rastavljacUzemljenja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaRU.lista);
			}
		});
		rastavljacUzemljenja.setBackground(new Color(255, 255, 153));
		rastavljacUzemljenja.setForeground(new Color(0, 0, 0));
		rastavljacUzemljenja.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacUzemljenja.setBounds(10, 644, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacUzemljenja);
		
		Button distantnaZastita = new Button("Distantna za\u0161tita");
		distantnaZastita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaDZ.lista);
			}
		});
		distantnaZastita.setForeground(Color.BLACK);
		distantnaZastita.setFont(new Font("Dialog", Font.BOLD, 15));
		distantnaZastita.setBackground(new Color(255, 255, 153));
		distantnaZastita.setBounds(10, 675, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(distantnaZastita);
		
		Button apu = new Button("APU");
		apu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaA.lista);
			}
		});
		apu.setForeground(Color.BLACK);
		apu.setFont(new Font("Dialog", Font.BOLD, 15));
		apu.setBackground(new Color(255, 255, 153));
		apu.setBounds(10, 706, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(apu);
		
		Button nadstrujnaZastita = new Button("Nadstrujna za\u0161tita");
		nadstrujnaZastita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaNZ.lista);
			}
		});
		nadstrujnaZastita.setForeground(Color.BLACK);
		nadstrujnaZastita.setFont(new Font("Dialog", Font.BOLD, 15));
		nadstrujnaZastita.setBackground(new Color(255, 255, 153));
		nadstrujnaZastita.setBounds(10, 737, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(nadstrujnaZastita);
		
		/*
		 *	TRENUTNI SIGNALI - DALEKOVODNO POLJE
		 */
		
		
		// svi signali trenutni
		Button sviSignaliTR = new Button("Svi signali");
		sviSignaliTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sviDPTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA SVIH TRENUTNIH SIGNALA DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "komanda    " + ((prekidacD.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "stanje    " + ((prekidacD.stanje == 1) ? "ukljucen\n" : "iskljucen\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "gubitak-SF6-upozorenje    " + ((prekidacD.gubitakSF6 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "blokada-rada    " + ((prekidacD.blokadaRada == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "blokada-iskopa    " + ((prekidacD.blokadaIskopa == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "opruga-navijena-kvar    " + ((prekidacD.oprugaNavijenaKvar == true) ? "prorada\n\n" : "prestanak\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-izlazni    " + "komanda    " + ((riD.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-izlazni    " + "stanje    " + ((riD.stanje == 1) ? "ukljucen\n\n" : "iskljucen\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s1    " + "komanda    " + ((rs1D.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s1    " + "stanje    " + ((rs1D.stanje == 1) ? "ukljucen\n\n" : "iskljucen\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s2    " + "komanda    " + ((rs2D.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s2    " + "stanje    " + ((rs2D.stanje == 1) ? "ukljucen\n\n" : "iskljucen\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-uzemljenja    " + "stanje    " + ((ruD.stanje == 1) ? "ukljucen\n" : "iskljucen\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "iskljucenje    " + ((disZasD.iskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l1-poticaj    " + ((disZasD.fazaL1 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l2poticaj    " + ((disZasD.fazaL2 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l3-poticaj    " + ((disZasD.fazaL3 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "zemljospoj-poticaj    " + ((disZasD.zemljospoj == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "2.stupanj-iskljucenje    " + ((disZasD.stupanj2 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "3.stupanj-iskljucenje    " + ((disZasD.stupanj3 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "4.stupanj-iskljucenje    " + ((disZasD.stupanj4 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "suprotni-smjer-poticaj    " + ((disZasD.suprotniSmjer == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "njihanje-energije-blokada    " + ((disZasD.njihanjeEnergije == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-prijem    " + ((disZasD.TKsignalPrijem == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-slanje    " + ((disZasD.TKsignalSlanje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-iskljucenje    " + ((disZasD.TKsignalIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "napajanje-nestanak    " + ((disZasD.napajanjeNestanak == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "uredjaj-kvar    " + ((disZasD.uredjajKvar == true) ? "prorada\n" : "prestanak\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-ukljucenje    " + ((apuD.apuUkljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-1p    " + ((apuD.apu1p == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-3p    " + ((apuD.apu3p == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-blokada    " + ((apuD.apuBlokada == true) ? "prorada\n" : "prestanak\n\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "npc-iskljucenje    " + ((nadZasD.npcIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "vpc-iskljucenje    " + ((nadZasD.vpcIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "zemljospojna-iskljucenje    " + ((nadZasD.zemljospojnaIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "od-preopterecenja-upozorenje    " + ((nadZasD.preoptUpozorenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "od-preopterecenja-iskljucenje    " + ((nadZasD.preoptIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "relej-kvar    " + ((nadZasD.relejKvar == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(sviDPTR);
			}
		});
		sviSignaliTR.setBackground(new Color(255, 255, 153));
		sviSignaliTR.setFont(new Font("Dialog", Font.BOLD, 15));
		sviSignaliTR.setBounds(189, 489, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(sviSignaliTR);
		
		
		// prekidac trenutni
		Button prekidacTR = new Button("Prekida\u010D");
		prekidacTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prekDPTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA PREKIDAÈ DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "komanda    " + ((prekidacD.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "stanje    " + ((prekidacD.stanje == 1) ? "ukljucen\n" : "iskljucen\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "gubitak-SF6-upozorenje    " + ((prekidacD.gubitakSF6 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "blokada-rada    " + ((prekidacD.blokadaRada == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "blokada-iskopa    " + ((prekidacD.blokadaIskopa == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "prekidac    " + "opruga-navijena-kvar    " + ((prekidacD.oprugaNavijenaKvar == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(prekDPTR);
				
			}
		});
		prekidacTR.setBackground(new Color(255, 255, 153));
		prekidacTR.setFont(new Font("Dialog", Font.BOLD, 15));
		prekidacTR.setBounds(189, 520, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(prekidacTR);
		
		
		//rastavljac izlazni trenutni
		Button rastavljacIzlazniTR = new Button("Rastavlja\u010D izlazni");
		rastavljacIzlazniTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasIzTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ IZLAZNI DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-izlazni    " + "komanda    " + ((riD.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-izlazni    " + "stanje    " + ((riD.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasIzTR);
			}
		});
		rastavljacIzlazniTR.setBackground(new Color(255, 255, 153));
		rastavljacIzlazniTR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacIzlazniTR.setBounds(189, 551, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacIzlazniTR);
		
		
		//rastavljac sabirnicki s1 trenutni
		Button rastavljacSabirnickiS1TR = new Button("Rastavlja\u010D sabirni\u010Dki-S1");
		rastavljacSabirnickiS1TR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasS1TR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ SABIRNIÈKI-S1 DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s1    " + "komanda    " + ((rs1D.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s1    " + "stanje    " + ((rs1D.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasS1TR);
			}
		});
		rastavljacSabirnickiS1TR.setBackground(new Color(255, 255, 153));
		rastavljacSabirnickiS1TR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacSabirnickiS1TR.setBounds(189, 582, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacSabirnickiS1TR);
		
		//rastavljac sabirnicki s2 trenutni
		Button rastavljacSabirnickiS2TR = new Button("Rastavlja\u010D sabirni\u010Dki-S2");
		rastavljacSabirnickiS2TR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasS2TR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ SABIRNIÈKI-S2 DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s2    " + "komanda    " + ((rs2D.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-sabirnicki-s2    " + "stanje    " + ((rs2D.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasS2TR);
			}
		});
		rastavljacSabirnickiS2TR.setBackground(new Color(255, 255, 153));
		rastavljacSabirnickiS2TR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacSabirnickiS2TR.setBounds(189, 613, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacSabirnickiS2TR);
		
		//reastavljac uzemljenja trenutni
		Button rastavljacUzemljenjaTR = new Button("Rastavlja\u010D uzemljenja");
		rastavljacUzemljenjaTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasUTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ UZEMLJENJA DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "rastavljac-uzemljenja    " + "stanje    " + ((ruD.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasUTR);
			}
		});
		rastavljacUzemljenjaTR.setBackground(new Color(255, 255, 153));
		rastavljacUzemljenjaTR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacUzemljenjaTR.setBounds(189, 644, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacUzemljenjaTR);
		
		Button distantnaZastitaTR = new Button("Distantna za\u0161tita");
		distantnaZastitaTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String disZasTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA DISTANTNU ZAŠTITU DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "iskljucenje    " + ((disZasD.iskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l1-poticaj    " + ((disZasD.fazaL1 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l2poticaj    " + ((disZasD.fazaL2 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "faza-l3-poticaj    " + ((disZasD.fazaL3 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "zemljospoj-poticaj    " + ((disZasD.zemljospoj == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "2.stupanj-iskljucenje    " + ((disZasD.stupanj2 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "3.stupanj-iskljucenje    " + ((disZasD.stupanj3 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "4.stupanj-iskljucenje    " + ((disZasD.stupanj4 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "suprotni-smjer-poticaj    " + ((disZasD.suprotniSmjer == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "njihanje-energije-blokada    " + ((disZasD.njihanjeEnergije == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-prijem    " + ((disZasD.TKsignalPrijem == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-slanje    " + ((disZasD.TKsignalSlanje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "TK-signal-iskljucenje    " + ((disZasD.TKsignalIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "napajanje-nestanak    " + ((disZasD.napajanjeNestanak == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "distantna-zastita    " + "uredjaj-kvar    " + ((disZasD.uredjajKvar == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(disZasTR);
			}
		});
		distantnaZastitaTR.setForeground(Color.BLACK);
		distantnaZastitaTR.setFont(new Font("Dialog", Font.BOLD, 15));
		distantnaZastitaTR.setBackground(new Color(255, 255, 153));
		distantnaZastitaTR.setBounds(189, 675, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(distantnaZastitaTR);
		
		Button apuTR = new Button("APU");
		apuTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String apuLTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA APU DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-ukljucenje    " + ((apuD.apuUkljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-1p    " + ((apuD.apu1p == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-3p    " + ((apuD.apu3p == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "apu    " + "apu-blokada    " + ((apuD.apuBlokada == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(apuLTR);
			}
		});
		apuTR.setForeground(Color.BLACK);
		apuTR.setFont(new Font("Dialog", Font.BOLD, 15));
		apuTR.setBackground(new Color(255, 255, 153));
		apuTR.setBounds(189, 706, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(apuTR);
		
		Button nadstrujnaZastitaTR = new Button("Nadstrujna za\u0161tita");
		nadstrujnaZastitaTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nadZasTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA NADSTRUJNU ZAŠTITU DALEKOVODNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "npc-iskljucenje    " + ((nadZasD.npcIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "vpc-iskljucenje    " + ((nadZasD.vpcIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "zemljospojna-iskljucenje    " + ((nadZasD.zemljospojnaIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "od-preopterecenja-upozorenje    " + ((nadZasD.preoptUpozorenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "od-preopterecenja-iskljucenje    " + ((nadZasD.preoptIskljucenje == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "DV Rijeka    " + "nadstrujna-zastita    " + "relej-kvar    " + ((nadZasD.relejKvar == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(nadZasTR);
			}
		});
		nadstrujnaZastitaTR.setForeground(Color.BLACK);
		nadstrujnaZastitaTR.setFont(new Font("Dialog", Font.BOLD, 15));
		nadstrujnaZastitaTR.setBackground(new Color(255, 255, 153));
		nadstrujnaZastitaTR.setBounds(189, 737, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(nadstrujnaZastitaTR);
		
		/*
		 *GUMBI ZA LISTE SIGNALA - SPOJNO POLJE
		*/
		
		//svi signali spojno
		Button sviSignaliSP = new Button("Svi signali");
		sviSignaliSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaSviS.lista);
			}
		});
		sviSignaliSP.setFont(new Font("Dialog", Font.BOLD, 15));
		sviSignaliSP.setBackground(new Color(255, 255, 153));
		sviSignaliSP.setBounds(1123, 489, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(sviSignaliSP);
		
		// prekidac spojno
		Button prekidacSP = new Button("Prekida\u010D");
		prekidacSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaPS.lista);
			}
		});
		prekidacSP.setFont(new Font("Dialog", Font.BOLD, 15));
		prekidacSP.setBackground(new Color(255, 255, 153));
		prekidacSP.setBounds(1123, 520, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(prekidacSP);
		
		// rastavljac sabirnicki s1 spojno
		Button rastavljacS1SP = new Button("Rastavlja\u010D sabirni\u010Dki-S1");
		rastavljacS1SP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaS1S.lista);
			}
		});
		rastavljacS1SP.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacS1SP.setBackground(new Color(255, 255, 153));
		rastavljacS1SP.setBounds(1123, 551, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacS1SP);
		
		//rastavljac sabirnicki s2 spojno
		Button rastavljacS2SP = new Button("Rastavlja\u010D sabirni\u010Dki-S2");
		rastavljacS2SP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(listaS2S.lista);
			}
		});
		rastavljacS2SP.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacS2SP.setBackground(new Color(255, 255, 153));
		rastavljacS2SP.setBounds(1123, 582, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacS2SP);
		
		/*
		 *TRENUTNI SIGNALI - SPOJNO POLJE
		*/
		
		// svi signali spojno trenutni
		Button sviSignaliSPTR = new Button("Svi signali");
		sviSignaliSPTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sviSPTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA SVIH TRENUTNIH SIGNALA SPOJNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "komanda    " + ((prekidacS.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "stanje    " + ((prekidacS.stanje == 1) ? "ukljucen\n" : "iskljucen\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "gubitak-SF6-upozorenje    " + ((prekidacS.gubitakSF6 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "blokada-rada    " + ((prekidacS.blokadaRada == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "blokada-iskopa    " + ((prekidacS.blokadaIskopa == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "opruga-navijena-kvar    " + ((prekidacS.oprugaNavijenaKvar == true) ? "prorada\n\n" : "prestanak\n\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s1    " + "komanda    " + ((rs1S.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s1    " + "stanje    " + ((rs1S.stanje == 1) ? "ukljucen\n\n" : "iskljucen\n\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s2    " + "komanda    " + ((rs2S.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s2    " + "stanje    " + ((rs2S.stanje == 1) ? "ukljucen\n" : "iskljucen\n");;
				textArea.setText(sviSPTR);
			}
		});
		sviSignaliSPTR.setFont(new Font("Dialog", Font.BOLD, 15));
		sviSignaliSPTR.setBackground(new Color(255, 255, 153));
		sviSignaliSPTR.setBounds(1301, 489, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(sviSignaliSPTR);
		
		// prekidac spojno trenutni
		Button prekidacSPTR = new Button("Prekida\u010D");
		prekidacSPTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prekSPTR = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA PREKIDAÈ SPOJNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "komanda    " + ((prekidacS.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "stanje    " + ((prekidacS.stanje == 1) ? "ukljucen\n" : "iskljucen\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "gubitak-SF6-upozorenje    " + ((prekidacS.gubitakSF6 == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "blokada-rada    " + ((prekidacS.blokadaRada == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "blokada-iskopa    " + ((prekidacS.blokadaIskopa == true) ? "prorada\n" : "prestanak\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "prekidac    " + "opruga-navijena-kvar    " + ((prekidacS.oprugaNavijenaKvar == true) ? "prorada\n" : "prestanak\n");
				textArea.setText(prekSPTR);
			}
		});
		prekidacSPTR.setFont(new Font("Dialog", Font.BOLD, 15));
		prekidacSPTR.setBackground(new Color(255, 255, 153));
		prekidacSPTR.setBounds(1301, 520, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(prekidacSPTR);
		
		//rastavljac sabirnicki s1 spojno trenutni
		Button rastavljacS1SPTR = new Button("Rastavlja\u010D sabirni\u010Dki-S1");
		rastavljacS1SPTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasS1TRSP = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ SABIRNIÈKI-S1 SPOJNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s1    " + "komanda    " + ((rs1S.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s1    " + "stanje    " + ((rs1S.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasS1TRSP);
			}
		});
		rastavljacS1SPTR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacS1SPTR.setBackground(new Color(255, 255, 153));
		rastavljacS1SPTR.setBounds(1301, 551, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacS1SPTR);
		
		//rastavljac sabirnicki s2 spojno trenutni
		Button rastavljacS2SPTR = new Button("Rastavlja\u010D sabirni\u010Dki-S2");
		rastavljacS2SPTR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rasS2TRSP = "*LISTA JE IZRAÐENA NA NAÈIN: NAZIV EEP-a, TEH.MODUL, TEH.JEDINICA, UREDJAJ, VARIJABLA, STANJE*\n"
						+ "---    LISTA TRENUTNIH SIGNALA ZA RASTAVLJAÈ SABIRNIÈKI-S2 SPOJNOG POLJA    ---\n\n"
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s2    " + "komanda    " + ((rs2S.komanda == true) ? "uklop\n" : "isklop\n")
						+ "TS-G    " + "110    " + "SP Rijeka    " + "rastavljac-sabirnicki-s2    " + "stanje    " + ((rs2S.stanje == 1) ? "ukljucen\n" : "iskljucen\n");
				textArea.setText(rasS2TRSP);
			}
		});
		rastavljacS2SPTR.setFont(new Font("Dialog", Font.BOLD, 15));
		rastavljacS2SPTR.setBackground(new Color(255, 255, 153));
		rastavljacS2SPTR.setBounds(1301, 582, 178, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(rastavljacS2SPTR);
		
		/*
		 * gumbi za ukljuèivanje/iskljuèivanje ureðaja dalekovodnog polja
		 */
		
		// toggle prekidac
		Button togglePrekidacD = new Button("Toggle prekida\u010D");
		togglePrekidacD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(prekidacD.komanda == true && poljeD == false) {
					prekidacD.komanda = false;
					prekidacD.stanje = 0;
					checkboxPreDP.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nPREKIDAÈ ... ... ... ISKLJUÈEN");
					togglePrekidacD.setBackground(new Color(255, 153, 153));
				}else if(prekidacD.komanda == false && riD.komanda == true){
					prekidacD.komanda = true;
					prekidacD.stanje = 1;
					checkboxPreDP.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nPREKIDAÈ ... ... ... UKLJUÈEN");
					togglePrekidacD.setBackground(new Color(102, 255, 102));
				}else if(riD.komanda == false || poljeD == true) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		togglePrekidacD.setFont(new Font("Dialog", Font.ITALIC, 15));
		togglePrekidacD.setBackground(new Color(102, 255, 102));
		togglePrekidacD.setBounds(91, 66, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(togglePrekidacD);
		
		// toggle rastavljac izlazni
		Button toggleRasIzlD = new Button("Toggle rastavlja\u010D izlazni");
		toggleRasIzlD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(riD.komanda == true && prekidacD.komanda == false) {
					riD.komanda = false;
					riD.stanje = 0;
					checkboxRasIzl.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nIZLAZNI RASTAVLJAÈ ... ... ... ISKLJUÈEN");
					toggleRasIzlD.setBackground(new Color(255, 153, 153));
				}else if(riD.komanda == false && (rs1D.komanda == true || rs2D.komanda == true)){
					riD.komanda = true;
					riD.stanje = 1;
					checkboxRasIzl.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nIZLAZNI RASTAVLJAÈ ... ... ... UKLJUÈEN");
					toggleRasIzlD.setBackground(new Color(102, 255, 102));
				}else if(prekidacD.komanda == true || ((rs1D.komanda == false && rs2D.komanda == false))) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasIzlD.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasIzlD.setBackground(new Color(102, 255, 102));
		toggleRasIzlD.setBounds(91, 97, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasIzlD);
		
		// toggle rastavljac sabirnicki s1
		Button toggleRasS1D = new Button("Toggle rastavlja\u010D sabirni\u010Dki - S1");
		toggleRasS1D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((rs1D.komanda == true && riD.komanda == false) || (rs1D.komanda == true && poljeS == true)) {
					rs1D.komanda = false;
					rs1D.stanje = 0;
					checkboxRasS1DP.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈNI - S1 ... ... ... ISKLJUÈEN");
					toggleRasS1D.setBackground(new Color(255, 153, 153));
				}else if((rs1D.komanda == false && ruD.stanje == 0 && rs2D.komanda == false) ||  (rs1D.komanda == false && poljeS == true) ){
					rs1D.komanda = true;
					rs1D.stanje = 1;
					checkboxRasS1DP.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈNI - S1 ... ... ... UKLJUÈEN");
					toggleRasS1D.setBackground(new Color(102, 255, 102));
				}else if(ruD.stanje == 1 || riD.komanda == true || rs2D.komanda == true){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasS1D.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasS1D.setBackground(new Color(255, 153, 153));
		toggleRasS1D.setBounds(91, 128, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasS1D);
		
		// toggle rastavljac sabirnicki s2
		Button toggleRasS2D = new Button("Toggle rastavlja\u010D sabirni\u010Dki - S2");
		toggleRasS2D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((rs2D.komanda == true && riD.komanda == false) || (rs2D.komanda == true && poljeS == true)) {
					rs2D.komanda = false;
					rs2D.stanje = 0;
					checkboxRasS2DP.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈNI - S2 ... ... ... ISKLJUÈEN");
					toggleRasS2D.setBackground(new Color(255, 153, 153));
				}else if((rs2D.komanda == false && ruD.stanje == 0 && rs1D.komanda == false) ||  (rs2D.komanda == false && poljeS == true) ){
					rs2D.komanda = true;
					rs2D.stanje = 1;
					checkboxRasS2DP.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈNI - S2 ... ... ... UKLJUÈEN");
					toggleRasS2D.setBackground(new Color(102, 255, 102));
				}else if(ruD.stanje == 1 || riD.komanda == true || rs1D.komanda == true){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasS2D.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasS2D.setBackground(new Color(102, 255, 102));
		toggleRasS2D.setBounds(91, 159, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasS2D);
		
		// toggle rastavljac uzemljenja
		Button toggleRasUzD = new Button("Toggle rastavlja\u010D uzemljenja");
		toggleRasUzD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ruD.stanje == 1 && disZasD.iskljucenje == true && nadZasD.npcIskljucenje == true) {
					ruD.stanje = 0;
					checkboxRasUz.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ UZEMLJENJA ... ... ... ISKLJUÈEN");
					toggleRasUzD.setBackground(new Color(255, 153, 153));
				}else if(ruD.stanje == 0 && (rs1D.komanda == false && rs2D.komanda == false)){
					ruD.stanje = 1;
					checkboxRasUz.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nRASTAVLJAÈ UZEMLJENJA ... ... ... UKLJUÈEN");
					toggleRasUzD.setBackground(new Color(102, 255, 102));
				}else if(rs1D.komanda == true || rs2D.komanda == true || disZasD.iskljucenje == false || nadZasD.npcIskljucenje == false){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasUzD.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasUzD.setBackground(new Color(255, 153, 153));
		toggleRasUzD.setBounds(91, 190, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasUzD);
		
		// 
		Button toggleDisZas = new Button("Toggle distantna za\u0161tita");
		toggleDisZas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(disZasD.iskljucenje == true && (poljeD == true || ruD.stanje == 1)) {
					disZasD.iskljucenje = false;
					checkboxDisZas.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nDISTANTNA ZAŠTITA ... ... ... UKLJUÈENA");
					toggleDisZas.setBackground(new Color(102, 255, 102));
				}else if(disZasD.iskljucenje == false){
					disZasD.iskljucenje = true;
					checkboxDisZas.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nDISTANTNA ZAŠTITA ... ... ... ISKLJUÈENA");
					toggleDisZas.setBackground(new Color(255, 153, 153));
				}else if(disZasD.iskljucenje == true && (poljeD == false || ruD.stanje == 0)){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleDisZas.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleDisZas.setBackground(new Color(255, 153, 153));
		toggleDisZas.setBounds(91, 222, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleDisZas);
		
		Button toggleApu = new Button("Toggle APU");
		toggleApu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(apuD.apuUkljucenje == true) {
					apuD.apuUkljucenje = false;
					checkboxApu.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nAPU ... ... ... ISKLJUÈEN");
					toggleApu.setBackground(new Color(255, 153, 153));
				}else {
					apuD.apuUkljucenje = true;
					checkboxApu.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nAPU ... ... ... UKLJUÈEN");
					toggleApu.setBackground(new Color(102, 255, 102));
				}
			}
		});
		toggleApu.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleApu.setBackground(new Color(255, 153, 153));
		toggleApu.setBounds(91, 253, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleApu);
		
		Button toggleNadZas = new Button("Toggle nadstrujna za\u0161tita");
		toggleNadZas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nadZasD.vpcIskljucenje == true && (poljeD == true || ruD.stanje == 1)) {
					nadZasD.vpcIskljucenje = false;
					nadZasD.npcIskljucenje = false;
					checkboxNadZas.setState(true);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nNADSTRUJNA ZAŠTITA ... ... ... UKLJUÈENA");
					toggleNadZas.setBackground(new Color(102, 255, 102));
				}else if(nadZasD.vpcIskljucenje == false){
					nadZasD.vpcIskljucenje = true;
					nadZasD.npcIskljucenje = true;
					checkboxNadZas.setState(false);
					textArea.setText("////  DALEKOVODNO POLJE  ////\nNADSTRUJNA ZAŠTITA ... ... ... ISKLJUÈENA");
					toggleNadZas.setBackground(new Color(255, 153, 153));
				}else if(nadZasD.vpcIskljucenje == true && (poljeD == false || ruD.stanje == 0)){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleNadZas.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleNadZas.setBackground(new Color(255, 153, 153));
		toggleNadZas.setBounds(91, 284, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleNadZas);
		
		
		/*
		 * ukljuèivanje/iskljuèivanje spojnog polja
		 */
		
		// toggle prekidac spojno
		Button togglePrekidacSP = new Button("Toggle prekida\u010D");
		togglePrekidacSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(prekidacS.komanda == true && poljeS == false) {
					prekidacS.komanda = false;
					prekidacS.stanje = 0;
					checkboxPreSP.setState(false);
					textArea.setText("////  SPOJNO POLJE  ////\nPREKIDAÈ ... ... ... ISKLJUÈEN");
					togglePrekidacSP.setBackground(new Color(255, 153, 153));
				}else if(prekidacS.komanda == false && rs1S.komanda == true && rs2S.komanda == true){
					prekidacS.komanda = true;
					prekidacS.stanje = 1;
					checkboxPreSP.setState(true);
					textArea.setText("////  SPOJNO POLJE  ////\nPREKIDAÈ ... ... ... UKLJUÈEN");
					togglePrekidacSP.setBackground(new Color(102, 255, 102));
				}else if((rs1S.komanda == false || rs2S.komanda == false) || poljeS == true) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		togglePrekidacSP.setFont(new Font("Dialog", Font.ITALIC, 15));
		togglePrekidacSP.setBackground(new Color(255, 153, 153));
		togglePrekidacSP.setBounds(1184, 103, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(togglePrekidacSP);
		
		// toggle rastavljac sabirnicki s1 spojno
		Button toggleRasS1SP = new Button("Toggle rastavlja\u010D sabirni\u010Dki-S1");
		toggleRasS1SP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rs1S.komanda == true && prekidacS.komanda == false) {
					rs1S.komanda = false;
					rs1S.stanje = 0;
					checkboxRasS1SP.setState(false);
					textArea.setText("////  SPOJNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈKI - S1 ... ... ... ISKLJUÈEN");
					toggleRasS1SP.setBackground(new Color(255, 153, 153));
				}else if(rs1S.komanda == false && disZasD.iskljucenje == true && nadZasD.npcIskljucenje == true){
					rs1S.komanda = true;
					rs1S.stanje = 1;
					checkboxRasS1SP.setState(true);
					textArea.setText("////  SPOJNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈKI - S1 ... ... ... UKLJUÈEN");
					toggleRasS1SP.setBackground(new Color(102, 255, 102));
				}else if(disZasD.iskljucenje == true || nadZasD.npcIskljucenje == true) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasS1SP.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasS1SP.setBackground(new Color(255, 153, 153));
		toggleRasS1SP.setBounds(1184, 134, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasS1SP);
		
		// toggle rastavljac sabirnicki s2 spojno
		Button toggleRasS2SP = new Button("Toggle rastavlja\u010D sabirni\u010Dki-S2");
		toggleRasS2SP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(rs2S.komanda == true && prekidacS.komanda == false) {
					rs2S.komanda = false;
					rs2S.stanje = 0;
					checkboxRasS2SP.setState(false);
					textArea.setText("////  SPOJNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈKI - S2 ... ... ... ISKLJUÈEN");
					toggleRasS2SP.setBackground(new Color(255, 153, 153));
				}else if(rs2S.komanda == false && disZasD.iskljucenje == true && nadZasD.npcIskljucenje == true){
					rs2S.komanda = true;
					rs2S.stanje = 1;
					checkboxRasS2SP.setState(true);
					toggleRasS2SP.setBackground(new Color(102, 255, 102));
					textArea.setText("////  SPOJNO POLJE  ////\nRASTAVLJAÈ SABIRNIÈKI - S2 ... ... ... UKLJUÈEN");
				}else if(disZasD.iskljucenje == true || nadZasD.npcIskljucenje == true) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		toggleRasS2SP.setFont(new Font("Dialog", Font.ITALIC, 15));
		toggleRasS2SP.setBackground(new Color(255, 153, 153));
		toggleRasS2SP.setBounds(1184, 165, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(toggleRasS2SP);
		
		/*
		 * paljenje/gašenje polja
		 */
		
		//dalekovodno polje
		Checkbox checkboxPoljeD = new Checkbox("Dalekovodno polje");
		checkboxPoljeD.setState(true);
		checkboxPoljeD.setForeground(Color.BLACK);
		checkboxPoljeD.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxPoljeD.setEnabled(false);
		checkboxPoljeD.setBounds(430, 423, 142, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxPoljeD);
		
		Button togglePoljeD = new Button("Toggle polje");
		togglePoljeD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(poljeD == false && prekidacD.komanda == true) {
					poljeD = true;
					togglePoljeD.setBackground(new Color(102, 255, 102));
					checkboxPoljeD.setState(true);
					textArea.setText("DALEKOVODNO POLJE ... ... ... UKLJUÈENO");
					if(poljeS == true) {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\3.jpg"));
					}else {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\2.jpg"));
					}
				}else if(poljeD == false && prekidacD.komanda == false){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}else if(poljeD == true && (disZasD.iskljucenje == false || nadZasD.npcIskljucenje == false)) {
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}else if(poljeD == true && (disZasD.iskljucenje == true && nadZasD.npcIskljucenje == true)) {
					poljeD = false;
					checkboxPoljeD.setState(false);
					togglePoljeD.setBackground(new Color(255, 153, 153));
					textArea.setText("DALEKOVODNO POLJE ... ... ... ISKLJUÈENO");
					if(poljeS == true) {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\1.jpg"));
					}else {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\4.jpg"));
					}
				}
					
			}
		});
		togglePoljeD.setFont(new Font("Dialog", Font.ITALIC, 15));
		togglePoljeD.setBackground(new Color(102, 255, 102));
		togglePoljeD.setBounds(382, 386, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(togglePoljeD);
		
		//spojno polje
		Checkbox checkboxPoljeS = new Checkbox("Spojno polje");
		checkboxPoljeS.setForeground(Color.BLACK);
		checkboxPoljeS.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		checkboxPoljeS.setEnabled(false);
		checkboxPoljeS.setBounds(961, 423, 95, 22);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(checkboxPoljeS);
		
		Button togglePoljeS = new Button("Toggle polje");
		togglePoljeS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(poljeS == false && prekidacS.komanda == true) {
					poljeS = true;
					checkboxPoljeS.setState(true);
					togglePoljeS.setBackground(new Color(102, 255, 102));
					textArea.setText("SPOJNO POLJE ... ... ... UKLJUÈENO");
					if(poljeD == true) {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\3.jpg"));
					}else {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\1.jpg"));
					}
				}else if((poljeS == false && prekidacS.komanda == false) || (poljeS == true && rs1D.komanda == true && rs2D.komanda == true) || (disZasD.iskljucenje == false || nadZasD.npcIskljucenje == false)){
					JOptionPane.showMessageDialog(null, "NIJE MOGUCE IZVRSITI ZADATAK, PREGLEDAJTE UREDJAJE!", "Upozorenje!", JOptionPane.INFORMATION_MESSAGE);
				}else if(poljeS == true) {
					poljeS = false;
					checkboxPoljeS.setState(false);
					togglePoljeS.setBackground(new Color(255, 153, 153));
					textArea.setText("SPOJNO POLJE ... ... ... ISKLJUÈENO");
					if(poljeD == true) {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\2.jpg"));
					}else {
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Matija\\Desktop\\4.jpg"));
					}
				}
			}
		});
		togglePoljeS.setFont(new Font("Dialog", Font.ITALIC, 15));
		togglePoljeS.setBackground(new Color(255, 153, 153));
		togglePoljeS.setBounds(891, 386, 226, 25);
		frmModeliranjeProcesnihInformacijskih.getContentPane().add(togglePoljeS);
		
	}
}
