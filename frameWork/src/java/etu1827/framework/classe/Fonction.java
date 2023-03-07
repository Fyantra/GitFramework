/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1827.framework.classe;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Fy
 */
public class Fonction {

    public Fonction() {
    }
    
    
    public static String getURLPattern(HttpServletRequest request) throws Exception {
        String url = request.getPathInfo();
        if(url == null){
            url = "URL vide";  
            return url;
        }
        
        if("/".equals(url)){
            url = "/";
            return url;
        }
        // esorina le / voloany
        return url.substring(1);
    }
}
