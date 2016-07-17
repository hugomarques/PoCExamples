package com.hugodesmarques.commands;

import java.util.EnumMap;

/**
 * Created by hugomarques on 6/14/16.
 */
public class FactoryCommand {

    private static EnumMap<CommandType, Command> commands = new EnumMap<>(CommandType.class);

    static {
        commands.put(CommandType.NO_PARAMS, new NoParamsCommand());
        commands.put(CommandType.OPTIONAL, new OptionalParamsCommand());
        commands.put(CommandType.REQUIRED, new RequiredParamsCommand());
    }

    public static Command getCommand(CommandType type) {
        return commands.get(type);
    }


    public enum CommandType {
        NO_PARAMS,
        REQUIRED,
        OPTIONAL;
    }

}
