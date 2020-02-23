package beans

import groovy.transform.ToString

/**
 * @project com.groovy* @author Damian Wójtowicz
 * @date 23.02.20
 */

@ToString
class GroovyBean implements Serializable {

    String first, last, email

    // default no args cons is by default
    // getters setters as default

    Integer value = 100


    // nie chce getters & setters defaultowego, tylko swoja implementacje
    String fullName

    void setFullName(String name) {
        fullName = name
    }

    String getFullName() {
        "Full Name: ${fullName}"
    }
}

















