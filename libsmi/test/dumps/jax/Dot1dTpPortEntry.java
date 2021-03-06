/*
 * This Java file has been generated by smidump 0.5.0. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the table row dot1dTpPortEntry defined in BRIDGE-MIB.

    @version 1
    @author  smidump 0.5.0
    @see     AgentXTable, AgentXEntry
 */

import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXEntry;

public class Dot1dTpPortEntry extends AgentXEntry
{

    protected int dot1dTpPort = 0;
    protected int dot1dTpPortMaxInfo = 0;
    protected long dot1dTpPortInFrames = 0;
    protected long dot1dTpPortOutFrames = 0;
    protected long dot1dTpPortInDiscards = 0;

    public Dot1dTpPortEntry(int dot1dTpPort)
    {
        this.dot1dTpPort = dot1dTpPort;

        instance.append(dot1dTpPort);
    }

    public int get_dot1dTpPort()
    {
        return dot1dTpPort;
    }

    public int get_dot1dTpPortMaxInfo()
    {
        return dot1dTpPortMaxInfo;
    }

    public long get_dot1dTpPortInFrames()
    {
        return dot1dTpPortInFrames;
    }

    public long get_dot1dTpPortOutFrames()
    {
        return dot1dTpPortOutFrames;
    }

    public long get_dot1dTpPortInDiscards()
    {
        return dot1dTpPortInDiscards;
    }

}

