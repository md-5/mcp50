// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public interface IProgressUpdate
{

    public abstract void displaySavingString(String s);

    public abstract void displayLoadingString(String s);

    public abstract void setLoadingProgress(int i);
}
