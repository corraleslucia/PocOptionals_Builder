package classes;

public class Event {

    private Integer id;
    private String name;
    private Location location;

    public Event() {

    }

    public Event(Integer id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Evento: " + "\n  Id: " + id + "\n  Name: " + name + "\n  Location: " + location;
    }

    public static class EventBuilder {

        private Integer id;
        private String name;
        private Location location;

        public EventBuilder() {

        }

        public EventBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public EventBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EventBuilder location(Location location) {
            this.location = location;
            return this;
        }

        public Event build() {
            Event e = new Event();
            e.id = this.id;
            e.name = this.name;
            e.location = this.location;
            return e;
        }
    }
}
