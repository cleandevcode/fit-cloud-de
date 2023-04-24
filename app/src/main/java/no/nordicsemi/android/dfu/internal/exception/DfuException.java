package no.nordicsemi.android.dfu.internal.exception;

import a0.q;

/* loaded from: classes2.dex */
public class DfuException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public DfuException(String str, int i10) {
        super(str);
        this.mError = i10;
    }

    public int getErrorNumber() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(" (error ");
        return q.b(sb2, this.mError & (-16385), ")");
    }
}
