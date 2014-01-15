package com.platform.sounds;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.*;
import javazoom.jl.player.Player;

import org.jboss.seam.annotations.Name;
@Name("sounds")
public class Sounds {

	public Sounds() {
		// TODO Auto-generated constructor stub
	}
	
	Player player;
	
	public void play() throws FileNotFoundException, JavaLayerException {
		
		
		
		File file = new File("e:\\mp3\\chair.mp3");
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new  BufferedInputStream(fileInputStream);
		player = new Player(bufferedInputStream);
		player.play();
		
		
		}
		
	
	public void stop(){
		player.close();
	}
	
	
}

