package com.troytan.structure.decorator;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Finery implements Person {

    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.decorator.Person#show()
     */
    @Override
    public void show() {
        person.show();
    };

}
