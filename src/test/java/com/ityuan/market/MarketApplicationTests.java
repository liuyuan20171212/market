package com.ityuan.market;

import com.ityuan.market.bo.Person;
import com.ityuan.market.dao.entity.RuleActionInfo;
import com.ityuan.market.dao.mapper.RuleActionInfoMapper;
import org.drools.core.base.RuleNameStartsWithAgendaFilter;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.Match;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
class MarketApplicationTests {

//    @Autowired
//    private RuleActionInfoMapper ruleActionInfoMapper;

    @Resource
    private KieSession kieSession;

    public static void main(String[] args) {
        System.out.println(5 / 3);
        System.out.println(5 % 3);
    }

    @Test
    void contextLoads() {
//        RuleActionInfo actionInfo = ruleActionInfoMapper.selectByPrimaryKey(2L);
//        System.out.println(actionInfo);
    }

    @Test
    void doRules() {
        Person p = new Person("你", 30);
        Person p2 = new Person("是", 31);
        Person p3 = new Person("谁", 32);
        Person p4 = new Person("的", 33);
        Person p5 = new Person("谁", 34);
        kieSession.insert(p);
        kieSession.insert(p2);
        kieSession.insert(p3);
        kieSession.insert(p4);
        kieSession.insert(p5);
        QueryResults queryResults = kieSession.getQueryResults("person age is 30");
        for (QueryResultsRow q : queryResults) {
            Person person = (Person) q.get("$p");
            System.out.println("查询出符合条件的对象" + person + "");
        }

    }
}
