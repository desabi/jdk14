package bconstructors;

import java.util.Objects;

public record PersonRecord(String name, String address) {

    // we can ensure that the name and address provided to our Person record aren't null
    // using the following constructor implementation:
    public PersonRecord {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    // We can also create new constructors with different arguments
    // by supplying a different argument list:
    public PersonRecord(String name) {
        this(name, "Unknown");
    }
}
