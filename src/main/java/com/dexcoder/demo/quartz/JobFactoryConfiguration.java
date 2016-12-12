package com.dexcoder.demo.quartz;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

/**
 * JobFactoryConfiguration
 *
 * @author fgt
 * @version 2016/12/12 21:13
 */
public class JobFactoryConfiguration extends AdaptableJobFactory {

    @Autowired
    AutowireCapableBeanFactory capableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {

        /**
         * 这里覆盖了super的createJobInstance方法，对其创建出来的类再进行autowire。
         */
        Object jobInstance = super.createJobInstance(bundle);
        //进行注入
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
