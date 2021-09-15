package org.texastorque;

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

        if (args.length != 1) {
            System.out.println("Usage: TorqueBot <token-path>");
            System.exit(1);
        }

        Token token = new Token(args[0]);
        BadWords badWords = new BadWords();
        System.out.println(token.getToken());

        DiscordApi api = new DiscordApiBuilder()
            .setToken(token.getToken())
            .login().join();
        
        api.addMessageCreateListener(event -> {
            for (String word : badWords.getWordsArray()) {
                if (event.getMessageContent().equalsIgnoreCase(word)) {
                    event.getChannel().sendMessage("No Profanity!");
                }
            }
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