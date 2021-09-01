package me.psek.vehicles.psekutils.conversationapi;

import lombok.Builder;
import lombok.Getter;
import net.md_5.bungee.api.chat.TextComponent;

import java.util.List;

@Getter
@Builder
public class ConversationFactory {
    private final Prompt firstPrompt;
    private final List<Conversable> participants;
    private final TextComponent prefix;
}
