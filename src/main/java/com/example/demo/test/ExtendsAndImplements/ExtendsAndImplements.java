package com.example.demo.test.ExtendsAndImplements;

/**
 * 用于验证继承和实现接口出现相同方法的情况
 */
public class ExtendsAndImplements extends Fu implements Interface{

    //子类直接继承父类和实现接口不实现接口方法不报错，说明这种情况下默认父类实现该方法

    @Override
    public void method() {
        super.method();
    }
}
