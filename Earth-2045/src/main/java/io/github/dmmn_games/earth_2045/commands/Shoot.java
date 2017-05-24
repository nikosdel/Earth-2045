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
public class Shoot implements ICommand {

    private final String Command;

    public Shoot() {
        this.Command = "shoot";
    }

    @Override
    public String getCommand() {
        return this.Command;
    }

    @Override
    public String run(String[] Arguments, User user) {

        if (Arguments.length == 1) {
            return "Shoot who ???";
        } else {
            return user.shoot(Arguments[1]);
        }

    }
}
