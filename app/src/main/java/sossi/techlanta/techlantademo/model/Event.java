package sossi.techlanta.techlantademo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Event implements Serializable {
    public boolean RSVP = false;
    public Event() {
    }
    public Date dateStart;
    public Date dateEnd;
    public String name;
    public String description;
    public Double latitude;
    public Double longitude;

    public Set<AccessibilityOptions> availableOptions;
}
