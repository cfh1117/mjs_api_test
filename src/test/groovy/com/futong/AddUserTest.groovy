package com.futong


import org.junit.Assert
import spock.lang.Specification

class AddUserTest extends Specification {

    def "test a"() {
        //spock框架（BDD框架）语法，所有case都是def开头，def后面是该case的描述信息
        given: "no given"                           //spock框架语法，given-when-then三段式写法，given/when/then后是描述信息
        when: "调用登录接口"
        Assert.assertEquals(1, 2);
        then: "no then"
    }

}
