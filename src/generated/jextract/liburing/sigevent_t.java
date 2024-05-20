// Generated by jextract

package jextract.liburing;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct sigevent {
 *     __sigval_t sigev_value;
 *     int sigev_signo;
 *     int sigev_notify;
 *     union {
 *         int _pad[12];
 *         __pid_t _tid;
 *         struct {
 *             void (*_function)(__sigval_t);
 *             pthread_attr_t *_attribute;
 *         } _sigev_thread;
 *     } _sigev_un;
 * } sigevent_t
 * }
 */
public class sigevent_t extends sigevent {

    sigevent_t() {
        // Should not be called directly
    }
}

