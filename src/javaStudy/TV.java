package javaStudy;

public interface TV{
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;

    public void on();
    public void off();
    public void volume(int volume);
    public void channel(int channel);
}