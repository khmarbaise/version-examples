package com.soebes.examples;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TheVersionClass
{

    private Properties prop;

    private String getEntryById( String id )
    {
        return prop.getProperty( id );
    }

    public TheVersionClass()
    {
        InputStream resourceAsStream =
            this.getClass().getResourceAsStream( "/version.properties" );
        this.prop = new Properties();
        try
        {
            this.prop.load( resourceAsStream );
        }
        catch ( IOException e )
        {
            // FIXME: This should be done by using a logging framework like log4j etc.
            e.printStackTrace();
        }

        System.out.println( "Version: " + getEntryById( "version" ) );
        System.out.println( "groupId: " + getEntryById( "groupId" ) );
        System.out.println( "artifactId: " + getEntryById( "artifactId" ) );
    }

    public static void main( String[] args )
    {
        @SuppressWarnings( "unused" )
        TheVersionClass tvc = new TheVersionClass();
    }
}
