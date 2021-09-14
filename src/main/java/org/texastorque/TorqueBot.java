package org.texastorque;

<<<<<<< HEAD
import java.util.Optional;

=======
// Example import
>>>>>>> d181150883e6fd8ce7278391d3401a08d4d90b84
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.channel.ServerVoiceChannel;

/**
 * The main class for the TorqueBot.
 * 
 * @author Suhas, Sri, Dawson
 */
public class TorqueBot {
    public static void main(String[] args) {
<<<<<<< HEAD

        Token token = new Token("token");
        BadWords badWords = new BadWords();

        DiscordApi api = new DiscordApiBuilder()
            .setToken(token.getToken())
            .login().join();
=======
        System.out.println("TorqueBot");
        // Main method

        DiscordApi api = new DiscordApiBuilder().setToken(Credentials.APITOKEN).login().join();
>>>>>>> d181150883e6fd8ce7278391d3401a08d4d90b84

        
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("I work!");
            }
        });
        
        api.addMessageCreateListener(event -> {
            for (String word : badWords)
                if (event.getMessageContent().equalsIgnoreCase(Credential.banwords[i])) {
                    event.getChannel().sendMessage("No Profanity!");
                }
            };
        });
        
        api.addMessageCreateListener(event -> {
            long number = 885686322034016289L;
            ServerVoiceChannel channel = event.getApi().getServerVoiceChannelById(number).get();

            channel.connect().thenAccept(audioConnection -> {

            }).exceptionally(e -> {

                e.printStackTrace();
                return null;
            });
        });

    }
}

<<<<<<< HEAD

/*_*/   // Fred 

=======
/* _ */ // Fred
//
//
>>>>>>> d181150883e6fd8ce7278391d3401a08d4d90b84
