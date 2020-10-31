package com.example.demo.base.DesignPattern.FactoryPattern;

import com.example.demo.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * 这是spring自带的接口,FactoryBean
 * 一般情况下，Spring通过反射机制利用<bean>的class属性指定实现类实例化Bean，
 * 在某些情况下，实例化Bean过程比较复杂，如果按照传统的方式，则需要在<bean>中提供大量的配置信息。
 * 配置方式的灵活性是受限的，这时采用编码的方式可能会得到一个简单的方案。
 * Spring为此提供了一个org.springframework.bean.factory.FactoryBean的工厂类接口，用户可以通过实现该接口定制实例化Bean的逻辑。
 *
 */
public class UserFactory implements FactoryBean<User> {

    @Override
    public boolean isSingleton() {
        return true;
    }

    //FactoryBean只有在调用的时候才会被创建
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("用户1");
        user.setPassword("sdfa");

        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
