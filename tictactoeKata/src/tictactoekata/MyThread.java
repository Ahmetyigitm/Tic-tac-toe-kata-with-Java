/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoekata;

class MyThread extends Thread {
 
    // Mola vermek için Thread adı alınıyor ve  main içinde 2000 milisaniyeliğine akış duruyor(bu kısımdaki veri girdisi işlenmiyor)
    @Override
    public void run()
    {
 

        try {
 

            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
 

        catch (Exception e) {
 
            // Message to be printed if
            // the exception is encountered
            System.out.println("Exception is caught");
        }
    }
}
