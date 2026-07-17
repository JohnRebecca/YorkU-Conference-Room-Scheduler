package scheduler.view;

import scheduler.model.RegisteredUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds "who is currently signed in" and notifies panels when that changes.
 * The user is set once at login (via Farhad's AuthenticationService) and never
 * switched by this class - there's no demo account switcher anymore.
 */
public class UserContext {
    private RegisteredUser current;
    private final List<Runnable> listeners = new ArrayList<>();

    public UserContext(RegisteredUser loggedInUser) {
        this.current = loggedInUser;
    }

    public RegisteredUser getCurrentUser() {
        return current;
    }

    /** Reserved for a future "switch account" or re-login flow; not used by the demo switcher anymore. */
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
