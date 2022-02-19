package Composition.Class;

public class Class4 {

    private final Class2 class2;
    private final Class3 class3;

    public Class4(Class2 class2, Class3 class3) {
        this.class2 = class2;
        this.class3 = class3;
    }

    public Class2 getClass2() {
        return class2;
    }

    public Class3 getClass3() {
        return class3;
    }


}
