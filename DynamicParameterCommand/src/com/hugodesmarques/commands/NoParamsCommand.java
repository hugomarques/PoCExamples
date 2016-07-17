package com.hugodesmarques.commands;

import java.util.Map;

/**
 * Created by hugomarques on 6/14/16.
 */
public class NoParamsCommand implements Command<String> {

    @Override
    public String execute(Map parameters) {
        System.out.println("No params command.");
        return "Ok";
    }

}
