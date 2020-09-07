package com.futong

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Step
import io.qameta.allure.Story
import spock.lang.Specification

import static io.restassured.RestAssured.given

/**
 * @author: chenfanghang* @date: 2020/9/7
 * @description:
 */

@Epic("玛吉斯")
@Feature("活动管理")
class test extends Specification {

    @Story("活动管理列表")
    @Step("活动管理列表")
    def "should call mock api successfully"() {     //spock框架（BDD框架）语法，所有case都是def开头，def后面是该case的描述信息
        given: "no given"                           //spock框架语法，given-when-then三段式写法，given/when/then后是描述信息
        when: "调用登录接口"
        given()
                .formParams("UserName", "12345678913")
                .formParams("Platform", "MaxxisScanApp")
                .formParams("PassWord", "a123456")
                .when().post("http://222.73.208.55:8032/api/account/login")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().path("Result.Authorization")      //这里校验调用接口后返回的状态码是200，如果不是200，调用会失败
        then: "no then"
    }

}
