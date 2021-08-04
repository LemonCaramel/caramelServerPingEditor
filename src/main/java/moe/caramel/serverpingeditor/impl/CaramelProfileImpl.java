package moe.caramel.serverpingeditor.impl;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import moe.caramel.serverpingeditor.listener.ServerPingListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CaramelProfileImpl implements PlayerProfile {

    private String name;

    public CaramelProfileImpl(String name) {
        this.name = name;
    }

    @Override
    public @NotNull String getName() {
        return (this.name)
                .replace("%max_player%", ServerPingListener.repMaxPlayer)
                .replace("%current_player%", ServerPingListener.repCurrentPlayer);
    }

    @Override
    public @NotNull String setName(@Nullable String name) {
        String previous = this.name;
        this.name = name;
        return previous;
    }

    @Override public @Nullable java.util.UUID getId() { return null; } // Required null
    @Override public @Nullable java.util.UUID setId(@Nullable java.util.UUID uuid) { return null; }
    @Override public @NotNull java.util.Set<ProfileProperty> getProperties() { return new java.util.HashSet<>(); }
    @Override public boolean hasProperty(@Nullable String property) { return false; }
    @Override public void setProperty(@NotNull ProfileProperty property) { }
    @Override public void setProperties(@NotNull java.util.Collection<ProfileProperty> properties) { }
    @Override public boolean removeProperty(@Nullable String property) { return false; }
    @Override public void clearProperties() { }
    @Override public boolean isComplete() { return false; }
    @Override public boolean completeFromCache() { return false; }
    @Override public boolean completeFromCache(boolean onlineMode) { return false; }
    @Override public boolean completeFromCache(boolean lookupUUID, boolean onlineMode) { return false; }
    @Override public boolean complete(boolean textures) { return false; }
    @Override public boolean complete(boolean textures, boolean onlineMode) { return false; }
}