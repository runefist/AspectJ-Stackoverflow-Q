package com.runefist.projecta;

import com.runefist.projectb.elasticsearch.ElasticSender;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author runef
 */
public class MainClass {

    @ElasticSender(behaviourFunction = "main", behaviourType = "NORMAL-FUNC")
    public static void main(String[] args) {
        System.out.println("This is a test to test the aspect!");
    }
}
