package helloworld;

import java.io.Serializable;
import java.util.Optional;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
