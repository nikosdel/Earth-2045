/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dmmn_games.earth_2045.tools;

import java.io.Serializable;

/**
 *
 * @author iordkost
 */
public interface ITool extends Serializable {
    public String getToolName();
    public int getToolValue();

}
