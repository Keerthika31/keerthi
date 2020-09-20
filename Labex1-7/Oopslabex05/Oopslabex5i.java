/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keerthi
 */
class Degree
{
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am a Postgraduate");
    }
}
class oopslabex5i
{
    public static void main(String[]args)
    {
        Undergraduate a=new Undergraduate();
        Postgraduate b=new Postgraduate();
        a.getDegree();
        b.getDegree();
    }
}
    


