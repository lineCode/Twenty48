// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from twenty_forty_eight.djinni

package com.boloutaredoubeni.twenty48.djinni;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Player {
    public abstract void newGame();

    public abstract long score();

    public abstract boolean hasWon();

    public abstract ArrayList<Integer> gameState();

    public abstract boolean gameOver();

    /**
     * @param move the direction of movement
     * @return bool false if the move was unsuccessful
     */
    public abstract boolean swipe(Move move);

    public static native Player create();

    private static final class CppProxy extends Player
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public void newGame()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_newGame(this.nativeRef);
        }
        private native void native_newGame(long _nativeRef);

        @Override
        public long score()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_score(this.nativeRef);
        }
        private native long native_score(long _nativeRef);

        @Override
        public boolean hasWon()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_hasWon(this.nativeRef);
        }
        private native boolean native_hasWon(long _nativeRef);

        @Override
        public ArrayList<Integer> gameState()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_gameState(this.nativeRef);
        }
        private native ArrayList<Integer> native_gameState(long _nativeRef);

        @Override
        public boolean gameOver()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_gameOver(this.nativeRef);
        }
        private native boolean native_gameOver(long _nativeRef);

        @Override
        public boolean swipe(Move move)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_swipe(this.nativeRef, move);
        }
        private native boolean native_swipe(long _nativeRef, Move move);
    }
}