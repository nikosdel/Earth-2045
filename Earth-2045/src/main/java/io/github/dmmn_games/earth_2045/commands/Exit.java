/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dmmn_games.earth_2045.commands;

import io.github.dmmn_games.earth_2045.user.User;

/**
 *
 * @author iordkost
 */
public class Exit implements ICommand {
    private final String Command;

    public Exit() {
        this.Command = "exit";
    }

    @Override
    public String getCommand() {
        return this.Command;
    }
    
    @Override
    public String run(String[] Arguments, User user) {
        System.exit(0);
        return "EXIT";
    }
}
