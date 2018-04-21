//run as java project
package com.javaCardgame.view;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.*;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.awt.*;
import java.io.*;
import java.nio.file.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaCardgame.deck.*;
@SuppressWarnings("restriction")
@Controller
@SpringBootApplication
public class TableViewApplication extends Application {
	private final static String LOCAL_PATH = "/src/main/resources/Quests_of_the_Round_Table_rules.pdf";
	
	private static int currStage      = 0;
	private static int currDifficulty = 0;
	private static int currAINumber   = 0;
	
	
	private final static int DIMENSIONS  = 5;
	private final static int PADDING     = 25;
	private final static int POS_TOP     = 4;
	private final static int POS_CENTER  = 2;
	private final static int POS_BOTTOM  = 0;
	private final static int WIN_SIZE    = 100;
	private final static int BUTTON_SIZE = 60;
	
	private static Scene scene;

    public static void main(String[] args) {
    	Application.launch(args);
    }
    @RequestMapping("/")
	@ResponseBody
    @Override
    public void start(Stage primaryStage) {
    	GridPane grid = new GridPane();
    	ImageView imageView;
        //testing code
    	AdventureDeck ad = new AdventureDeck(true);
        /*System.out.println(ad.getDeck().get(0).getName());
        System.out.println(ad.getDeck().get(0).getImage());
        System.out.println(ad.getDeck().get(0).getType());
        System.out.println(ad.getAllAdventureCards()[0].getCard().getType());*/
        //System.out.println(ad.getDeck().get(120).getName());
        //System.out.println(ad.getDeck().get(120).getImage());
        //System.out.println(ad.getDeck().get(120).getType());
        for (int i=0;i<ad.getDeck().size();i++) {
        	System.out.println(ad.getDeck().get(i).getName());
        	
        }
    	StoryDeck sd = new StoryDeck(true);
        /*System.out.println(ad.getDeck().get(0).getName());
        System.out.println(ad.getDeck().get(0).getImage());
        System.out.println(ad.getDeck().get(0).getType());
        System.out.println(ad.getAllAdventureCards()[0].getCard().getType());*/
        //System.out.println(ad.getDeck().get(120).getName());
        //System.out.println(ad.getDeck().get(120).getImage());
        //System.out.println(ad.getDeck().get(120).getType());
        for (int i=0;i<sd.getDeck().size();i++) {
        	System.out.println(sd.getDeck().get(i).getImage());
        	
        }
        Path startingDir = Paths.get("");
   	 	String dirPath   = startingDir.toAbsolutePath().toString();
   	 	String filepath  = dirPath+sd.getDeck().get(0).getImage();
   	 	//Image image1 = new Image("/AtYork.jpg", true);
   	 	FileInputStream inputstream;
		try {
			inputstream = new FileInputStream(filepath);
			Image image = new Image(inputstream);
			imageView = new ImageView(image);
			grid.getChildren().add(imageView);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   	 	
    	//testing ends here
        
    	
    	
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(DIMENSIONS);
        grid.setVgap(DIMENSIONS);
        grid.setPadding(new Insets(PADDING, PADDING, PADDING, PADDING));
        switch (currStage) {
        	case 0:
        		scene = new Scene(grid, WIN_SIZE, WIN_SIZE);
            	primaryStage.setTitle("Quests of the Round Table Menu");            	
            	howToButton(grid);
            	NewStage(primaryStage,grid,"Play",1,false,POS_CENTER,POS_BOTTOM);
            	closeButton(grid);
        		break;
        	case 1:
            	scene = new Scene(grid, WIN_SIZE, WIN_SIZE);
            	primaryStage.setTitle("Quests of the Round Table Setup");
            	typePlayButton(primaryStage,grid);
            	NewStage(primaryStage,grid,"Setup A.I.",2,false,POS_CENTER,POS_CENTER);
            	closeButton(grid);
            	break;
        	case 2:
            	scene = new Scene(grid, WIN_SIZE, WIN_SIZE);
            	primaryStage.setTitle("Quests of the Round Table Difficulty");
            	difficultyButton(grid);
            	numberOfButton(grid);
            	typePlayButton(primaryStage,grid);
				break;
        	case 3:
            	scene = new Scene(grid, WIN_SIZE, WIN_SIZE);
            	primaryStage.setTitle("Quests of the Round Table");
            	//the actual game
            	closeButton(grid);//will change
				break;
        	default:
        		String[] args = new String[0];
        		SpringApplication.run(TableViewApplication.class, args);
        		break;
        }       
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    private void NewStage(Stage primaryStage, GridPane grid,String name,int stage,boolean isOnline,int pos1,int pos2) {
		Button btn = new Button();
        btn.setText(name);	        
        btn.setOnAction(new EventHandler<ActionEvent>() {	 
            @Override
            public void handle(ActionEvent event) {
            	primaryStage.close();
            	if(!isOnline) {
            		currStage = stage;
                	Stage newStage = new Stage();
                	start(newStage);
            	}     	
            }
        }); 
        initHBox(btn,grid,pos1,pos2);	
    }
    
    private void typePlayButton(Stage primaryStage, GridPane grid) {
    	NewStage(primaryStage,grid,"Local Play",3,false,POS_TOP,POS_BOTTOM);
        NewStage(primaryStage,grid,"Online Play",4,true,POS_BOTTOM,POS_BOTTOM);
	}

	private void initHBox(Button btn,GridPane grid,int pos1,int pos2) {
        HBox hbBtn = new HBox(BUTTON_SIZE);
    	hbBtn.setAlignment(Pos.CENTER);
    	hbBtn.getChildren().add(btn);
    	grid.add(hbBtn, pos1 , pos2);	
    }
	
	private void numberOfButton(GridPane grid) {
		Button btn = new Button();
        btn.setText("Number of A.I.: 0");	        
        btn.setOnAction(new EventHandler<ActionEvent>() {	 
            @Override
            public void handle(ActionEvent event) {
            	switch (currAINumber) {
            		case 0:
                    	btn.setText("Number of A.I.: 1");
                    	currAINumber = 1;
            			break;
            		case 1:
                    	btn.setText("Number of A.I.: 2");
                    	currAINumber = 2;
            			break;
            		case 2:
                    	btn.setText("Number of A.I.: 3");
                    	currAINumber = 3;
            			break;
        			default:
        				btn.setText("Number of A.I.: 0");
        				currAINumber = 0;
        				break;
            	}
            }
        }); 
        initHBox(btn,grid,POS_CENTER,POS_CENTER);		
	}
	
	private void difficultyButton(GridPane grid) {
		Button btn = new Button();
        btn.setText("Difficulty: Easy");	        
        btn.setOnAction(new EventHandler<ActionEvent>() {	 
            @Override
            public void handle(ActionEvent event) {
            	switch (currDifficulty) {
            		case 0:
                    	btn.setText("Difficulty: Medium");
                    	currDifficulty = 1;
            			break;
            		case 1:
                    	btn.setText("Difficulty: Hard");
                    	currDifficulty = 2;
            			break;
        			default:
        				btn.setText("Difficulty: Easy");
        				currDifficulty = 0;
        				break;
            	}
            }
        }); 
        initHBox(btn,grid,POS_CENTER,POS_TOP);
	}

	private void closeButton(GridPane grid) {
		Button btn = new Button();
        btn.setText("Close");	        
        btn.setOnAction(new EventHandler<ActionEvent>() {	 
            @Override
            public void handle(ActionEvent event) {
            	Platform.exit();
            }
        }); 
        initHBox(btn,grid,POS_CENTER,POS_TOP);
	}

	private void howToButton(GridPane grid) {
		Button btn = new Button();
        btn.setText("How To Play");      
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	 Path startingDir = Paths.get("");
            	 String dirPath   = startingDir.toAbsolutePath().toString();
            	 String filepath  = dirPath+LOCAL_PATH;
            	 File file        = new File(filepath);
            	
                if(!Desktop.isDesktopSupported()){
                    System.out.println("Desktop is not supported");
                    return;
                }          
                Desktop desktop = Desktop.getDesktop();
                
                if(file.exists()) {
					try {
						desktop.open(file);
					} catch (IOException e) {
						e.printStackTrace();
					}
                }else {
                	System.out.println(dirPath);
                }
            }
        });
    	initHBox(btn,grid,POS_CENTER,POS_CENTER);
	}
}