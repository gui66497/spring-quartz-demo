package com.dexcoder.demo.utils;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * FutureLinsener
 * @author fgt
 * @version 2016/12/18 19:33
 */
public class FutureLinsener {

    final static ListeningExecutorService service =
            MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

    public static void main(String[] args) {

        //任务1
        ListenableFuture<Boolean> booleanTask = service.submit(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return true;
            }
        });

        Futures.addCallback(booleanTask, new FutureCallback<Boolean>() {
            public void onSuccess(Boolean result) {
                System.out.println("Boolean Task:" + result);
            }

            public void onFailure(Throwable throwable) {

            }
        });
    }
}
