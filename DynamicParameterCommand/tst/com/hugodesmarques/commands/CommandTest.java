package com.hugodesmarques.commands;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hugomarques on 6/14/16.
 */
public class CommandTest {

    public static void main(String[] args) {
        final Command noParams = FactoryCommand.getCommand(FactoryCommand.CommandType.NO_PARAMS);
        noParams.execute(new HashMap());
        final Command optional = FactoryCommand.getCommand(FactoryCommand.CommandType.OPTIONAL);
        Map optionalParams = new HashMap();
        optionalParams.put(OptionalParamsCommand.RequiredParams.ID, "1");
        optional.execute(optionalParams);
        final Command required = FactoryCommand.getCommand(FactoryCommand.CommandType.REQUIRED);
        required.execute(new HashMap());
    }

}
