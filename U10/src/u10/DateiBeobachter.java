package u10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.TimerTask;

public class DateiBeobachter extends TimerTask implements Runnable{

	private long timeStamp;
	private File file;
	
	public DateiBeobachter(String s){
		System.out.println(s);
	}
	
	public DateiBeobachter(java.io.File f){
		this.file = f;
		this.timeStamp = file.lastModified();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long timeStamp = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if( this.timeStamp != timeStamp ) {
		      this.timeStamp = timeStamp;
		      new DateiBeobachter("Dateiname: " + file.getName() + " Zuletzt geändert: " + sdf.format(timeStamp));
		}
	}
	
	protected void onChange( File file ) {
	}
}
