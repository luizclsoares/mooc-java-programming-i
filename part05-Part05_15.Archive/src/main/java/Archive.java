
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archive other = (Archive) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
