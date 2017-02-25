package indi.daniel.spdm.xmlaop.demo.term;

/**
 * Created by daniel on 2017/2/25.
 */
public class TermString implements ITermString {
    private String term;
    private String string;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
