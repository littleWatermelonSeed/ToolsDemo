package com.mystery0.toolsdemo;

import android.app.Application;

import com.mystery0.tools.Logs.Logs;

public class App extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Logs.setLevel(Logs.LogLevel.Debug);
    }
}