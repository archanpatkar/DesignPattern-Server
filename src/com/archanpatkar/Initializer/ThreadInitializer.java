package com.archanpatkar.Initializer;


public class ThreadInitializer implements MainThread
{

    @Override
    public void PreCoversation() 
    {
        com.archanpatkar.Console.Log.Put("Running Pre Conversation");
    }

    @Override
    public void DuringConversation() 
    {
       com.archanpatkar.Console.Log.Put("Running During Conversation");   
    }

    @Override
    public void PostConversation() 
    {
        com.archanpatkar.Console.Log.Put("Running Post Conversation");
    }
    
}
