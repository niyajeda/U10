package u10;

import java.util.*;
import java.io.*;

public class Test {
  public static void main(String args[]) {
    // monitor a single file
    TimerTask task = new DateiBeobachter( new File("/Users/daniel/Documents/Uni/OoSE/U10/test.txt") ) {
      protected void onChange( File file ) {
        // here we code the action on a change
        System.out.println( "File "+ file.getName() +" have change !" );
      }
    };

    Timer timer = new Timer();
    // repeat the check every second
    timer.schedule( task , new Date(), 1000 );
  }
}