/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2016 Bertrand Martel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.android.tictactoe.datamodel;

/**
 * @author Bertrand Martel
 */
public enum GameMessageTopic {

    NONE(0),
    CHALLENGED(1),
    ACCEPTED(2),
    DECLINED(3),
    GAME_STOPPED(4),
    PLAY(5),
    CLIENT_CONNECTED(6);

    private final int value;

    private GameMessageTopic(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static GameMessageTopic getTopic(int value) {

        switch (value) {
            case 0:
                return NONE;
            case 1:
                return CHALLENGED;
            case 2:
                return ACCEPTED;
            case 3:
                return DECLINED;
            case 4:
                return GAME_STOPPED;
            case 5:
                return PLAY;
            case 6:
                return CLIENT_CONNECTED;
        }
        return NONE;
    }
}
