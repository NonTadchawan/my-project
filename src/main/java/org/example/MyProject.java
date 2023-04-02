package org.example;

import java.util.ServiceLoader;

public class MyProject
{
    public static HelloProvider getDefault(){
        ServiceLoader<HelloProvider> helloProviders = ServiceLoader.load(HelloProvider.class);
        for (HelloProvider provider: helloProviders){
            return provider;
        }
        throw new Error("Something was wong");
    }
    public static void main( String[] args )
    {
        HelloProvider  helloProvider = MyProject.getDefault();
        helloProvider.hello();
    }
}
