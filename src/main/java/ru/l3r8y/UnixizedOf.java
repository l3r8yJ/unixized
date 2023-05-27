/*
 * MIT License
 *
 * Copyright (c) 2023 Ivanchuk Ivan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ru.l3r8y;

import java.io.File;
import java.io.InputStream;
import org.cactoos.Input;
import org.cactoos.io.InputOf;

/**
 * Bunch of ctors for default impl.
 *
 * @since 0.0.0
 */
public class UnixizedOf extends UnixizedEnvelope {

    /**
     * Char seq ctor.
     *
     * @param content Content to unixize.
     * @throws Exception When something went wrong
     */
    public UnixizedOf(final CharSequence content) throws Exception {
        this(new InputOf(content));
    }

    /**
     * File ctor.
     *
     * @param file File to unixize
     * @throws Exception When something went wrong
     */
    public UnixizedOf(final File file) throws Exception {
        this(new InputOf(file));
    }

    /**
     * Input ctor.
     *
     * @param input Input to unixize
     * @throws Exception When something went wrong
     */
    public UnixizedOf(final Input input) throws Exception {
        this(input.stream());
    }

    /**
     * Primary ctor.
     *
     * @param origin Original input
     */
    public UnixizedOf(final InputStream origin) {
        super(origin);
    }
}
