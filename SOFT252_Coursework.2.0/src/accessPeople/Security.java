/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessPeople;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Creates Class Security and calls Super Class Constructor with given parameters.
 */
public class Security extends Person implements Serializable {
    
    public Security(Integer id, String name, List<String> role) {
        super(id, name, role);
    }
    
}
