package com.hugodesmarques.commands;

import java.util.Map;

/**
 * Created by hugomarques on 6/14/16.
 */
@FunctionalInterface
public interface Command<T> {

    T execute(Map parameters);

}
