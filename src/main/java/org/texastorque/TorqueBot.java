package org.texastorque;

import java.util.Optional;

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

        Token token = new Token("token");
        BadWords badWords = new BadWords();

        DiscordApi api = new DiscordApiBuilder()
            .setToken(token.getToken())
            .login().join();

        
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


/*_*/   // Fred 

