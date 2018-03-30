/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luqman Aslam
 */
class invaild_Account_TypeException extends Exception {

    public invaild_Account_TypeException() {
          System.out.println("Invaild Account Exception Occur");
    }
        public invaild_Account_TypeException(String st) {
          System.out.println(st+" Exception Occur");
    }
    
}
