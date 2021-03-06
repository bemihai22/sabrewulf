package game.common;

/**
 * Configurate the games network
 * 
 * @author SabreWulf
 *
 */
public class config {

	/**
	 * Common`
	 */
	public static int TCPPort = 4555;
	public static int UDPMaxPacketSize = 1024;

	/**
	 * Server specific
	 */
	public static int lobbyCountdown = 3;
	public static int globalConnectionsLimit = 100;
	public static int gameConnectionLimit = 1;
	public static float framesPerTick = 4;

	/**
	 * Client specific
	 */
	public static String host = "localhost";
	public static String dhost = "34.241.78.38";
	public static String windowName = "Sabrewulf";
	public static boolean clientFullScreen = true;
	public static int screenWidth = 1920;
	public static int screenHeight = 1080;
}