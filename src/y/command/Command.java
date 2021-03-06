/*
 * Created on 2004-7-18
 * Author: y&y, Copyright (C) 2004, y&y.
 */
package y.command;

/**
 * Command interface.
 * 
 * @author y&y
 */
public interface Command {

    /**
     * Execute this command. If succeeded (return TRUE), the 
     * CommandManager will put this command into command list 
     * if this command can support undo. 
     * 
     * @return True if the command executed succussfully.
     */
    boolean execute();

    /**
     * Undo this command. This is used to implement "Undo"
     */
    void unexecute();

    /**
     * If this command can support undo. Some commands not support 
     * undo such as CopyCommand, PastCommand. 
     * 
     * @return True if this command can undo.
     */
    boolean canUndo();

    /**
     * Get the command detail. 
     * 
     * @return The command description.
     */
    String toString();
}
