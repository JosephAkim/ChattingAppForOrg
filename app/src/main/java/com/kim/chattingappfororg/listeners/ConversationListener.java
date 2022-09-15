package com.kim.chattingappfororg.listeners;

import com.kim.chattingappfororg.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
