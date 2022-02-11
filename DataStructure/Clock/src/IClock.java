public interface IClock {
    /***********************************************************
     *  Accessor method to get current hour of the clock.
     * @param - none
     * @return
     *  the current hour should be returned
     ***********************************************************/
    public int getHours();

    /***********************************************************
     *  Accessor method to get current minute of the clock.
     * @param - none
     * @return
     *  the current minute should be returned
     ***********************************************************/
    public int getMinute();

    /***********************************************************
     *  Accessor method to get current second of the clock.
     * @param - none
     * @return
     *  the current second should be returned
     ***********************************************************/
    public int getSecond();

    /***********************************************************
     *  The method should increment second by one every time it's called
     * @param - none
     * @return - none
     ***********************************************************/
    public void tick();

    /***********************************************************
     *  The method should increment second by passing integer every time it's called.
     * @param numSecs
     *      the seconds for the clock
     * @return
     *      The incremented second with the passed parameter
     ***********************************************************/
    public void tickAhead(int numSecs);
}
