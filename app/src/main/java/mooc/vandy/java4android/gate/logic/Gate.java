package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate
{
    // Variables declaration
    public static final int OUT = -1; //indicates outward door swing
    public static final int IN = 1; //indicates inward door swing
    public static final int CLOSED = 0; //indicates neither inward nor outward door swing

    // Field declaration
    private int mSwing;

    // Public constructor to instantiate mSwing value
    public Gate()
    {
        mSwing = CLOSED;
    }

    // Setter method
    public boolean setSwing(int direction)
    {
        if (direction == IN || direction == OUT || direction == CLOSED)
        {
            mSwing = direction;
            return true;
        }
        else
        {
            return false;
        }
    }

    // method that opens the gate
    public boolean open(int direction)
    {
        if (direction == IN || direction == OUT)
        {
            this.setSwing(direction);
            return true;
        }
        else
        {
            return false;
        }
    }

    // method that closes the gate
    public void close()
    {
        mSwing = 0;
    }

    // Getter method
    public int getSwingDirection()
    {
        return mSwing;
    }

    // method that performs passing through the gate
    public int thru(int count)
    {
        if (mSwing == IN)
        {
            return count;
        }
        else if (mSwing == OUT)
        {
            return -count;
        }
        else
        {
            return 0;
        }
    }

    // Overriding the toString method
    public String toString()
    {
        if (mSwing == 0)
        {
            return "This gate is closed";
        }
        else if (mSwing == IN)
        {
            return "This gate is open and swings to enter the pen only";
        }
        else if (mSwing == OUT)
        {
            return "This gate is open and swings to exit the pen only";
        }
        else
        {
            return "This gate has an invalid swing direction";
        }
    }
}
