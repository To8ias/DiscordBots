package listeners;

import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class VoiceListener extends ListenerAdapter{

    @Override
            public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
                event.getGuild().getTextChannelsByName("ghoulclan-zentral", true).get(0).sendMessage(
                        "Ghoul " + event.getVoiceState().getMember().getUser().getName() + " hat den Voicechat " + event.getChannelJoined().getName() + " betreten !"
                ).queue();
            }

        }



