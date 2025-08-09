package app.pocket.Web.dto;

import java.util.UUID;

public class CastSpellRequest {

    private UUID targetId;

    private UUID spellId;

    public UUID getTargetId() {
        return targetId;
    }

    public void setTargetId(UUID targetId) {
        this.targetId = targetId;
    }

    public UUID getSpellId() {
        return spellId;
    }

    public void setSpellId(UUID spellId) {
        this.spellId = spellId;
    }
}
