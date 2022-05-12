package academy.mindswap.module1.supernaturals;

public enum SupernaturalType {
    MUMMY("Mummy"),
    WEREWOLF("Warewolf"),
    VAMPIRE("Vampire"),
    FAIRY("Fairy"),
    WITCH("Witch");

    private String name;

    SupernaturalType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}