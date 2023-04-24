package r2;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    Cursor C0(e eVar, CancellationSignal cancellationSignal);

    void K();

    void M();

    Cursor U(String str);

    void Y();

    Cursor f0(e eVar);

    void i();

    boolean isOpen();

    Cursor m(String str, Object[] objArr);

    void o(String str);

    boolean r0();

    f t(String str);

    boolean v0();
}
