package com.hugodesmarques.commands;

import java.util.Map;

/**
 * Created by hugomarques on 6/14/16.
 */
public class OptionalParamsCommand implements Command<String> {

    @Override
    public String execute(Map parameters) {
        String id = (String)parameters.get(RequiredParams.ID);
        System.out.println("Id: "+ id);
        return "Ok";
    }

    public enum RequiredParams {
        ID,
    }
}
