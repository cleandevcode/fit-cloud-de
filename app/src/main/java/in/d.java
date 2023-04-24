package in;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a */
    public static final d f17209a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int min;
        gm.l.f(logRecord, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f17207a;
        String loggerName = logRecord.getLoggerName();
        gm.l.e(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = logRecord.getMessage();
        gm.l.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = c.f17208b.get(loggerName);
        if (str == null) {
            int i11 = 23;
            int length = loggerName.length();
            if (23 > length) {
                i11 = length;
            }
            str = loggerName.substring(0, i11);
            gm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                StringBuilder a10 = p.a.a(message, "\n");
                a10.append(Log.getStackTraceString(thrown));
                message = a10.toString();
            }
            int length2 = message.length();
            int i12 = 0;
            while (i12 < length2) {
                int g02 = om.l.g0(message, '\n', i12, false, 4);
                if (g02 == -1) {
                    g02 = length2;
                }
                while (true) {
                    min = Math.min(g02, i12 + 4000);
                    String substring = message.substring(i12, min);
                    gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= g02) {
                        break;
                    }
                    i12 = min;
                }
                i12 = min + 1;
            }
        }
    }
}
