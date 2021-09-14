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

        DiscordApi api = new DiscordApiBuilder().setToken(Credentials.APITOKEN).login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("I work!");
            }
        });
    }
}

/* _ */ // Fred