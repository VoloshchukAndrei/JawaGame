public enum Names {

    Monk("Francis"),
    Magician("Gandalf"),
    Sniper("Aragorn"),
    Crossbowman("Legolas"),
    Robber("Gimli"),
    Spearman("Frodo"),
    Peasant("Sem");

    private String name;

    Names(String name) {this.name = name;}

    public String getName() {return name;}
}
