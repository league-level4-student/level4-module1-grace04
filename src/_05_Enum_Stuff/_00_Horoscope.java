package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void thing(Zodiac a) {
		switch (a) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "Idk horoscopes");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "What are horoscopes");
			break;
			}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "What even am I doing");
			break;
			}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "CRAB RAVE");
			break;
			
			}
		case LEO: {
			JOptionPane.showMessageDialog(null, "Wait is cancer actually a crab");
			break;
			
			}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "That was an accident");
			break;
			
			}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "100% of water drinkers will die");
			break;
			
			}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "See now this is mine");
			break;
			
			}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "Giorno's theme");
			break;
			
			}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "Idek what I'm doing anymore");
			break;
			
			}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "Fish fish fish fish fish");
			break;
			
			}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "And this is the last one");
			break;
			
			}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.CANCER;
		thing(z);	
	}
}
