package scheduler.view;

import scheduler.model.RegisteredUser;

import java.util.ArrayList;
import java.util.List;

/**
 * There's no login system yet, so this stands in for "who is currently signed in."
 * It holds a small set of demo accounts (one per account type / rate) and lets the
 * sidebar switch between them, notifying any registered panels to refresh.
 */
public class UserContext {
    private final List<RegisteredUser> users;
    private RegisteredUser current;
    private final List<Runnable> listeners = new ArrayList<>();

    public UserContext(List<RegisteredUser> users) {
        this.users = users;
        this.current = users.get(0);
    }

    public List<RegisteredUser> getUsers() {
        return users;
    }

    public RegisteredUser getCurrentUser() {
        return current;
    }

    public void setCurrentUser(RegisteredUser user) {
        this.current = user;
        for (Runnable listener : new ArrayList<>(listeners)) {
            listener.run();
        }
    }

    /** Called by a panel that needs to refresh itself (e.g. rate labels, booking lists) when the active user changes. */
    public void addListener(Runnable listener) {
        listeners.add(listener);
    }
}
