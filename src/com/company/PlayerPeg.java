package com.company;

public class PlayerPeg
{
    private int position;
    private String name;

    public PlayerPeg(String name)
    {
        this.position = 0;
        this.name = name;
    }

    public int getPosition()
    {
        return position;
    }

    public String getName()
    {
        return name;
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public void moveForward()
    {
        this.position++;
    }

    public void moveForwardTwo()
    {
        this.position = this.position + 2;
    }

    public void moveForwardThree()
    {
        this.position = this.position + 3;
    }

}
