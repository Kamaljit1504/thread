package com.lambton;



public class FristThread extends Thread
{
    public FristThread(String name)
    {
        super(name);

    }
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(this.getName() + " :" + i);
        }

        try{
            sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }



}
