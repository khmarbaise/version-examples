package com.soebes.examples;


public class TheVersionClass
{

    public TheVersionClass()
    {
        System.out.println( "Version: " + Version.getVersion() );
        System.out.println( "groupId: " + Version.getGroupId() );
        System.out.println( "artifactId: " + Version.getArtifactId() );
        System.out.println( "revision: " + Version.getRevision() );
        System.out.println( "SVN: " + Version.getSVN() );
        System.out.println( "branch: " + Version.getSVNBranch() );
    }

    public static void main( String[] args )
    {
        @SuppressWarnings( "unused" )
        TheVersionClass tvc = new TheVersionClass();
    }
}
