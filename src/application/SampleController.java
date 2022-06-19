package application;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SampleController {
	
	
	
	String numefisier = "C:\\Users\\Octav\\eclipse-workspace\\Mda\\src\\application\\Turnuri.in";
	
	
	@FXML
	void acasa(ActionEvent event) throws IOException {
		Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
		
	}
	
	@FXML
	void butonLovit(ActionEvent event) throws IOException {
		Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Altceva.fxml"));
		Scene scene = new Scene(Parinte,600,570);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		
	}
	
	@FXML
	void check1(ActionEvent event) throws IOException {
		Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check1.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
		
	}
	
	@FXML
	void check2(ActionEvent event) throws IOException {
		Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check2.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
		
	}

	@FXML
	void check3(ActionEvent event) throws IOException {
		/*Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check3.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();*/
		Scanner filecin = new Scanner(new File(numefisier));
		int grosimeMax = -1;
		
		if(!filecin.hasNext()) {
			return;		
			} 
		
		filecin.nextInt();
		
		while(filecin.hasNext()) {
			Placa p = new Placa();
			p.grosime = filecin.nextInt();
			p.lung1 = filecin.nextInt();
			p.lung2 = filecin.nextInt();
			if(p.grosime>grosimeMax) {
				grosimeMax = p.grosime;
			}
		}
		

		Stage dialogStage = new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/200994.png"));

		VBox vbox = new VBox(new Text("Grosimea maxima a placilor inregistrate este "+grosimeMax+" !!"));
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(15));
		

		dialogStage.setScene(new Scene(vbox));
		dialogStage.show();
		return;
		
		
	}

	@FXML
	void check4(ActionEvent event) throws IOException {
		/*Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check4.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();*/
		
		Scanner filecin = new Scanner(new File(numefisier));
		int volumMin = 989898898;
		
		if(!filecin.hasNext()) {
			System.out.println("Fisierul este gol !!");
			return;		
			} 
		
		 filecin.nextInt();
		
		while(filecin.hasNext()) {
			Placa p = new Placa();
			p.grosime = filecin.nextInt();
			p.lung1 = filecin.nextInt();
			p.lung2 = filecin.nextInt();
			int vol = p.grosime*p.lung1 * p.lung2;
			if(vol<volumMin) {
				volumMin = vol;
			}
		}
		Stage dialogStage = new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/img_75041.png"));

		VBox vbox = new VBox(new Text("Volumul minim al paralelipipedelor din fisier este "+volumMin+" !!"));
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(15));
		

		dialogStage.setScene(new Scene(vbox));
		dialogStage.show();
		
		
		return;
		
		
	}

	@FXML
	void check5(ActionEvent event) throws IOException {
		Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check5.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
		
	}

	@FXML
	void check6(ActionEvent event) throws IOException {
		/*Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check6.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();*/
		
		Scanner filecin = new Scanner(new File(numefisier));
		
		ArrayList<Placa> list = new ArrayList<Placa>();
		
		if(!filecin.hasNext()) {
			System.out.println("Fisierul este gol !!");
			return;		
			} 
		
		 filecin.nextInt();
		
		while(filecin.hasNext()) {
			Placa p = new Placa();
			p.grosime = filecin.nextInt();
			p.lung1 = filecin.nextInt();
			p.lung2 = filecin.nextInt();
			if(p.grosime== p.lung1 && p.lung1 == p.lung2) {
				list.add(p);
			}
		}
		
		FileWriter file = new FileWriter("C:\\Users\\Octav\\eclipse-workspace\\Mda\\src\\application\\Patrat.txt");
		
		for(Placa p : list) file.append(p.inFile() + '\n');
		
		file.close();
		
		Stage dialogStage = new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/verify-perfect-heavy-check-mark-38018.png"));

		
		VBox vbox = new VBox(new Text("Datele au fost transmise cu succces !!"));
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(15));
		

		dialogStage.setScene(new Scene(vbox));
		dialogStage.show();

		File fil = new File("C:\\Users\\Octav\\eclipse-workspace\\Mda\\\\src\\application\\Patrat.txt");
		Desktop desktop = Desktop.getDesktop();
		desktop.open(fil);
		
		
		
		
	}

	@FXML
	void check7(ActionEvent event) throws IOException {
		/*Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check7.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();*/
		
		//Construim un array de placi si introducem in el toate datele din fisier
		ArrayList<Placa> placi  =  new ArrayList<Placa>();
		Scanner filecin = new Scanner(new File(numefisier));
		
		//Daca fisierul nu este gol introducem in array datele din fisier
		if(filecin.hasNext()) {
		filecin.nextInt();
		
		while(filecin.hasNext()) {
			Placa p = new Placa();
			p.grosime = filecin.nextInt();
			p.lung1 = filecin.nextInt();
			p.lung2 = filecin.nextInt();
			if(p.lung1 <p.lung2) {
				int aux = p.lung2;
				p.lung2 = p.lung1;
				p.lung1 = aux;
			}
			placi.add(p);
		}
		}
		
		
		
		FileWriter fil = new FileWriter(new File(numefisier));//Stergem toate datele din fisier
		fil.append(String.valueOf(placi.size())+ '\n');//Introducem numarul n care este si marimea arrayului
		
		
		//Introducem toate placile din array in fisier
		for(Placa plc : placi) {
			fil.append(plc.inFile() + '\n');
		}
		
		//Inchidem fisierul
		fil.close();

		
		Stage dialogStage = new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/verify-perfect-heavy-check-mark-38018.png"));

		VBox vbox = new VBox(new Text("Datele au fost modificate cu succces !!"));
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(15));
		

		dialogStage.setScene(new Scene(vbox));
		dialogStage.show();

		

		
		
	}

	@FXML
	void check8(ActionEvent event) throws IOException {
		/*Pane Parinte = (Pane)FXMLLoader.load(getClass().getResource("Check8.fxml"));
    	Scene scene = new Scene(Parinte,600,570);
    	
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();*/
		
		//Scanner filecin = new Scanner(new File(numefisier));
		
		
		   //1. Extragem toate datele din fisier si le punem intr-un array
			
			ArrayList<Placa> list = dateFisier(numefisier);
			
			
			//2. Sortam arrayul confrom ariei placilor
			
			boolean f= false;
			while(!f) {		
				f = true;

				for(int i=0;i<list.size()-1;i++) {
					if(list.get(i).lung1*list.get(i).lung2>list.get(i+1).lung1 * list.get(i+1).lung2) {
						Placa aux = new Placa();
						aux.grosime = list.get(i+1).grosime;
						aux.lung1 = list.get(i+1).lung1;
						aux.lung2 = list.get(i+1).lung2;
						
						
						list.get(i+1).grosime = list.get(i).grosime; 
						list.get(i+1).lung1 = list.get(i).lung1; 
						list.get(i+1).lung2 = list.get(i).lung2; 
						
						list.get(i).grosime = aux.grosime; 
						list.get(i).lung1 = aux.lung1; 
						list.get(i).lung2 = aux.lung2; 
						f= false;

					}
					
				}
			
			}

			for(Placa p : list) {
				System.out.println(p.inFile());
				}
			
			//3. Construim o lista de perechi si folosind programarea dinamica aflam inaltimea maxima pentru fiecare placa
			ArrayList<Pereche> map = new ArrayList<Pereche>();
			
			for(Placa p : list) {
				Pereche per = new Pereche(0, p);
				map.add(per);
				}
			
			map.get(0).nr = map.get(0).p.grosime;
			
			for(int i=1;i<map.size();i++) {
				map.get(i).nr = map.get(i).p.grosime;
				int max = 0;
				for(int j=0;j<i;j++) {
					if((map.get(j).p.lung1<= map.get(i).p.lung1)&&(map.get(j).p.lung2<= map.get(i).p.lung2)) {
						if(map.get(j).nr > max) max = map.get(j).nr;
					}
					
				}
				map.get(i).nr = map.get(i).p.grosime + max;
			}
			
			//4. Aflam inaltimea maxima a turnului ce poate fi construit
			int max = 0;
			for(Pereche m : map) {
				System.out.println(""+m.nr + ' ' + m.p.inFile());
				if(m.nr>max) {
					max = m.nr;
				}
			}
			
			FileWriter file = new FileWriter("C:\\Users\\Octav\\eclipse-workspace\\Mda\\src\\application\\Turnuri.out");
			file.append(String.valueOf(max));

			file.close();
			
			File fil = new File("C:\\Users\\Octav\\eclipse-workspace\\Mda\\src\\application\\Turnuri.out");
	    	Desktop desktop = Desktop.getDesktop();
	    	desktop.open(fil);
			
		
		
	}

	

    
    @FXML
    void fisierTurnuri_In(ActionEvent event) throws IOException {
    	File file = new File(numefisier);
    	Desktop desktop = Desktop.getDesktop();
    	desktop.open(file);
    	
    	
    }
    
    
    @FXML
    void exit(ActionEvent event) {
    	Platform.exit();
    }
    
    
    static ArrayList<Placa> dateFisier(String numefisier) throws FileNotFoundException{
		ArrayList<Placa> placi  =  new ArrayList<Placa>();
		Scanner filecin = new Scanner(new File(numefisier));
		
		//Daca fisierul nu este gol introducem in array datele din fisier
		if(filecin.hasNext()) {
		 filecin.nextInt();
		
		while(filecin.hasNext()) {
			Placa p = new Placa();
			p.grosime = filecin.nextInt();
			p.lung1 = filecin.nextInt();
			p.lung2 = filecin.nextInt();
			placi.add(p);
		}
		}
		return placi;
	}
    
    public static boolean onlyDigits(String str)
    {

    	String regex = "[0-9]+";
  
   
        Pattern p = Pattern.compile(regex);
  

        if (str == null) {
            return false;
        }
  

        Matcher m = p.matcher(str);
  
        return m.matches();
    }
  
  
    
    
    @FXML  TextField textH,textX,textY;
    
  //Realizare primului punct
    @FXML
    void introduDate(ActionEvent event) throws IOException {
     		
    		//Placa noua si datele ei introduse de utilizator
    		Placa placa = new Placa();
    		
    		String h = textH.getText();
    		String x = textX.getText();
    		String y = textY.getText();
    		
    		if((onlyDigits(h)&& Integer.parseInt(h)>0 &&Integer.parseInt(h)<1000) &&
    		   (onlyDigits(x)&& Integer.parseInt(x)>0 &&Integer.parseInt(x)<1000) &&
    		   (onlyDigits(y)&& Integer.parseInt(y)>0 &&Integer.parseInt(y)<1000)){
    			placa.grosime = Integer.parseInt(textH.getText()); 
    			placa.lung1 = Integer.parseInt(textX.getText());
    			placa.lung2 = Integer.parseInt(textY.getText());
    			textH.setText("");
    			textX.setText("");
    			textY.setText("");

    		}
    		else {
    			Stage dialogStage = new Stage();
    			dialogStage.initModality(Modality.WINDOW_MODAL);
    			dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/eror.png"));

    			VBox vbox = new VBox(new Text("h,x,y trebuie sa fie NUMERE mai mari decat 0 si mai mici decat 1000!!"));
    			vbox.setAlignment(Pos.CENTER);
    			vbox.setPadding(new Insets(15));
    			

    			dialogStage.setScene(new Scene(vbox));
    			dialogStage.show();
    			return;
    		}
    		
    		
    		
    		
    		//Construim un array de placi si introducem in el toate datele din fisier
    		ArrayList<Placa> placi  =  dateFisier(numefisier);		
    		
    		
    		placi.add(placa);
    		
    		FileWriter fil = new FileWriter(new File("C:\\Users\\Octav\\eclipse-workspace\\Mda\\src\\application\\Turnuri.in"));//Stergem toate datele din fisier
    		fil.append(String.valueOf(placi.size())+ '\n');//Introducem numarul n care este si marimea arrayului
    		
    		//Introducem toate placile din array in fisier
    		for(Placa plc : placi) {
    			fil.append(plc.inFile() + '\n');
    		}
    		
    		//Inchidem fisierul
    		fil.close();
    	
    		
    	}
    
    
    @FXML TextField textIndex;
  
    
  //Realizarea punctului 2
    @FXML
    void stergePlaca(ActionEvent event) throws IOException {
    		
    	
    	
    	//Construim un array de placi si introducem in el toate datele din fisier
    			ArrayList<Placa> placi  =  dateFisier(numefisier);
    			
    			String aux = textIndex.getText();
    			if(!(onlyDigits(aux)&&Integer.parseInt(aux)>0&&Integer.parseInt(aux)<=placi.size())) {
    				
    				Stage dialogStage = new Stage();
        			dialogStage.initModality(Modality.WINDOW_MODAL);
        			dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/eror.png"));

        			VBox vbox = new VBox(new Text("Indecele trebuie sa fie un NUMAR mai mare decat 0 si mai mic decat "+placi.size()+" !!"));
        			vbox.setAlignment(Pos.CENTER);
        			vbox.setPadding(new Insets(15));
        			

        			dialogStage.setScene(new Scene(vbox));
        			dialogStage.show();
        			
        			return;
    			}
    			
    			int index = Integer.parseInt(aux);
    			//Scanner filecin = new Scanner(new File(numefisier));
    		
    			placi.remove(index-1);
    			
    			
    			
    			FileWriter fil = new FileWriter(new File(numefisier));//Stergem toate datele din fisier
    			fil.append(String.valueOf(placi.size())+ '\n');//Introducem numarul n care este si marimea arrayului
    			
    			//Introducem toate placile din array in fisier
    			for(Placa plc : placi) {
    				fil.append(plc.inFile() + '\n');
    			}
    			
    			textIndex.setText("");
    			//Inchidem fisierul
    			fil.close();
    		
    	
    	
    }
    
    @FXML TextField textGrosime;
    
    @FXML
    void placiCrescator(ActionEvent event) throws FileNotFoundException {
    
    	
    	
    	String aux = textGrosime.getText();
    	if(!onlyDigits(aux)) { 
    		Stage dialogStage = new Stage();
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/eror.png"));

			VBox vbox = new VBox(new Text("h trebuie sa fie un NUMAR !!"));
			vbox.setAlignment(Pos.CENTER);
			vbox.setPadding(new Insets(15));
			

			dialogStage.setScene(new Scene(vbox));
			dialogStage.show();
			return;
    	}
		
    	int gros = Integer.parseInt(aux);
    	
    	
    	
    	ArrayList<Placa> list = new ArrayList<Placa>();
    	Scanner filecin = new Scanner(new File(numefisier));
    	
    	if(!filecin.hasNext()) {
    		return;		
    		} 
    	filecin.nextInt();
    	while(filecin.hasNext()) {
    		Placa p = new Placa();
    		p.grosime = filecin.nextInt();
    		p.lung1 = filecin.nextInt();
    		p.lung2 = filecin.nextInt();
    		if(p.grosime<gros) {
    			list.add(p);
    		}
    	}
    	
    	
    	boolean f= false;
    	while(!f) {		
    		f = true;

    		for(int i=0;i<list.size()-1;i++) {
    			if(list.get(i).lung1*list.get(i).lung2>list.get(i+1).lung1 * list.get(i+1).lung2) {
    				Placa auxx = new Placa();
    				auxx.grosime = list.get(i+1).grosime;
    				auxx.lung1 = list.get(i+1).lung1;
    				auxx.lung2 = list.get(i+1).lung2;
    				
    				
    				list.get(i+1).grosime = list.get(i).grosime; 
    				list.get(i+1).lung1 = list.get(i).lung1; 
    				list.get(i+1).lung2 = list.get(i).lung2; 
    				
    				list.get(i).grosime = auxx.grosime; 
    				list.get(i).lung1 = auxx.lung1; 
    				list.get(i).lung2 = auxx.lung2; 
    				f=false;

    			}
    			
    		}
    	
    	}
    	
    	String tot = "";
    	
    	for(Placa p : list) {
    		tot+="x: "+p.lung1+";\t\t y: "+p.lung2+";\t\t h: "+p.grosime+"\n\n";
    	}
    	
    	
			Stage dialogStage = new Stage();
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.getIcons().add(new Image("file:///C:/Users/Octav/eclipse-workspace/Mda/src/application/img_330725.png"));

			VBox vbox = new VBox(new Text("Caracteristicele placilor cu grosimea mai mica decat "+gros+":  \n"+tot));
			vbox.setAlignment(Pos.CENTER);
			vbox.setPadding(new Insets(15));
			

			dialogStage.setScene(new Scene(vbox));
			dialogStage.show();
			
			
			
			
			return;
		
		
    }

}
