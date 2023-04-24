package un;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a */
    public Logger f28948a = null;

    /* renamed from: b */
    public ResourceBundle f28949b = null;

    /* renamed from: c */
    public ResourceBundle f28950c = null;

    /* renamed from: d */
    public String f28951d = null;

    /* renamed from: e */
    public String f28952e = null;

    public static Level j(int i10) {
        switch (i10) {
            case 1:
                return Level.SEVERE;
            case 2:
                return Level.WARNING;
            case 3:
                return Level.INFO;
            case 4:
                return Level.CONFIG;
            case 5:
                return Level.FINE;
            case 6:
                return Level.FINER;
            case 7:
                return Level.FINEST;
            default:
                return null;
        }
    }

    @Override // un.b
    public final void a() {
        k(6, qn.b.C, "<Init>", "", null, null);
    }

    @Override // un.b
    public final void b(String str, Object[] objArr) {
        String str2 = qn.b.C;
        Level j10 = j(1);
        if (this.f28948a.isLoggable(j10)) {
            i(j10, str2, "checkForActivity", this.f28949b, str, objArr, null);
        }
    }

    @Override // un.b
    public final void c(String str, String str2, String str3) {
        k(5, str, str2, str3, null, null);
    }

    @Override // un.b
    public final void d(String str) {
        this.f28951d = str;
    }

    @Override // un.b
    public final void e(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        k(5, str, str2, str3, objArr, th2);
    }

    @Override // un.b
    public final boolean f() {
        return this.f28948a.isLoggable(j(5));
    }

    @Override // un.b
    public final void g(String str, String str2, String str3, Object[] objArr) {
        k(5, str, str2, str3, objArr, null);
    }

    @Override // un.b
    public final void h(ResourceBundle resourceBundle, String str) {
        this.f28950c = this.f28949b;
        this.f28951d = null;
        this.f28952e = str;
        this.f28948a = Logger.getLogger(str);
        this.f28949b = resourceBundle;
        this.f28950c = resourceBundle;
        resourceBundle.getString("0");
    }

    public final void i(Level level, String str, String str2, ResourceBundle resourceBundle, String str3, Object[] objArr, Throwable th2) {
        if (str3.indexOf("=====") == -1) {
            try {
                str3 = resourceBundle.getString(str3);
            } catch (MissingResourceException unused) {
            }
            str3 = MessageFormat.format(str3, objArr);
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(this.f28951d));
        stringBuffer.append(": ");
        stringBuffer.append(str3);
        LogRecord logRecord = new LogRecord(level, stringBuffer.toString());
        logRecord.setSourceClassName(str);
        logRecord.setSourceMethodName(str2);
        logRecord.setLoggerName(this.f28952e);
        if (th2 != null) {
            logRecord.setThrown(th2);
        }
        this.f28948a.log(logRecord);
    }

    public final void k(int i10, String str, String str2, String str3, Object[] objArr, Throwable th2) {
        Level j10 = j(i10);
        if (this.f28948a.isLoggable(j10)) {
            i(j10, str, str2, this.f28950c, str3, objArr, th2);
        }
    }
}
