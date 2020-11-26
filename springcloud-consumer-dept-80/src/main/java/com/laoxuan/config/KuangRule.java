package com.laoxuan.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

public class KuangRule {

    public IRule myRule()
    {
        return  new RandomRule();
    }
}
