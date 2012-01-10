// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet103SetSlot extends Packet
{

    public int windowId;
    public int itemSlot;
    public ItemStack myItemStack;

    public Packet103SetSlot()
    {
    }

    public void processPacket(NetHandler nethandler)
    {
        nethandler.handleSetSlot(this);
    }

    public void readPacketData(DataInputStream datainputstream)
        throws IOException
    {
        windowId = datainputstream.readByte();
        itemSlot = datainputstream.readShort();
        myItemStack = func_40187_b(datainputstream);
    }

    public void writePacketData(DataOutputStream dataoutputstream)
        throws IOException
    {
        dataoutputstream.writeByte(windowId);
        dataoutputstream.writeShort(itemSlot);
        writeItemStack(myItemStack, dataoutputstream);
    }

    public int getPacketSize()
    {
        return 8;
    }
}
