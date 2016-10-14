package com.archanpatkar.Initializer;




public class Initializer implements MainServer
{

    @Override
    public void PreServer() 
    {
       com.archanpatkar.Console.Log.Put("Running PRE-Server");
    }

    @Override
    public void DuringServer() 
    {
      com.archanpatkar.Console.Log.Put("Running DURING-Server");
    }

    @Override
    public void PostServer() 
    {
       com.archanpatkar.Console.Log.Put("Running POST-Server"); 
    }
}   
