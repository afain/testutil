package eu.execom.testutil.model;

/**
 * The Class A.
 * 
 * @author Dusko Vesin
 * @author Nikola Olah
 * @author Bojan Babic
 * @author Nikola Trkulja
 */
public class A {

    /** The b. */
    private B b;

    /** The property. */
    private final String property;

    /**
     * Instantiates a new a.
     * 
     * @param b
     *            the b
     */
    public A(final B b) {
        this.b = b;
        this.property = "ttt";
    }

    /**
     * Gets the b.
     * 
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * Sets the b.
     * 
     * @param b
     *            the new b
     */
    public void setB(final B b) {
        this.b = b;
    }

    /**
     * Gets the property.
     * 
     * @return the property
     */
    public String getProperty() {
        return property;
    }

}
