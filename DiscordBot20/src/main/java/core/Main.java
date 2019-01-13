package core;

import listeners.VoiceListener;
import listeners.ReadyListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import util.Secrets;


import javax.security.auth.login.LoginException;

public class Main {
        public static void main(String[] Args) throws LoginException{

                JDABuilder builder = new JDABuilder (Secrets.TOKEN);



            builder.setAutoReconnect(true);
            builder.setStatus(OnlineStatus.ONLINE);

            // Listeners
            builder.addEventListeners(new ReadyListener());
            builder.addEventListeners(new VoiceListener());


            JDA jda = builder.build();

        }
    }

