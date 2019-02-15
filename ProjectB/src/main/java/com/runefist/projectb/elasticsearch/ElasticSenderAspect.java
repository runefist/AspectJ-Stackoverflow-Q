/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runefist.projectb.elasticsearch;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author runef
 */
@Aspect
public class ElasticSenderAspect {

    @After("@annotation(elasticsender)") // && execution(* *(..))
    public void after(JoinPoint joinPoint, ElasticSender elasticsender) {
        System.out.println(joinPoint.getKind() + " -- ASPECT IS WORKING! YOU ARE GOOD TO GO!");
    }
}
