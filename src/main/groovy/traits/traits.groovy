/**
 * podobna jak w default methods, ale traits moze zawierac state
 * runtime implementation of interfaces
 * behavior ovverdigin
 * compatibility with static type checking
 * */


trait FlyingAbility {


    public String a
    private String b


    String fly() {
        "I am flying"
    }

    abstract foo()

    private String bar() {
        "bar"
    }


}


class Bird implements FlyingAbility {


    @Override
    def foo() {
        return null
    }
}


Bird parrot = new Bird()

parrot.fly()
