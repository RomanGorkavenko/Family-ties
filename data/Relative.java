package HWSem3OOP.data;

public class Relative {

    private Human who;

    private Human whom;

    private Relation relation;

    public Relative(Human who, Human whom, Relation relation) {
        this.who = who;
        this.whom = whom;
        this.relation = relation;
    }

    public Human getWho() {
        return who;
    }

    public void setWho(Human who) {
        this.who = who;
    }

    public Human getWhom() {
        return whom;
    }

    public void setWhom(Human whom) {
        this.whom = whom;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return relation + ": " + who;
    }
}
