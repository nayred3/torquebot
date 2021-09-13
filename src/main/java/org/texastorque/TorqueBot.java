package org.texastorque;

// Example import
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

/**
 * The main class for the TorqueBot.
 * 
 * @author Suhas, Sri, Dawson 
 */
public class TorqueBot {
    public static void main(String[] args) {
        System.out.println("TorqueBot");
        // Main method

        DiscordApi api = new DiscordApiBuilder()
            .setToken("ODg0NDg2MTI5MDY2MzQ0NDYw.YTZL5g.LyacHL1xB8B69OjGVxKTSdkNCqY")
            .login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("I work!");
            }
        });
    }
}

/*_*/   // Fred 