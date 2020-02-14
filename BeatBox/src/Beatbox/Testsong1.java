package Beatbox;
import javax.sound.midi.*;
public class Testsong1 {
	
	public void Play() {
		try {
		Sequencer sq=MidiSystem.getSequencer();
		System.out.println("We got a sequencer");
		sq.open();
		Sequence sec=new Sequence(Sequence.PPQ,4);
		Track t=sec.createTrack();
		
		ShortMessage a=new ShortMessage();
		a.setMessage(144,3,26,100);
		MidiEvent noteon=new MidiEvent(a,10);
		t.add(noteon);
		
		ShortMessage b=new ShortMessage();
		b.setMessage(128,1,44,100);
		MidiEvent noteoff=new MidiEvent(b,200);
		t.add(noteoff);
		
		sq.setSequence(sec);
		sq.start();
		
		
	        }
	
	catch (Exception ex) {
		ex.printStackTrace();
	                                   
	                    }
	finally {
		System.out.println("Am incercat..");
	}
	}
	
	public static void main(String[]args) {
		Testsong1 test=new Testsong1();
		test.Play();
	}

}
