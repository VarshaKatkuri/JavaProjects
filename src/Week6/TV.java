package Week6;

public class TV {
	  private int channel = 1; // Default channel is 1
	  private int volumeLevel = 1; // Default volume level is 1
	  boolean on = false; // By default TV is off
	  
	  //works even without the below constructor and new TV() in main program automatically instantiates the class
	  public TV() {
	  }
	  
	  public void turnOn() {
	    on = true;
	  }
	  
	  public void turnOff() {
	    on = false;
	  }
	  
	  public void setChannel(int newChannel) {
	    if (on && newChannel >= 1 && newChannel <= 120)
	      channel = newChannel;
	  }
	  
	  public void setVolume(int newVolumeLevel) {
	    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
	      volumeLevel = newVolumeLevel;
	  }
	  
	  //Created by me 
	  public int getChannel() {
		  return channel;
	  }
	  
	  //Get Volume
	  public int getVolume() {
		  return volumeLevel;
	  }
	  public void channelUp() {
	    if (on && channel < 120)
	      channel++;
	  }
	  
	  public void channelDown() {
	    if (on && channel > 1)
	      channel--;
	  }
	  
	  public void volumeUp() {
	    if (on && volumeLevel < 7)
	      volumeLevel++;
	  }
	  
	  public void volumeDown() {
	    if (on && volumeLevel > 1)
	      volumeLevel--;
	  }
}
