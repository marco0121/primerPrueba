package Poo;

public class Tortuga implements Terrestre,Acuatico{

    @Override
    public void nadar () {
        System.out.println ("La tortuga nada");
    }

    @Override
    public void caminar () {
        System.out.println ("la tortuga camina");

    }
}
