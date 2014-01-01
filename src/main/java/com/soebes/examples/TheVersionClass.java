package com.soebes.examples;

public class TheVersionClass
{

    public TheVersionClass()
    {
        System.out.println( "  Implementation Title:" + this.getClass().getPackage().getImplementationTitle() );
        System.out.println( " Implementation Vendor:" + this.getClass().getPackage().getImplementationVendor() );
        System.out.println( "Implementation Version:" + this.getClass().getPackage().getImplementationVersion() );
        System.out.println( "    Specification Tile:" + this.getClass().getPackage().getSpecificationTitle() );
        System.out.println( "  Specification Vendor:" + this.getClass().getPackage().getSpecificationVendor() );
        System.out.println( " Specification Version:" + this.getClass().getPackage().getSpecificationVersion() );

//        Package[] ListOfPackages = Package.getPackages();
//        for ( Package SinglePackage : ListOfPackages )
//        {
//            System.out.println( "Package: " + SinglePackage.getName() );
//        }
    }

    public static void main( String[] args )
    {
        TheVersionClass tvc = new TheVersionClass();
    }
}
