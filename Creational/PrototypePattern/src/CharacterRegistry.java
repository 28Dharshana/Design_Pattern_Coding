import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    private Map<String, GameCharacter> prototypes = new HashMap<>();

    public void addPrototype(String key, GameCharacter character) {
        prototypes.put(key, character);
    }

    public GameCharacter getClonedCharacter(String key) {
        GameCharacter prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}
