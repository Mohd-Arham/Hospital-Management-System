/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.utility;

import java.util.Base64;

/**
 *
 * @author Sanjay
 */
public class CheckPass {
    public static void main(String[] args) {
        Base64.Encoder en=Base64.getEncoder();
        String pwd="Sanjay";
        byte[] arr=pwd.getBytes();
        String encpwd=en.encodeToString(arr);
        System.out.println("original "+pwd);
        System.out.println("convert "+encpwd);
    }
}
