/*
Author: Mike OMalley
Source: Fish.java
Desc:   Example basic class for use in other examples for this week.
*/

class Fish implements Comparable
{
    private int speed;

    public Fish ()
    {
       speed = 0;
    }

    public int compareTo (Object obj)
    {
       return 0;
    }

    @Override
    public String toString()
    {
       return "Fish speed: " + speed;
    }
}