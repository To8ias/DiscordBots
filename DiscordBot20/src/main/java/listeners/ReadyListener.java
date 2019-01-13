package listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyListener implements EventListener {

    @Override
    public void onEvent(Event event) {
        if (event instanceof ReadyEvent) {
            String out = "\nThis bot is running on following servers: \n";

            for (Guild g : event.getJDA().getGuilds()) {
                out += g.getName() + " (" + g.getId() + ") \n";

            }

            System.out.println(out);

            for (Guild g : event.getJDA().getGuilds()) {
                g.getTextChannels().get(0).sendMessage(
                        "Tobis Bot ist jetzt wieder online:"
                ).queue();

            }
        }
    }
}
