package com.hugodesmarques.commands;

import java.util.Map;

/**
 * Created by hugomarques on 6/14/16.
 */
public class RequiredParamsCommand implements Command<String> {

    @Override
    public String execute(Map parameters) {
        String id = (String)parameters.get(RequiredParams.ID);
        String name = (String)parameters.get(RequiredParams.NAME);
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
        return "Ok";
    }

    public enum RequiredParams {
        ID,
        NAME;
    }

}
