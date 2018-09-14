package com.example.demo.utils;

import com.example.demo.enums.NumberTypeEnum;
import com.example.demo.enums.OperatorEnum;
import com.example.demo.pojo.*;
import com.example.demo.pojo.Number;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuestionUtilTest {

    @Test
    public void questionsToString() {
        Question question = new Question();
        List<Char> charList = new ArrayList<>();
        Number n1 = new Number(1, NumberTypeEnum.NATURAL_NUMBER.getCode(), 5);
        Number n2 = new Number(2, NumberTypeEnum.NATURAL_NUMBER.getCode(), 7);
        Number n3 = new Number(3, NumberTypeEnum.FRACTION.getCode(), 2, 5, 8);
        Operator o1 = new Operator(1, OperatorEnum.PLUS.getOperator());
        Operator o2 = new Operator(2, OperatorEnum.DIVISION.getOperator());
        Parentheses p = new Parentheses(2, 3);
        charList.add(n1);
        charList.add(n2);
        charList.add(n3);
        charList.add(o1);
        charList.add(o2);
        charList.add(p);
        question.setCharList(charList);
        String result = QuestionUtil.questionsToString(question);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
}